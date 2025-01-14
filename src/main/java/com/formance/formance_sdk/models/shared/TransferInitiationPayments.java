/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;

public class TransferInitiationPayments {

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("error")
    private String error;

    @JsonProperty("paymentID")
    private String paymentID;

    @JsonProperty("status")
    private TransferInitiationStatus status;

    @JsonCreator
    public TransferInitiationPayments(
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("error") String error,
            @JsonProperty("paymentID") String paymentID,
            @JsonProperty("status") TransferInitiationStatus status) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(paymentID, "paymentID");
        Utils.checkNotNull(status, "status");
        this.createdAt = createdAt;
        this.error = error;
        this.paymentID = paymentID;
        this.status = status;
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public String error() {
        return error;
    }

    @JsonIgnore
    public String paymentID() {
        return paymentID;
    }

    @JsonIgnore
    public TransferInitiationStatus status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TransferInitiationPayments withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public TransferInitiationPayments withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    public TransferInitiationPayments withPaymentID(String paymentID) {
        Utils.checkNotNull(paymentID, "paymentID");
        this.paymentID = paymentID;
        return this;
    }

    public TransferInitiationPayments withStatus(TransferInitiationStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        TransferInitiationPayments other = (TransferInitiationPayments) o;
        return 
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.paymentID, other.paymentID) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            createdAt,
            error,
            paymentID,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TransferInitiationPayments.class,
                "createdAt", createdAt,
                "error", error,
                "paymentID", paymentID,
                "status", status);
    }
    
    public final static class Builder {
 
        private OffsetDateTime createdAt;
 
        private String error;
 
        private String paymentID;
 
        private TransferInitiationStatus status;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder error(String error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        public Builder paymentID(String paymentID) {
            Utils.checkNotNull(paymentID, "paymentID");
            this.paymentID = paymentID;
            return this;
        }

        public Builder status(TransferInitiationStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public TransferInitiationPayments build() {
            return new TransferInitiationPayments(
                createdAt,
                error,
                paymentID,
                status);
        }
    }
}

