/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class V2ActivityGetPaymentOutput {
    @JsonProperty("data")
    public V2Payment data;

    public V2ActivityGetPaymentOutput withData(V2Payment data) {
        this.data = data;
        return this;
    }
    
    public V2ActivityGetPaymentOutput(@JsonProperty("data") V2Payment data) {
        this.data = data;
  }
}