/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.bulkexports.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Export extends Resource {
    private static final long serialVersionUID = 249832685506996L;

    /**
     * Create a ExportFetcher to execute fetch.
     *
     * @param pathResourceType The type of communication – Messages, Calls
     * @return ExportFetcher capable of executing the fetch
     */
    public static ExportFetcher fetcher(final String pathResourceType) {
        return new ExportFetcher(pathResourceType);
    }

    /**
     * Converts a JSON String into a Export object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Export object represented by the provided JSON
     */
    public static Export fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Export.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Export object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Export object represented by the provided JSON
     */
    public static Export fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Export.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String resourceType;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Export(@JsonProperty("resource_type")
                   final String resourceType,
                   @JsonProperty("url")
                   final URI url,
                   @JsonProperty("links")
                   final Map<String, String> links) {
        this.resourceType = resourceType;
        this.url = url;
        this.links = links;
    }

    /**
     * Returns The type of communication – Messages, Calls.
     *
     * @return The type of communication – Messages, Calls
     */
    public final String getResourceType() {
        return this.resourceType;
    }

    /**
     * Returns The URL of this resource..
     *
     * @return The URL of this resource.
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns Nested resource URLs..
     *
     * @return Nested resource URLs.
     */
    public final Map<String, String> getLinks() {
        return this.links;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Export other = (Export) o;

        return Objects.equals(resourceType, other.resourceType) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType,
                            url,
                            links);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("resourceType", resourceType)
                          .add("url", url)
                          .add("links", links)
                          .toString();
    }
}