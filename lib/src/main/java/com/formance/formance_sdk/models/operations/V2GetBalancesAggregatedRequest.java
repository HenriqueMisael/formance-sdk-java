/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;


public class V2GetBalancesAggregatedRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> requestBody;

    public V2GetBalancesAggregatedRequest withRequestBody(java.util.Map<String, Object> requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    public String ledger;

    public V2GetBalancesAggregatedRequest withLedger(String ledger) {
        this.ledger = ledger;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pit")
    public OffsetDateTime pit;

    public V2GetBalancesAggregatedRequest withPit(OffsetDateTime pit) {
        this.pit = pit;
        return this;
    }
    
    public V2GetBalancesAggregatedRequest(@JsonProperty("ledger") String ledger) {
        this.ledger = ledger;
  }
}