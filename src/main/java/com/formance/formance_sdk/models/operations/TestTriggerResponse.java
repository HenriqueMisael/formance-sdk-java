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


public class TestTriggerResponse implements com.formance.formance_sdk.utils.Response {

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
     * General error
     */
    private Optional<? extends com.formance.formance_sdk.models.errors.V2Error> v2Error;

    /**
     * Test a trigger
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.V2TestTriggerResponse> v2TestTriggerResponse;

    public TestTriggerResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.errors.V2Error> v2Error,
            Optional<? extends com.formance.formance_sdk.models.shared.V2TestTriggerResponse> v2TestTriggerResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v2Error, "v2Error");
        Utils.checkNotNull(v2TestTriggerResponse, "v2TestTriggerResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v2Error = v2Error;
        this.v2TestTriggerResponse = v2TestTriggerResponse;
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
     * General error
     */
    public Optional<? extends com.formance.formance_sdk.models.errors.V2Error> v2Error() {
        return v2Error;
    }

    /**
     * Test a trigger
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.V2TestTriggerResponse> v2TestTriggerResponse() {
        return v2TestTriggerResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public TestTriggerResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public TestTriggerResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public TestTriggerResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * General error
     */
    public TestTriggerResponse withV2Error(com.formance.formance_sdk.models.errors.V2Error v2Error) {
        Utils.checkNotNull(v2Error, "v2Error");
        this.v2Error = Optional.ofNullable(v2Error);
        return this;
    }

    /**
     * General error
     */
    public TestTriggerResponse withV2Error(Optional<? extends com.formance.formance_sdk.models.errors.V2Error> v2Error) {
        Utils.checkNotNull(v2Error, "v2Error");
        this.v2Error = v2Error;
        return this;
    }

    /**
     * Test a trigger
     */
    public TestTriggerResponse withV2TestTriggerResponse(com.formance.formance_sdk.models.shared.V2TestTriggerResponse v2TestTriggerResponse) {
        Utils.checkNotNull(v2TestTriggerResponse, "v2TestTriggerResponse");
        this.v2TestTriggerResponse = Optional.ofNullable(v2TestTriggerResponse);
        return this;
    }

    /**
     * Test a trigger
     */
    public TestTriggerResponse withV2TestTriggerResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2TestTriggerResponse> v2TestTriggerResponse) {
        Utils.checkNotNull(v2TestTriggerResponse, "v2TestTriggerResponse");
        this.v2TestTriggerResponse = v2TestTriggerResponse;
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
        TestTriggerResponse other = (TestTriggerResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.v2Error, other.v2Error) &&
            java.util.Objects.deepEquals(this.v2TestTriggerResponse, other.v2TestTriggerResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v2Error,
            v2TestTriggerResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TestTriggerResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v2Error", v2Error,
                "v2TestTriggerResponse", v2TestTriggerResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.errors.V2Error> v2Error = Optional.empty();
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V2TestTriggerResponse> v2TestTriggerResponse = Optional.empty();  
        
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
         * General error
         */
        public Builder v2Error(com.formance.formance_sdk.models.errors.V2Error v2Error) {
            Utils.checkNotNull(v2Error, "v2Error");
            this.v2Error = Optional.ofNullable(v2Error);
            return this;
        }

        /**
         * General error
         */
        public Builder v2Error(Optional<? extends com.formance.formance_sdk.models.errors.V2Error> v2Error) {
            Utils.checkNotNull(v2Error, "v2Error");
            this.v2Error = v2Error;
            return this;
        }

        /**
         * Test a trigger
         */
        public Builder v2TestTriggerResponse(com.formance.formance_sdk.models.shared.V2TestTriggerResponse v2TestTriggerResponse) {
            Utils.checkNotNull(v2TestTriggerResponse, "v2TestTriggerResponse");
            this.v2TestTriggerResponse = Optional.ofNullable(v2TestTriggerResponse);
            return this;
        }

        /**
         * Test a trigger
         */
        public Builder v2TestTriggerResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2TestTriggerResponse> v2TestTriggerResponse) {
            Utils.checkNotNull(v2TestTriggerResponse, "v2TestTriggerResponse");
            this.v2TestTriggerResponse = v2TestTriggerResponse;
            return this;
        }
        
        public TestTriggerResponse build() {
            return new TestTriggerResponse(
                contentType,
                statusCode,
                rawResponse,
                v2Error,
                v2TestTriggerResponse);
        }
    }
}
