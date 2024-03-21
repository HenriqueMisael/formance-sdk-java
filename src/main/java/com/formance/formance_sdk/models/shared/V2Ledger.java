/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
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


public class V2Ledger {

    @JsonProperty("addedAt")
    private OffsetDateTime addedAt;

    @JsonProperty("bucket")
    private String bucket;

    @JsonProperty("name")
    private String name;

    public V2Ledger(
            @JsonProperty("addedAt") OffsetDateTime addedAt,
            @JsonProperty("bucket") String bucket,
            @JsonProperty("name") String name) {
        Utils.checkNotNull(addedAt, "addedAt");
        Utils.checkNotNull(bucket, "bucket");
        Utils.checkNotNull(name, "name");
        this.addedAt = addedAt;
        this.bucket = bucket;
        this.name = name;
    }

    public OffsetDateTime addedAt() {
        return addedAt;
    }

    public String bucket() {
        return bucket;
    }

    public String name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2Ledger withAddedAt(OffsetDateTime addedAt) {
        Utils.checkNotNull(addedAt, "addedAt");
        this.addedAt = addedAt;
        return this;
    }

    public V2Ledger withBucket(String bucket) {
        Utils.checkNotNull(bucket, "bucket");
        this.bucket = bucket;
        return this;
    }

    public V2Ledger withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        V2Ledger other = (V2Ledger) o;
        return 
            java.util.Objects.deepEquals(this.addedAt, other.addedAt) &&
            java.util.Objects.deepEquals(this.bucket, other.bucket) &&
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            addedAt,
            bucket,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2Ledger.class,
                "addedAt", addedAt,
                "bucket", bucket,
                "name", name);
    }
    
    public final static class Builder {
 
        private OffsetDateTime addedAt;
 
        private String bucket;
 
        private String name;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder addedAt(OffsetDateTime addedAt) {
            Utils.checkNotNull(addedAt, "addedAt");
            this.addedAt = addedAt;
            return this;
        }

        public Builder bucket(String bucket) {
            Utils.checkNotNull(bucket, "bucket");
            this.bucket = bucket;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public V2Ledger build() {
            return new V2Ledger(
                addedAt,
                bucket,
                name);
        }
    }
}
