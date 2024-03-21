/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class GetBalanceRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=balanceName")
    private String balanceName;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    public GetBalanceRequest(
            String balanceName,
            String id) {
        Utils.checkNotNull(balanceName, "balanceName");
        Utils.checkNotNull(id, "id");
        this.balanceName = balanceName;
        this.id = id;
    }

    public String balanceName() {
        return balanceName;
    }

    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetBalanceRequest withBalanceName(String balanceName) {
        Utils.checkNotNull(balanceName, "balanceName");
        this.balanceName = balanceName;
        return this;
    }

    public GetBalanceRequest withId(String id) {
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
        GetBalanceRequest other = (GetBalanceRequest) o;
        return 
            java.util.Objects.deepEquals(this.balanceName, other.balanceName) &&
            java.util.Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            balanceName,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBalanceRequest.class,
                "balanceName", balanceName,
                "id", id);
    }
    
    public final static class Builder {
 
        private String balanceName;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder balanceName(String balanceName) {
            Utils.checkNotNull(balanceName, "balanceName");
            this.balanceName = balanceName;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public GetBalanceRequest build() {
            return new GetBalanceRequest(
                balanceName,
                id);
        }
    }
}
