/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;

/**
 * Error - General error
 */
public class Error extends RuntimeException {

    @JsonProperty("errorCode")
    private ErrorCode errorCode;

    @JsonProperty("errorMessage")
    private String errorMessage;

    @JsonCreator
    public Error(
            @JsonProperty("errorCode") ErrorCode errorCode,
            @JsonProperty("errorMessage") String errorMessage) {
        Utils.checkNotNull(errorCode, "errorCode");
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public ErrorCode errorCode(){
        return errorCode;
    }

    public String errorMessage(){
        return errorMessage;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public Error withErrorCode(ErrorCode errorCode) {
        Utils.checkNotNull(errorCode, "errorCode");
        this.errorCode = errorCode;
        return this;
    }

    public Error withErrorMessage(String errorMessage) {
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
        Error other = (Error) o;
        return
            java.util.Objects.deepEquals(this.errorCode, other.errorCode) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            errorCode,
            errorMessage);
    }

    @Override
    public String toString() {
        return Utils.toString(Error.class,
                "errorCode", errorCode,
                "errorMessage", errorMessage);
    }

    public final static class Builder {

        private ErrorCode errorCode;

        private String errorMessage;

        private Builder() {
          // force use of static builder() method
        }

        public Builder errorCode(ErrorCode errorCode) {
            Utils.checkNotNull(errorCode, "errorCode");
            this.errorCode = errorCode;
            return this;
        }

        public Builder errorMessage(String errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            return this;
        }

        public Error build() {
            return new Error(
                errorCode,
                errorMessage);
        }
    }
}
