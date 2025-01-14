/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.openapitools.jackson.nullable.JsonNullable;

public class AddMetadataOnTransactionRequest {

    /**
     * metadata
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private JsonNullable<? extends java.util.Map<String, java.lang.Object>> requestBody;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    /**
     * Transaction ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=txid")
    private BigInteger txid;

    @JsonCreator
    public AddMetadataOnTransactionRequest(
            JsonNullable<? extends java.util.Map<String, java.lang.Object>> requestBody,
            String ledger,
            BigInteger txid) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(txid, "txid");
        this.requestBody = requestBody;
        this.ledger = ledger;
        this.txid = txid;
    }
    
    public AddMetadataOnTransactionRequest(
            String ledger,
            BigInteger txid) {
        this(JsonNullable.undefined(), ledger, txid);
    }

    /**
     * metadata
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<java.util.Map<String, java.lang.Object>> requestBody() {
        return (JsonNullable<java.util.Map<String, java.lang.Object>>) requestBody;
    }

    /**
     * Name of the ledger.
     */
    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    /**
     * Transaction ID.
     */
    @JsonIgnore
    public BigInteger txid() {
        return txid;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * metadata
     */
    public AddMetadataOnTransactionRequest withRequestBody(java.util.Map<String, java.lang.Object> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = JsonNullable.of(requestBody);
        return this;
    }

    /**
     * metadata
     */
    public AddMetadataOnTransactionRequest withRequestBody(JsonNullable<? extends java.util.Map<String, java.lang.Object>> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public AddMetadataOnTransactionRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

        /**
         * Transaction ID.
         */
    public AddMetadataOnTransactionRequest withTxid(long txid) {
        this.txid = BigInteger.valueOf(txid);
        return this;
    }

    /**
     * Transaction ID.
     */
    public AddMetadataOnTransactionRequest withTxid(BigInteger txid) {
        Utils.checkNotNull(txid, "txid");
        this.txid = txid;
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
        AddMetadataOnTransactionRequest other = (AddMetadataOnTransactionRequest) o;
        return 
            java.util.Objects.deepEquals(this.requestBody, other.requestBody) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger) &&
            java.util.Objects.deepEquals(this.txid, other.txid);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            requestBody,
            ledger,
            txid);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AddMetadataOnTransactionRequest.class,
                "requestBody", requestBody,
                "ledger", ledger,
                "txid", txid);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends java.util.Map<String, java.lang.Object>> requestBody = JsonNullable.undefined();
 
        private String ledger;
 
        private BigInteger txid;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * metadata
         */
        public Builder requestBody(java.util.Map<String, java.lang.Object> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = JsonNullable.of(requestBody);
            return this;
        }

        /**
         * metadata
         */
        public Builder requestBody(JsonNullable<? extends java.util.Map<String, java.lang.Object>> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        /**
         * Name of the ledger.
         */
        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }

        /**
         * Transaction ID.
         */
        public Builder txid(long txid) {
            this.txid = BigInteger.valueOf(txid);
            return this;
        }

        /**
         * Transaction ID.
         */
        public Builder txid(BigInteger txid) {
            Utils.checkNotNull(txid, "txid");
            this.txid = txid;
            return this;
        }
        
        public AddMetadataOnTransactionRequest build() {
            return new AddMetadataOnTransactionRequest(
                requestBody,
                ledger,
                txid);
        }
    }
}

