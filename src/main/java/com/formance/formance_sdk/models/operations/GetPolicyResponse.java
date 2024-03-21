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


public class GetPolicyResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.PolicyResponse> policyResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Error response
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationErrorResponse> reconciliationErrorResponse;

    public GetPolicyResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.PolicyResponse> policyResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationErrorResponse> reconciliationErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(policyResponse, "policyResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(reconciliationErrorResponse, "reconciliationErrorResponse");
        this.contentType = contentType;
        this.policyResponse = policyResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.reconciliationErrorResponse = reconciliationErrorResponse;
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
    public Optional<? extends com.formance.formance_sdk.models.shared.PolicyResponse> policyResponse() {
        return policyResponse;
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
     * Error response
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationErrorResponse> reconciliationErrorResponse() {
        return reconciliationErrorResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetPolicyResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public GetPolicyResponse withPolicyResponse(com.formance.formance_sdk.models.shared.PolicyResponse policyResponse) {
        Utils.checkNotNull(policyResponse, "policyResponse");
        this.policyResponse = Optional.ofNullable(policyResponse);
        return this;
    }

    /**
     * OK
     */
    public GetPolicyResponse withPolicyResponse(Optional<? extends com.formance.formance_sdk.models.shared.PolicyResponse> policyResponse) {
        Utils.checkNotNull(policyResponse, "policyResponse");
        this.policyResponse = policyResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetPolicyResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetPolicyResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Error response
     */
    public GetPolicyResponse withReconciliationErrorResponse(com.formance.formance_sdk.models.shared.ReconciliationErrorResponse reconciliationErrorResponse) {
        Utils.checkNotNull(reconciliationErrorResponse, "reconciliationErrorResponse");
        this.reconciliationErrorResponse = Optional.ofNullable(reconciliationErrorResponse);
        return this;
    }

    /**
     * Error response
     */
    public GetPolicyResponse withReconciliationErrorResponse(Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationErrorResponse> reconciliationErrorResponse) {
        Utils.checkNotNull(reconciliationErrorResponse, "reconciliationErrorResponse");
        this.reconciliationErrorResponse = reconciliationErrorResponse;
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
        GetPolicyResponse other = (GetPolicyResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.policyResponse, other.policyResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.reconciliationErrorResponse, other.reconciliationErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            policyResponse,
            statusCode,
            rawResponse,
            reconciliationErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetPolicyResponse.class,
                "contentType", contentType,
                "policyResponse", policyResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "reconciliationErrorResponse", reconciliationErrorResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.PolicyResponse> policyResponse = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationErrorResponse> reconciliationErrorResponse = Optional.empty();  
        
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
        public Builder policyResponse(com.formance.formance_sdk.models.shared.PolicyResponse policyResponse) {
            Utils.checkNotNull(policyResponse, "policyResponse");
            this.policyResponse = Optional.ofNullable(policyResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder policyResponse(Optional<? extends com.formance.formance_sdk.models.shared.PolicyResponse> policyResponse) {
            Utils.checkNotNull(policyResponse, "policyResponse");
            this.policyResponse = policyResponse;
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
         * Error response
         */
        public Builder reconciliationErrorResponse(com.formance.formance_sdk.models.shared.ReconciliationErrorResponse reconciliationErrorResponse) {
            Utils.checkNotNull(reconciliationErrorResponse, "reconciliationErrorResponse");
            this.reconciliationErrorResponse = Optional.ofNullable(reconciliationErrorResponse);
            return this;
        }

        /**
         * Error response
         */
        public Builder reconciliationErrorResponse(Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationErrorResponse> reconciliationErrorResponse) {
            Utils.checkNotNull(reconciliationErrorResponse, "reconciliationErrorResponse");
            this.reconciliationErrorResponse = reconciliationErrorResponse;
            return this;
        }
        
        public GetPolicyResponse build() {
            return new GetPolicyResponse(
                contentType,
                policyResponse,
                statusCode,
                rawResponse,
                reconciliationErrorResponse);
        }
    }
}
