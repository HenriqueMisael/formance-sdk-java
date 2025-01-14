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

public class Mapping {

    @JsonProperty("contracts")
    private java.util.List<Contract> contracts;

    @JsonCreator
    public Mapping(
            @JsonProperty("contracts") java.util.List<Contract> contracts) {
        Utils.checkNotNull(contracts, "contracts");
        this.contracts = contracts;
    }

    @JsonIgnore
    public java.util.List<Contract> contracts() {
        return contracts;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Mapping withContracts(java.util.List<Contract> contracts) {
        Utils.checkNotNull(contracts, "contracts");
        this.contracts = contracts;
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
        Mapping other = (Mapping) o;
        return 
            java.util.Objects.deepEquals(this.contracts, other.contracts);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contracts);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Mapping.class,
                "contracts", contracts);
    }
    
    public final static class Builder {
 
        private java.util.List<Contract> contracts;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder contracts(java.util.List<Contract> contracts) {
            Utils.checkNotNull(contracts, "contracts");
            this.contracts = contracts;
            return this;
        }
        
        public Mapping build() {
            return new Mapping(
                contracts);
        }
    }
}

