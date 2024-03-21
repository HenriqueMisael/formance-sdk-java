/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.LazySingletonValue;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class GetTransactionsRequest {

    /**
     * Parameter used in pagination requests.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when the cursor is set.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private Optional<? extends String> cursor;

    /**
     * The maximum number of results to return per page
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<? extends Long> pageSize;

    /**
     * A wallet ID to filter on
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=walletID")
    private Optional<? extends String> walletID;

    public GetTransactionsRequest(
            Optional<? extends String> cursor,
            Optional<? extends Long> pageSize,
            Optional<? extends String> walletID) {
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(walletID, "walletID");
        this.cursor = cursor;
        this.pageSize = pageSize;
        this.walletID = walletID;
    }

    /**
     * Parameter used in pagination requests.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when the cursor is set.
     * 
     */
    public Optional<? extends String> cursor() {
        return cursor;
    }

    /**
     * The maximum number of results to return per page
     */
    public Optional<? extends Long> pageSize() {
        return pageSize;
    }

    /**
     * A wallet ID to filter on
     */
    public Optional<? extends String> walletID() {
        return walletID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Parameter used in pagination requests.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when the cursor is set.
     * 
     */
    public GetTransactionsRequest withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = Optional.ofNullable(cursor);
        return this;
    }

    /**
     * Parameter used in pagination requests.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when the cursor is set.
     * 
     */
    public GetTransactionsRequest withCursor(Optional<? extends String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * The maximum number of results to return per page
     */
    public GetTransactionsRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The maximum number of results to return per page
     */
    public GetTransactionsRequest withPageSize(Optional<? extends Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * A wallet ID to filter on
     */
    public GetTransactionsRequest withWalletID(String walletID) {
        Utils.checkNotNull(walletID, "walletID");
        this.walletID = Optional.ofNullable(walletID);
        return this;
    }

    /**
     * A wallet ID to filter on
     */
    public GetTransactionsRequest withWalletID(Optional<? extends String> walletID) {
        Utils.checkNotNull(walletID, "walletID");
        this.walletID = walletID;
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
        GetTransactionsRequest other = (GetTransactionsRequest) o;
        return 
            java.util.Objects.deepEquals(this.cursor, other.cursor) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize) &&
            java.util.Objects.deepEquals(this.walletID, other.walletID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            cursor,
            pageSize,
            walletID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTransactionsRequest.class,
                "cursor", cursor,
                "pageSize", pageSize,
                "walletID", walletID);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> cursor = Optional.empty();
 
        private Optional<? extends Long> pageSize;
 
        private Optional<? extends String> walletID = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Parameter used in pagination requests.
         * Set to the value of next for the next page of results.
         * Set to the value of previous for the previous page of results.
         * No other parameters can be set when the cursor is set.
         * 
         */
        public Builder cursor(String cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = Optional.ofNullable(cursor);
            return this;
        }

        /**
         * Parameter used in pagination requests.
         * Set to the value of next for the next page of results.
         * Set to the value of previous for the previous page of results.
         * No other parameters can be set when the cursor is set.
         * 
         */
        public Builder cursor(Optional<? extends String> cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }

        /**
         * The maximum number of results to return per page
         */
        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        /**
         * The maximum number of results to return per page
         */
        public Builder pageSize(Optional<? extends Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        /**
         * A wallet ID to filter on
         */
        public Builder walletID(String walletID) {
            Utils.checkNotNull(walletID, "walletID");
            this.walletID = Optional.ofNullable(walletID);
            return this;
        }

        /**
         * A wallet ID to filter on
         */
        public Builder walletID(Optional<? extends String> walletID) {
            Utils.checkNotNull(walletID, "walletID");
            this.walletID = walletID;
            return this;
        }
        
        public GetTransactionsRequest build() {
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }
            return new GetTransactionsRequest(
                cursor,
                pageSize,
                walletID);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_PageSize =
                new LazySingletonValue<>(
                        "pageSize",
                        "15",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}
