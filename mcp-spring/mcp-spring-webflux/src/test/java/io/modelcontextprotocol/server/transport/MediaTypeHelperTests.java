/*
 * Copyright 2024-2025 the original author or authors.
 */

package io.modelcontextprotocol.server.transport;

import java.util.List;

import org.junit.jupiter.api.Test;

import org.springframework.http.MediaType;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link MediaTypeHelper}.
 *
 * @author Yanming Zhou
 */
class MediaTypeHelperTests {

	@Test
	void testMatches() {
		assertThat(MediaTypeHelper.matches(List.of(MediaType.APPLICATION_JSON), MediaType.APPLICATION_JSON)).isTrue();
		assertThat(MediaTypeHelper.matches(List.of(MediaType.ALL), MediaType.APPLICATION_JSON)).isTrue();
		assertThat(MediaTypeHelper.matches(List.of(MediaType.ALL), MediaType.APPLICATION_JSON,
				MediaType.TEXT_EVENT_STREAM))
			.isTrue();
		assertThat(MediaTypeHelper.matches(List.of(MediaType.APPLICATION_JSON), MediaType.TEXT_EVENT_STREAM)).isFalse();
		assertThat(MediaTypeHelper.matches(List.of(MediaType.APPLICATION_JSON), MediaType.APPLICATION_JSON,
				MediaType.TEXT_EVENT_STREAM))
			.isFalse();
	}

}
