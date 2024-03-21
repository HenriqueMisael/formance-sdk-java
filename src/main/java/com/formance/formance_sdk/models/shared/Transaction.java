/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
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
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class Transaction {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private JsonNullable<? extends java.util.Map<String, java.lang.Object>> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postCommitVolumes")
    private Optional<? extends java.util.Map<String, java.util.Map<String, Volume>>> postCommitVolumes;

    @JsonProperty("postings")
    private java.util.List<Posting> postings;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("preCommitVolumes")
    private Optional<? extends java.util.Map<String, java.util.Map<String, Volume>>> preCommitVolumes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private Optional<? extends String> reference;

    @JsonProperty("timestamp")
    private OffsetDateTime timestamp;

    @JsonProperty("txid")
    private BigInteger txid;

    public Transaction(
            @JsonProperty("metadata") JsonNullable<? extends java.util.Map<String, java.lang.Object>> metadata,
            @JsonProperty("postCommitVolumes") Optional<? extends java.util.Map<String, java.util.Map<String, Volume>>> postCommitVolumes,
            @JsonProperty("postings") java.util.List<Posting> postings,
            @JsonProperty("preCommitVolumes") Optional<? extends java.util.Map<String, java.util.Map<String, Volume>>> preCommitVolumes,
            @JsonProperty("reference") Optional<? extends String> reference,
            @JsonProperty("timestamp") OffsetDateTime timestamp,
            @JsonProperty("txid") BigInteger txid) {
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(postCommitVolumes, "postCommitVolumes");
        Utils.checkNotNull(postings, "postings");
        Utils.checkNotNull(preCommitVolumes, "preCommitVolumes");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(timestamp, "timestamp");
        Utils.checkNotNull(txid, "txid");
        this.metadata = metadata;
        this.postCommitVolumes = postCommitVolumes;
        this.postings = postings;
        this.preCommitVolumes = preCommitVolumes;
        this.reference = reference;
        this.timestamp = timestamp;
        this.txid = txid;
    }

    public JsonNullable<? extends java.util.Map<String, java.lang.Object>> metadata() {
        return metadata;
    }

    public Optional<? extends java.util.Map<String, java.util.Map<String, Volume>>> postCommitVolumes() {
        return postCommitVolumes;
    }

    public java.util.List<Posting> postings() {
        return postings;
    }

    public Optional<? extends java.util.Map<String, java.util.Map<String, Volume>>> preCommitVolumes() {
        return preCommitVolumes;
    }

    public Optional<? extends String> reference() {
        return reference;
    }

    public OffsetDateTime timestamp() {
        return timestamp;
    }

    public BigInteger txid() {
        return txid;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Transaction withMetadata(java.util.Map<String, java.lang.Object> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = JsonNullable.of(metadata);
        return this;
    }

    public Transaction withMetadata(JsonNullable<? extends java.util.Map<String, java.lang.Object>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public Transaction withPostCommitVolumes(java.util.Map<String, java.util.Map<String, Volume>> postCommitVolumes) {
        Utils.checkNotNull(postCommitVolumes, "postCommitVolumes");
        this.postCommitVolumes = Optional.ofNullable(postCommitVolumes);
        return this;
    }

    public Transaction withPostCommitVolumes(Optional<? extends java.util.Map<String, java.util.Map<String, Volume>>> postCommitVolumes) {
        Utils.checkNotNull(postCommitVolumes, "postCommitVolumes");
        this.postCommitVolumes = postCommitVolumes;
        return this;
    }

    public Transaction withPostings(java.util.List<Posting> postings) {
        Utils.checkNotNull(postings, "postings");
        this.postings = postings;
        return this;
    }

    public Transaction withPreCommitVolumes(java.util.Map<String, java.util.Map<String, Volume>> preCommitVolumes) {
        Utils.checkNotNull(preCommitVolumes, "preCommitVolumes");
        this.preCommitVolumes = Optional.ofNullable(preCommitVolumes);
        return this;
    }

    public Transaction withPreCommitVolumes(Optional<? extends java.util.Map<String, java.util.Map<String, Volume>>> preCommitVolumes) {
        Utils.checkNotNull(preCommitVolumes, "preCommitVolumes");
        this.preCommitVolumes = preCommitVolumes;
        return this;
    }

    public Transaction withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }

    public Transaction withReference(Optional<? extends String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public Transaction withTimestamp(OffsetDateTime timestamp) {
        Utils.checkNotNull(timestamp, "timestamp");
        this.timestamp = timestamp;
        return this;
    }

    public Transaction withTxid(long txid) {
        this.txid = BigInteger.valueOf(txid);
        return this;
    }

    public Transaction withTxid(BigInteger txid) {
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
        Transaction other = (Transaction) o;
        return 
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.postCommitVolumes, other.postCommitVolumes) &&
            java.util.Objects.deepEquals(this.postings, other.postings) &&
            java.util.Objects.deepEquals(this.preCommitVolumes, other.preCommitVolumes) &&
            java.util.Objects.deepEquals(this.reference, other.reference) &&
            java.util.Objects.deepEquals(this.timestamp, other.timestamp) &&
            java.util.Objects.deepEquals(this.txid, other.txid);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            metadata,
            postCommitVolumes,
            postings,
            preCommitVolumes,
            reference,
            timestamp,
            txid);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Transaction.class,
                "metadata", metadata,
                "postCommitVolumes", postCommitVolumes,
                "postings", postings,
                "preCommitVolumes", preCommitVolumes,
                "reference", reference,
                "timestamp", timestamp,
                "txid", txid);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends java.util.Map<String, java.lang.Object>> metadata = JsonNullable.undefined();
 
        private Optional<? extends java.util.Map<String, java.util.Map<String, Volume>>> postCommitVolumes = Optional.empty();
 
        private java.util.List<Posting> postings;
 
        private Optional<? extends java.util.Map<String, java.util.Map<String, Volume>>> preCommitVolumes = Optional.empty();
 
        private Optional<? extends String> reference = Optional.empty();
 
        private OffsetDateTime timestamp;
 
        private BigInteger txid;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder metadata(java.util.Map<String, java.lang.Object> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = JsonNullable.of(metadata);
            return this;
        }

        public Builder metadata(JsonNullable<? extends java.util.Map<String, java.lang.Object>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder postCommitVolumes(java.util.Map<String, java.util.Map<String, Volume>> postCommitVolumes) {
            Utils.checkNotNull(postCommitVolumes, "postCommitVolumes");
            this.postCommitVolumes = Optional.ofNullable(postCommitVolumes);
            return this;
        }

        public Builder postCommitVolumes(Optional<? extends java.util.Map<String, java.util.Map<String, Volume>>> postCommitVolumes) {
            Utils.checkNotNull(postCommitVolumes, "postCommitVolumes");
            this.postCommitVolumes = postCommitVolumes;
            return this;
        }

        public Builder postings(java.util.List<Posting> postings) {
            Utils.checkNotNull(postings, "postings");
            this.postings = postings;
            return this;
        }

        public Builder preCommitVolumes(java.util.Map<String, java.util.Map<String, Volume>> preCommitVolumes) {
            Utils.checkNotNull(preCommitVolumes, "preCommitVolumes");
            this.preCommitVolumes = Optional.ofNullable(preCommitVolumes);
            return this;
        }

        public Builder preCommitVolumes(Optional<? extends java.util.Map<String, java.util.Map<String, Volume>>> preCommitVolumes) {
            Utils.checkNotNull(preCommitVolumes, "preCommitVolumes");
            this.preCommitVolumes = preCommitVolumes;
            return this;
        }

        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = Optional.ofNullable(reference);
            return this;
        }

        public Builder reference(Optional<? extends String> reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }

        public Builder timestamp(OffsetDateTime timestamp) {
            Utils.checkNotNull(timestamp, "timestamp");
            this.timestamp = timestamp;
            return this;
        }

        public Builder txid(long txid) {
            this.txid = BigInteger.valueOf(txid);
            return this;
        }

        public Builder txid(BigInteger txid) {
            Utils.checkNotNull(txid, "txid");
            this.txid = txid;
            return this;
        }
        
        public Transaction build() {
            return new Transaction(
                metadata,
                postCommitVolumes,
                postings,
                preCommitVolumes,
                reference,
                timestamp,
                txid);
        }
    }
}
