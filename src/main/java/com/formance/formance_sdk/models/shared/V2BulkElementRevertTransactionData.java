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
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class V2BulkElementRevertTransactionData {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("atEffectiveDate")
    private Optional<? extends Boolean> atEffectiveDate;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("force")
    private Optional<? extends Boolean> force;

    @JsonProperty("id")
    private BigInteger id;

    @JsonCreator
    public V2BulkElementRevertTransactionData(
            @JsonProperty("atEffectiveDate") Optional<? extends Boolean> atEffectiveDate,
            @JsonProperty("force") Optional<? extends Boolean> force,
            @JsonProperty("id") BigInteger id) {
        Utils.checkNotNull(atEffectiveDate, "atEffectiveDate");
        Utils.checkNotNull(force, "force");
        Utils.checkNotNull(id, "id");
        this.atEffectiveDate = atEffectiveDate;
        this.force = force;
        this.id = id;
    }
    
    public V2BulkElementRevertTransactionData(
            BigInteger id) {
        this(Optional.empty(), Optional.empty(), id);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> atEffectiveDate() {
        return (Optional<Boolean>) atEffectiveDate;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> force() {
        return (Optional<Boolean>) force;
    }

    @JsonIgnore
    public BigInteger id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2BulkElementRevertTransactionData withAtEffectiveDate(boolean atEffectiveDate) {
        Utils.checkNotNull(atEffectiveDate, "atEffectiveDate");
        this.atEffectiveDate = Optional.ofNullable(atEffectiveDate);
        return this;
    }

    public V2BulkElementRevertTransactionData withAtEffectiveDate(Optional<? extends Boolean> atEffectiveDate) {
        Utils.checkNotNull(atEffectiveDate, "atEffectiveDate");
        this.atEffectiveDate = atEffectiveDate;
        return this;
    }

    public V2BulkElementRevertTransactionData withForce(boolean force) {
        Utils.checkNotNull(force, "force");
        this.force = Optional.ofNullable(force);
        return this;
    }

    public V2BulkElementRevertTransactionData withForce(Optional<? extends Boolean> force) {
        Utils.checkNotNull(force, "force");
        this.force = force;
        return this;
    }

    public V2BulkElementRevertTransactionData withId(long id) {
        this.id = BigInteger.valueOf(id);
        return this;
    }

    public V2BulkElementRevertTransactionData withId(BigInteger id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        V2BulkElementRevertTransactionData other = (V2BulkElementRevertTransactionData) o;
        return 
            java.util.Objects.deepEquals(this.atEffectiveDate, other.atEffectiveDate) &&
            java.util.Objects.deepEquals(this.force, other.force) &&
            java.util.Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            atEffectiveDate,
            force,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2BulkElementRevertTransactionData.class,
                "atEffectiveDate", atEffectiveDate,
                "force", force,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> atEffectiveDate = Optional.empty();
 
        private Optional<? extends Boolean> force = Optional.empty();
 
        private BigInteger id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder atEffectiveDate(boolean atEffectiveDate) {
            Utils.checkNotNull(atEffectiveDate, "atEffectiveDate");
            this.atEffectiveDate = Optional.ofNullable(atEffectiveDate);
            return this;
        }

        public Builder atEffectiveDate(Optional<? extends Boolean> atEffectiveDate) {
            Utils.checkNotNull(atEffectiveDate, "atEffectiveDate");
            this.atEffectiveDate = atEffectiveDate;
            return this;
        }

        public Builder force(boolean force) {
            Utils.checkNotNull(force, "force");
            this.force = Optional.ofNullable(force);
            return this;
        }

        public Builder force(Optional<? extends Boolean> force) {
            Utils.checkNotNull(force, "force");
            this.force = force;
            return this;
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
        
        public V2BulkElementRevertTransactionData build() {
            return new V2BulkElementRevertTransactionData(
                atEffectiveDate,
                force,
                id);
        }
    }
}

