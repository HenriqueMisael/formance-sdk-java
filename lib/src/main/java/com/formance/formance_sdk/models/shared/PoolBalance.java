/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PoolBalance {
    @JsonProperty("amount")
    public Long amount;

    public PoolBalance withAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    
    @JsonProperty("asset")
    public String asset;

    public PoolBalance withAsset(String asset) {
        this.asset = asset;
        return this;
    }
    
    public PoolBalance(@JsonProperty("amount") Long amount, @JsonProperty("asset") String asset) {
        this.amount = amount;
        this.asset = asset;
  }
}