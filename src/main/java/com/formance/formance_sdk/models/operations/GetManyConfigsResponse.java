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


public class GetManyConfigsResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * OK
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.ConfigsResponse> configsResponse;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

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
    private Optional<? extends com.formance.formance_sdk.models.errors.WebhooksErrorResponse> webhooksErrorResponse;

    public GetManyConfigsResponse(
            Optional<? extends com.formance.formance_sdk.models.shared.ConfigsResponse> configsResponse,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.errors.WebhooksErrorResponse> webhooksErrorResponse) {
        Utils.checkNotNull(configsResponse, "configsResponse");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(webhooksErrorResponse, "webhooksErrorResponse");
        this.configsResponse = configsResponse;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.webhooksErrorResponse = webhooksErrorResponse;
    }

    /**
     * OK
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.ConfigsResponse> configsResponse() {
        return configsResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
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
    public Optional<? extends com.formance.formance_sdk.models.errors.WebhooksErrorResponse> webhooksErrorResponse() {
        return webhooksErrorResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * OK
     */
    public GetManyConfigsResponse withConfigsResponse(com.formance.formance_sdk.models.shared.ConfigsResponse configsResponse) {
        Utils.checkNotNull(configsResponse, "configsResponse");
        this.configsResponse = Optional.ofNullable(configsResponse);
        return this;
    }

    /**
     * OK
     */
    public GetManyConfigsResponse withConfigsResponse(Optional<? extends com.formance.formance_sdk.models.shared.ConfigsResponse> configsResponse) {
        Utils.checkNotNull(configsResponse, "configsResponse");
        this.configsResponse = configsResponse;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetManyConfigsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetManyConfigsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetManyConfigsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Error
     */
    public GetManyConfigsResponse withWebhooksErrorResponse(com.formance.formance_sdk.models.errors.WebhooksErrorResponse webhooksErrorResponse) {
        Utils.checkNotNull(webhooksErrorResponse, "webhooksErrorResponse");
        this.webhooksErrorResponse = Optional.ofNullable(webhooksErrorResponse);
        return this;
    }

    /**
     * Error
     */
    public GetManyConfigsResponse withWebhooksErrorResponse(Optional<? extends com.formance.formance_sdk.models.errors.WebhooksErrorResponse> webhooksErrorResponse) {
        Utils.checkNotNull(webhooksErrorResponse, "webhooksErrorResponse");
        this.webhooksErrorResponse = webhooksErrorResponse;
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
        GetManyConfigsResponse other = (GetManyConfigsResponse) o;
        return 
            java.util.Objects.deepEquals(this.configsResponse, other.configsResponse) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.webhooksErrorResponse, other.webhooksErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            configsResponse,
            contentType,
            statusCode,
            rawResponse,
            webhooksErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetManyConfigsResponse.class,
                "configsResponse", configsResponse,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "webhooksErrorResponse", webhooksErrorResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.formance.formance_sdk.models.shared.ConfigsResponse> configsResponse = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.errors.WebhooksErrorResponse> webhooksErrorResponse = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder configsResponse(com.formance.formance_sdk.models.shared.ConfigsResponse configsResponse) {
            Utils.checkNotNull(configsResponse, "configsResponse");
            this.configsResponse = Optional.ofNullable(configsResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder configsResponse(Optional<? extends com.formance.formance_sdk.models.shared.ConfigsResponse> configsResponse) {
            Utils.checkNotNull(configsResponse, "configsResponse");
            this.configsResponse = configsResponse;
            return this;
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
        public Builder webhooksErrorResponse(com.formance.formance_sdk.models.errors.WebhooksErrorResponse webhooksErrorResponse) {
            Utils.checkNotNull(webhooksErrorResponse, "webhooksErrorResponse");
            this.webhooksErrorResponse = Optional.ofNullable(webhooksErrorResponse);
            return this;
        }

        /**
         * Error
         */
        public Builder webhooksErrorResponse(Optional<? extends com.formance.formance_sdk.models.errors.WebhooksErrorResponse> webhooksErrorResponse) {
            Utils.checkNotNull(webhooksErrorResponse, "webhooksErrorResponse");
            this.webhooksErrorResponse = webhooksErrorResponse;
            return this;
        }
        
        public GetManyConfigsResponse build() {
            return new GetManyConfigsResponse(
                configsResponse,
                contentType,
                statusCode,
                rawResponse,
                webhooksErrorResponse);
        }
    }
}
