/*
 * Copyright 2024-2025 the original author or authors.
 */

package io.modelcontextprotocol.spec;

/**
 * Names of HTTP headers in use by MCP HTTP transports.
 *
 * @author Dariusz Jędrzejczyk
 * @author Yanming Zhou
 */
public interface HttpHeaders {

	/**
	 * Identifies individual MCP sessions.
	 */
	String MCP_SESSION_ID = "mcp-session-id";

	/**
	 * Identifies events within an SSE Stream.
	 */
	String LAST_EVENT_ID = "Last-Event-ID";

	/**
	 * Identifies the MCP protocol version.
	 */
	String PROTOCOL_VERSION = "MCP-Protocol-Version";

	/**
	 * Media type for {@code application/json}.
	 */
	String VALUE_APPLICATION_JSON = "application/json";

	/**
	 * Media type for {@code text/event-stream}.
	 * @see <a href=
	 * "https://html.spec.whatwg.org/multipage/server-sent-events.html">Server-Sent
	 * Events</a>
	 */
	String VALUE_TEXT_EVENT_STREAM = "text/event-stream";

}
