/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;

/**
 * V2ErrorResponse - Error
 */
public class V2ErrorResponse extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    private Optional<? extends String> details;

    @JsonProperty("errorCode")
    private com.formance.formance_sdk.models.shared.V2ErrorsEnum errorCode;

    @JsonProperty("errorMessage")
    private String errorMessage;

    @JsonCreator
    public V2ErrorResponse(
            @JsonProperty("details") Optional<? extends String> details,
            @JsonProperty("errorCode") com.formance.formance_sdk.models.shared.V2ErrorsEnum errorCode,
            @JsonProperty("errorMessage") String errorMessage) {
        Utils.checkNotNull(details, "details");
        Utils.checkNotNull(errorCode, "errorCode");
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.details = details;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
    
    public V2ErrorResponse(
            com.formance.formance_sdk.models.shared.V2ErrorsEnum errorCode,
            String errorMessage) {
        this(Optional.empty(), errorCode, errorMessage);
    }

    public Optional<? extends String> details(){
        return details;
    }

    public com.formance.formance_sdk.models.shared.V2ErrorsEnum errorCode(){
        return errorCode;
    }

    public String errorMessage(){
        return errorMessage;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public V2ErrorResponse withDetails(String details) {
        Utils.checkNotNull(details, "details");
        this.details = Optional.ofNullable(details);
        return this;
    }
    
    public V2ErrorResponse withDetails(Optional<? extends String> details) {
        Utils.checkNotNull(details, "details");
        this.details = details;
        return this;
    }

    public V2ErrorResponse withErrorCode(com.formance.formance_sdk.models.shared.V2ErrorsEnum errorCode) {
        Utils.checkNotNull(errorCode, "errorCode");
        this.errorCode = errorCode;
        return this;
    }

    public V2ErrorResponse withErrorMessage(String errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
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
        V2ErrorResponse other = (V2ErrorResponse) o;
        return
            java.util.Objects.deepEquals(this.details, other.details) &&
            java.util.Objects.deepEquals(this.errorCode, other.errorCode) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            details,
            errorCode,
            errorMessage);
    }

    @Override
    public String toString() {
        return Utils.toString(V2ErrorResponse.class,
                "details", details,
                "errorCode", errorCode,
                "errorMessage", errorMessage);
    }

    public final static class Builder {

        private Optional<? extends String> details = Optional.empty();

        private com.formance.formance_sdk.models.shared.V2ErrorsEnum errorCode;

        private String errorMessage;

        private Builder() {
          // force use of static builder() method
        }

        public Builder details(String details) {
            Utils.checkNotNull(details, "details");
            this.details = Optional.ofNullable(details);
            return this;
        }
        
        public Builder details(Optional<? extends String> details) {
            Utils.checkNotNull(details, "details");
            this.details = details;
            return this;
        }

        public Builder errorCode(com.formance.formance_sdk.models.shared.V2ErrorsEnum errorCode) {
            Utils.checkNotNull(errorCode, "errorCode");
            this.errorCode = errorCode;
            return this;
        }

        public Builder errorMessage(String errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            return this;
        }

        public V2ErrorResponse build() {
            return new V2ErrorResponse(
                details,
                errorCode,
                errorMessage);
        }
    }
}
