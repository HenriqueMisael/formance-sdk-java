/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;

public class ListClientsResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * List of clients
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.ListClientsResponse> listClientsResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ListClientsResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.ListClientsResponse> listClientsResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(listClientsResponse, "listClientsResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.listClientsResponse = listClientsResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListClientsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * List of clients
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.ListClientsResponse> listClientsResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.ListClientsResponse>) listClientsResponse;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ListClientsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * List of clients
     */
    public ListClientsResponse withListClientsResponse(com.formance.formance_sdk.models.shared.ListClientsResponse listClientsResponse) {
        Utils.checkNotNull(listClientsResponse, "listClientsResponse");
        this.listClientsResponse = Optional.ofNullable(listClientsResponse);
        return this;
    }

    /**
     * List of clients
     */
    public ListClientsResponse withListClientsResponse(Optional<? extends com.formance.formance_sdk.models.shared.ListClientsResponse> listClientsResponse) {
        Utils.checkNotNull(listClientsResponse, "listClientsResponse");
        this.listClientsResponse = listClientsResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListClientsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListClientsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListClientsResponse other = (ListClientsResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.listClientsResponse, other.listClientsResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            listClientsResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListClientsResponse.class,
                "contentType", contentType,
                "listClientsResponse", listClientsResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.ListClientsResponse> listClientsResponse = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * List of clients
         */
        public Builder listClientsResponse(com.formance.formance_sdk.models.shared.ListClientsResponse listClientsResponse) {
            Utils.checkNotNull(listClientsResponse, "listClientsResponse");
            this.listClientsResponse = Optional.ofNullable(listClientsResponse);
            return this;
        }

        /**
         * List of clients
         */
        public Builder listClientsResponse(Optional<? extends com.formance.formance_sdk.models.shared.ListClientsResponse> listClientsResponse) {
            Utils.checkNotNull(listClientsResponse, "listClientsResponse");
            this.listClientsResponse = listClientsResponse;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }
        
        public ListClientsResponse build() {
            return new ListClientsResponse(
                contentType,
                listClientsResponse,
                statusCode,
                rawResponse);
        }
    }
}

