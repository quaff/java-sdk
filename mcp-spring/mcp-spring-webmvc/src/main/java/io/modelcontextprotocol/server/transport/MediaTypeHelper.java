/*
 * Copyright 2024-2025 the original author or authors.
 */

package io.modelcontextprotocol.server.transport;

import org.springframework.http.MediaType;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Util class for {@link MediaType} matching.
 *
 * @author Yanming Zhou
 */
final class MediaTypeHelper {

	/**
	 * Test whether gaving MediaTypes match {@code Accept} header from HTTP request.
	 * @param acceptMediaTypes MediaTypes to accept
	 * @param matchingMediaTypes MediaTypes to match
	 * @return true if all matching MediaTypes are matched
	 */
	static boolean matches(List<MediaType> acceptMediaTypes, MediaType... matchingMediaTypes) {
		if (CollectionUtils.isEmpty(acceptMediaTypes) || matchingMediaTypes.length == 0) {
			return false;
		}
		for (MediaType matchingMediaType : matchingMediaTypes) {
			boolean matched = false;
			for (MediaType acceptMediaType : acceptMediaTypes) {
				if (matchingMediaType.isCompatibleWith(acceptMediaType)) {
					matched = true;
					break;
				}
			}
			if (!matched) {
				return false;
			}
		}
		return true;
	}

}
