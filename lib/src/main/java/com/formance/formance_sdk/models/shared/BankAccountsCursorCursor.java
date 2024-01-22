/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BankAccountsCursorCursor {
    @JsonProperty("data")
    public BankAccount[] data;

    public BankAccountsCursorCursor withData(BankAccount[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("hasMore")
    public Boolean hasMore;

    public BankAccountsCursorCursor withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    public String next;

    public BankAccountsCursorCursor withNext(String next) {
        this.next = next;
        return this;
    }
    
    @JsonProperty("pageSize")
    public Long pageSize;

    public BankAccountsCursorCursor withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    public String previous;

    public BankAccountsCursorCursor withPrevious(String previous) {
        this.previous = previous;
        return this;
    }
    
    public BankAccountsCursorCursor(@JsonProperty("data") BankAccount[] data, @JsonProperty("hasMore") Boolean hasMore, @JsonProperty("pageSize") Long pageSize) {
        this.data = data;
        this.hasMore = hasMore;
        this.pageSize = pageSize;
  }
}