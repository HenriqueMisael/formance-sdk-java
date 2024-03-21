/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
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


public class V2CreateLedgerRequest {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bucket")
    private Optional<? extends String> bucket;

    public V2CreateLedgerRequest(
            @JsonProperty("bucket") Optional<? extends String> bucket) {
        Utils.checkNotNull(bucket, "bucket");
        this.bucket = bucket;
    }

    public Optional<? extends String> bucket() {
        return bucket;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2CreateLedgerRequest withBucket(String bucket) {
        Utils.checkNotNull(bucket, "bucket");
        this.bucket = Optional.ofNullable(bucket);
        return this;
    }

    public V2CreateLedgerRequest withBucket(Optional<? extends String> bucket) {
        Utils.checkNotNull(bucket, "bucket");
        this.bucket = bucket;
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
        V2CreateLedgerRequest other = (V2CreateLedgerRequest) o;
        return 
            java.util.Objects.deepEquals(this.bucket, other.bucket);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            bucket);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2CreateLedgerRequest.class,
                "bucket", bucket);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> bucket = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder bucket(String bucket) {
            Utils.checkNotNull(bucket, "bucket");
            this.bucket = Optional.ofNullable(bucket);
            return this;
        }

        public Builder bucket(Optional<? extends String> bucket) {
            Utils.checkNotNull(bucket, "bucket");
            this.bucket = bucket;
            return this;
        }
        
        public V2CreateLedgerRequest build() {
            return new V2CreateLedgerRequest(
                bucket);
        }
    }
}
