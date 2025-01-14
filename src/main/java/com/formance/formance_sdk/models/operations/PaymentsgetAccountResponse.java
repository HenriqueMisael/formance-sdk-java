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

public class PaymentsgetAccountResponse implements com.formance.formance_sdk.utils.Response {

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
     * OK
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.PaymentsAccountResponse> paymentsAccountResponse;

    @JsonCreator
    public PaymentsgetAccountResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.PaymentsAccountResponse> paymentsAccountResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(paymentsAccountResponse, "paymentsAccountResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.paymentsAccountResponse = paymentsAccountResponse;
    }
    
    public PaymentsgetAccountResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
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

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.PaymentsAccountResponse> paymentsAccountResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.PaymentsAccountResponse>) paymentsAccountResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public PaymentsgetAccountResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public PaymentsgetAccountResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public PaymentsgetAccountResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public PaymentsgetAccountResponse withPaymentsAccountResponse(com.formance.formance_sdk.models.shared.PaymentsAccountResponse paymentsAccountResponse) {
        Utils.checkNotNull(paymentsAccountResponse, "paymentsAccountResponse");
        this.paymentsAccountResponse = Optional.ofNullable(paymentsAccountResponse);
        return this;
    }

    /**
     * OK
     */
    public PaymentsgetAccountResponse withPaymentsAccountResponse(Optional<? extends com.formance.formance_sdk.models.shared.PaymentsAccountResponse> paymentsAccountResponse) {
        Utils.checkNotNull(paymentsAccountResponse, "paymentsAccountResponse");
        this.paymentsAccountResponse = paymentsAccountResponse;
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
        PaymentsgetAccountResponse other = (PaymentsgetAccountResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.paymentsAccountResponse, other.paymentsAccountResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            paymentsAccountResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentsgetAccountResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "paymentsAccountResponse", paymentsAccountResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.PaymentsAccountResponse> paymentsAccountResponse = Optional.empty();  
        
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
         * OK
         */
        public Builder paymentsAccountResponse(com.formance.formance_sdk.models.shared.PaymentsAccountResponse paymentsAccountResponse) {
            Utils.checkNotNull(paymentsAccountResponse, "paymentsAccountResponse");
            this.paymentsAccountResponse = Optional.ofNullable(paymentsAccountResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder paymentsAccountResponse(Optional<? extends com.formance.formance_sdk.models.shared.PaymentsAccountResponse> paymentsAccountResponse) {
            Utils.checkNotNull(paymentsAccountResponse, "paymentsAccountResponse");
            this.paymentsAccountResponse = paymentsAccountResponse;
            return this;
        }
        
        public PaymentsgetAccountResponse build() {
            return new PaymentsgetAccountResponse(
                contentType,
                statusCode,
                rawResponse,
                paymentsAccountResponse);
        }
    }
}

