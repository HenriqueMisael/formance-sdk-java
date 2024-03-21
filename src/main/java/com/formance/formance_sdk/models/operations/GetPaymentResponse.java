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


public class GetPaymentResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.PaymentResponse> paymentResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public GetPaymentResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.PaymentResponse> paymentResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(paymentResponse, "paymentResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.paymentResponse = paymentResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * OK
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.PaymentResponse> paymentResponse() {
        return paymentResponse;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetPaymentResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public GetPaymentResponse withPaymentResponse(com.formance.formance_sdk.models.shared.PaymentResponse paymentResponse) {
        Utils.checkNotNull(paymentResponse, "paymentResponse");
        this.paymentResponse = Optional.ofNullable(paymentResponse);
        return this;
    }

    /**
     * OK
     */
    public GetPaymentResponse withPaymentResponse(Optional<? extends com.formance.formance_sdk.models.shared.PaymentResponse> paymentResponse) {
        Utils.checkNotNull(paymentResponse, "paymentResponse");
        this.paymentResponse = paymentResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetPaymentResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetPaymentResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetPaymentResponse other = (GetPaymentResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.paymentResponse, other.paymentResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            paymentResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetPaymentResponse.class,
                "contentType", contentType,
                "paymentResponse", paymentResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.PaymentResponse> paymentResponse = Optional.empty();
 
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
         * OK
         */
        public Builder paymentResponse(com.formance.formance_sdk.models.shared.PaymentResponse paymentResponse) {
            Utils.checkNotNull(paymentResponse, "paymentResponse");
            this.paymentResponse = Optional.ofNullable(paymentResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder paymentResponse(Optional<? extends com.formance.formance_sdk.models.shared.PaymentResponse> paymentResponse) {
            Utils.checkNotNull(paymentResponse, "paymentResponse");
            this.paymentResponse = paymentResponse;
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
        
        public GetPaymentResponse build() {
            return new GetPaymentResponse(
                contentType,
                paymentResponse,
                statusCode,
                rawResponse);
        }
    }
}
