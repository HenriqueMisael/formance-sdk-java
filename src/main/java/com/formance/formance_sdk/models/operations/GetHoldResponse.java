/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class GetHoldResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Holds
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.GetHoldResponse> getHoldResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Error
     */
    private Optional<? extends com.formance.formance_sdk.models.errors.WalletsErrorResponse> walletsErrorResponse;

    public GetHoldResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.GetHoldResponse> getHoldResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.errors.WalletsErrorResponse> walletsErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(getHoldResponse, "getHoldResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(walletsErrorResponse, "walletsErrorResponse");
        this.contentType = contentType;
        this.getHoldResponse = getHoldResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.walletsErrorResponse = walletsErrorResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * Holds
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.GetHoldResponse> getHoldResponse() {
        return getHoldResponse;
    }

    /**
     * HTTP response status code for this operation
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Error
     */
    public Optional<? extends com.formance.formance_sdk.models.errors.WalletsErrorResponse> walletsErrorResponse() {
        return walletsErrorResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetHoldResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Holds
     */
    public GetHoldResponse withGetHoldResponse(com.formance.formance_sdk.models.shared.GetHoldResponse getHoldResponse) {
        Utils.checkNotNull(getHoldResponse, "getHoldResponse");
        this.getHoldResponse = Optional.ofNullable(getHoldResponse);
        return this;
    }

    /**
     * Holds
     */
    public GetHoldResponse withGetHoldResponse(Optional<? extends com.formance.formance_sdk.models.shared.GetHoldResponse> getHoldResponse) {
        Utils.checkNotNull(getHoldResponse, "getHoldResponse");
        this.getHoldResponse = getHoldResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetHoldResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetHoldResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Error
     */
    public GetHoldResponse withWalletsErrorResponse(com.formance.formance_sdk.models.errors.WalletsErrorResponse walletsErrorResponse) {
        Utils.checkNotNull(walletsErrorResponse, "walletsErrorResponse");
        this.walletsErrorResponse = Optional.ofNullable(walletsErrorResponse);
        return this;
    }

    /**
     * Error
     */
    public GetHoldResponse withWalletsErrorResponse(Optional<? extends com.formance.formance_sdk.models.errors.WalletsErrorResponse> walletsErrorResponse) {
        Utils.checkNotNull(walletsErrorResponse, "walletsErrorResponse");
        this.walletsErrorResponse = walletsErrorResponse;
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
        GetHoldResponse other = (GetHoldResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.getHoldResponse, other.getHoldResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.walletsErrorResponse, other.walletsErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            getHoldResponse,
            statusCode,
            rawResponse,
            walletsErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetHoldResponse.class,
                "contentType", contentType,
                "getHoldResponse", getHoldResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "walletsErrorResponse", walletsErrorResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.GetHoldResponse> getHoldResponse = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.errors.WalletsErrorResponse> walletsErrorResponse = Optional.empty();  
        
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
         * Holds
         */
        public Builder getHoldResponse(com.formance.formance_sdk.models.shared.GetHoldResponse getHoldResponse) {
            Utils.checkNotNull(getHoldResponse, "getHoldResponse");
            this.getHoldResponse = Optional.ofNullable(getHoldResponse);
            return this;
        }

        /**
         * Holds
         */
        public Builder getHoldResponse(Optional<? extends com.formance.formance_sdk.models.shared.GetHoldResponse> getHoldResponse) {
            Utils.checkNotNull(getHoldResponse, "getHoldResponse");
            this.getHoldResponse = getHoldResponse;
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

        /**
         * Error
         */
        public Builder walletsErrorResponse(com.formance.formance_sdk.models.errors.WalletsErrorResponse walletsErrorResponse) {
            Utils.checkNotNull(walletsErrorResponse, "walletsErrorResponse");
            this.walletsErrorResponse = Optional.ofNullable(walletsErrorResponse);
            return this;
        }

        /**
         * Error
         */
        public Builder walletsErrorResponse(Optional<? extends com.formance.formance_sdk.models.errors.WalletsErrorResponse> walletsErrorResponse) {
            Utils.checkNotNull(walletsErrorResponse, "walletsErrorResponse");
            this.walletsErrorResponse = walletsErrorResponse;
            return this;
        }
        
        public GetHoldResponse build() {
            return new GetHoldResponse(
                contentType,
                getHoldResponse,
                statusCode,
                rawResponse,
                walletsErrorResponse);
        }
    }
}
