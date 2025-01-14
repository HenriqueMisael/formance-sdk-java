/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class OrchestrationTransaction {

    @JsonProperty("id")
    private BigInteger id;

    @JsonProperty("metadata")
    private java.util.Map<String, String> metadata;

    @JsonProperty("postings")
    private java.util.List<Posting> postings;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private Optional<? extends String> reference;

    @JsonProperty("reverted")
    private boolean reverted;

    @JsonProperty("timestamp")
    private OffsetDateTime timestamp;

    @JsonCreator
    public OrchestrationTransaction(
            @JsonProperty("id") BigInteger id,
            @JsonProperty("metadata") java.util.Map<String, String> metadata,
            @JsonProperty("postings") java.util.List<Posting> postings,
            @JsonProperty("reference") Optional<? extends String> reference,
            @JsonProperty("reverted") boolean reverted,
            @JsonProperty("timestamp") OffsetDateTime timestamp) {
        Utils.checkNotNull(id, "id");
        metadata = Utils.emptyMapIfNull(metadata);
        Utils.checkNotNull(postings, "postings");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(reverted, "reverted");
        Utils.checkNotNull(timestamp, "timestamp");
        this.id = id;
        this.metadata = metadata;
        this.postings = postings;
        this.reference = reference;
        this.reverted = reverted;
        this.timestamp = timestamp;
    }
    
    public OrchestrationTransaction(
            BigInteger id,
            java.util.Map<String, String> metadata,
            java.util.List<Posting> postings,
            boolean reverted,
            OffsetDateTime timestamp) {
        this(id, metadata, postings, Optional.empty(), reverted, timestamp);
    }

    @JsonIgnore
    public BigInteger id() {
        return id;
    }

    @JsonIgnore
    public java.util.Map<String, String> metadata() {
        return metadata;
    }

    @JsonIgnore
    public java.util.List<Posting> postings() {
        return postings;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> reference() {
        return (Optional<String>) reference;
    }

    @JsonIgnore
    public boolean reverted() {
        return reverted;
    }

    @JsonIgnore
    public OffsetDateTime timestamp() {
        return timestamp;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OrchestrationTransaction withId(long id) {
        this.id = BigInteger.valueOf(id);
        return this;
    }

    public OrchestrationTransaction withId(BigInteger id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public OrchestrationTransaction withMetadata(java.util.Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public OrchestrationTransaction withPostings(java.util.List<Posting> postings) {
        Utils.checkNotNull(postings, "postings");
        this.postings = postings;
        return this;
    }

    public OrchestrationTransaction withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }

    public OrchestrationTransaction withReference(Optional<? extends String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public OrchestrationTransaction withReverted(boolean reverted) {
        Utils.checkNotNull(reverted, "reverted");
        this.reverted = reverted;
        return this;
    }

    public OrchestrationTransaction withTimestamp(OffsetDateTime timestamp) {
        Utils.checkNotNull(timestamp, "timestamp");
        this.timestamp = timestamp;
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
        OrchestrationTransaction other = (OrchestrationTransaction) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.postings, other.postings) &&
            java.util.Objects.deepEquals(this.reference, other.reference) &&
            java.util.Objects.deepEquals(this.reverted, other.reverted) &&
            java.util.Objects.deepEquals(this.timestamp, other.timestamp);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            metadata,
            postings,
            reference,
            reverted,
            timestamp);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrchestrationTransaction.class,
                "id", id,
                "metadata", metadata,
                "postings", postings,
                "reference", reference,
                "reverted", reverted,
                "timestamp", timestamp);
    }
    
    public final static class Builder {
 
        private BigInteger id;
 
        private java.util.Map<String, String> metadata;
 
        private java.util.List<Posting> postings;
 
        private Optional<? extends String> reference = Optional.empty();
 
        private Boolean reverted;
 
        private OffsetDateTime timestamp;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(long id) {
            this.id = BigInteger.valueOf(id);
            return this;
        }

        public Builder id(BigInteger id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder metadata(java.util.Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder postings(java.util.List<Posting> postings) {
            Utils.checkNotNull(postings, "postings");
            this.postings = postings;
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

        public Builder reverted(boolean reverted) {
            Utils.checkNotNull(reverted, "reverted");
            this.reverted = reverted;
            return this;
        }

        public Builder timestamp(OffsetDateTime timestamp) {
            Utils.checkNotNull(timestamp, "timestamp");
            this.timestamp = timestamp;
            return this;
        }
        
        public OrchestrationTransaction build() {
            return new OrchestrationTransaction(
                id,
                metadata,
                postings,
                reference,
                reverted,
                timestamp);
        }
    }
}

