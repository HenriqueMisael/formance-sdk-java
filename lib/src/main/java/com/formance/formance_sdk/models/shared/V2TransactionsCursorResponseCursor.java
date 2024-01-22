/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V2TransactionsCursorResponseCursor {
    @JsonProperty("data")
    public V2ExpandedTransaction[] data;

    public V2TransactionsCursorResponseCursor withData(V2ExpandedTransaction[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("hasMore")
    public Boolean hasMore;

    public V2TransactionsCursorResponseCursor withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    public String next;

    public V2TransactionsCursorResponseCursor withNext(String next) {
        this.next = next;
        return this;
    }
    
    @JsonProperty("pageSize")
    public Long pageSize;

    public V2TransactionsCursorResponseCursor withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    public String previous;

    public V2TransactionsCursorResponseCursor withPrevious(String previous) {
        this.previous = previous;
        return this;
    }
    
    public V2TransactionsCursorResponseCursor(@JsonProperty("data") V2ExpandedTransaction[] data, @JsonProperty("hasMore") Boolean hasMore, @JsonProperty("pageSize") Long pageSize) {
        this.data = data;
        this.hasMore = hasMore;
        this.pageSize = pageSize;
  }
}