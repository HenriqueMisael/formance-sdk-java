/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;


public class V2DeleteWorkflowRequest {
    /**
     * The flow id
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=flowId")
    public String flowId;

    public V2DeleteWorkflowRequest withFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    
    public V2DeleteWorkflowRequest(@JsonProperty("flowId") String flowId) {
        this.flowId = flowId;
  }
}