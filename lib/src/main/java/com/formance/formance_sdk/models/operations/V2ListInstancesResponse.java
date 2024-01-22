/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class V2ListInstancesResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public V2ListInstancesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public V2ListInstancesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public V2ListInstancesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * General error
     */
    
    public com.formance.formance_sdk.models.shared.V2Error v2Error;

    public V2ListInstancesResponse withV2Error(com.formance.formance_sdk.models.shared.V2Error v2Error) {
        this.v2Error = v2Error;
        return this;
    }
    
    /**
     * List of workflow instances
     */
    
    public com.formance.formance_sdk.models.shared.V2ListRunsResponse v2ListRunsResponse;

    public V2ListInstancesResponse withV2ListRunsResponse(com.formance.formance_sdk.models.shared.V2ListRunsResponse v2ListRunsResponse) {
        this.v2ListRunsResponse = v2ListRunsResponse;
        return this;
    }
    
    public V2ListInstancesResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}