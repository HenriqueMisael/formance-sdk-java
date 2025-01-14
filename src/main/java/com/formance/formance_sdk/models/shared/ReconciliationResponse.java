/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

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

public class ReconciliationResponse {

    @JsonProperty("data")
    private Reconciliation data;

    @JsonCreator
    public ReconciliationResponse(
            @JsonProperty("data") Reconciliation data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public Reconciliation data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ReconciliationResponse withData(Reconciliation data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
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
        ReconciliationResponse other = (ReconciliationResponse) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReconciliationResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private Reconciliation data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(Reconciliation data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public ReconciliationResponse build() {
            return new ReconciliationResponse(
                data);
        }
    }
}

