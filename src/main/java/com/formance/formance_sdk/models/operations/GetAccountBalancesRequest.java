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
import java.time.OffsetDateTime;
import java.util.Optional;


public class GetAccountBalancesRequest {

    /**
     * The account ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountId")
    private String accountId;

    /**
     * Filter balances by currency.
     * If not specified, all account's balances will be returned.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=asset")
    private Optional<? extends String> asset;

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private Optional<? extends String> cursor;

    /**
     * Filter balances by date.
     * If not specified, all account's balances will be returned.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=from")
    private Optional<? extends OffsetDateTime> from;

    /**
     * The maximum number of results to return per page.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<? extends Long> limit;

    /**
     * The maximum number of results to return per page.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<? extends Long> pageSize;

    /**
     * Fields used to sort payments (default is date:desc).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    private Optional<? extends java.util.List<String>> sort;

    /**
     * Filter balances by date.
     * If not specified, default will be set to now.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=to")
    private Optional<? extends OffsetDateTime> to;

    public GetAccountBalancesRequest(
            String accountId,
            Optional<? extends String> asset,
            Optional<? extends String> cursor,
            Optional<? extends OffsetDateTime> from,
            Optional<? extends Long> limit,
            Optional<? extends Long> pageSize,
            Optional<? extends java.util.List<String>> sort,
            Optional<? extends OffsetDateTime> to) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(asset, "asset");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(from, "from");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(sort, "sort");
        Utils.checkNotNull(to, "to");
        this.accountId = accountId;
        this.asset = asset;
        this.cursor = cursor;
        this.from = from;
        this.limit = limit;
        this.pageSize = pageSize;
        this.sort = sort;
        this.to = to;
    }

    /**
     * The account ID.
     */
    public String accountId() {
        return accountId;
    }

    /**
     * Filter balances by currency.
     * If not specified, all account's balances will be returned.
     * 
     */
    public Optional<? extends String> asset() {
        return asset;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    public Optional<? extends String> cursor() {
        return cursor;
    }

    /**
     * Filter balances by date.
     * If not specified, all account's balances will be returned.
     * 
     */
    public Optional<? extends OffsetDateTime> from() {
        return from;
    }

    /**
     * The maximum number of results to return per page.
     */
    public Optional<? extends Long> limit() {
        return limit;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public Optional<? extends Long> pageSize() {
        return pageSize;
    }

    /**
     * Fields used to sort payments (default is date:desc).
     */
    public Optional<? extends java.util.List<String>> sort() {
        return sort;
    }

    /**
     * Filter balances by date.
     * If not specified, default will be set to now.
     * 
     */
    public Optional<? extends OffsetDateTime> to() {
        return to;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The account ID.
     */
    public GetAccountBalancesRequest withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    /**
     * Filter balances by currency.
     * If not specified, all account's balances will be returned.
     * 
     */
    public GetAccountBalancesRequest withAsset(String asset) {
        Utils.checkNotNull(asset, "asset");
        this.asset = Optional.ofNullable(asset);
        return this;
    }

    /**
     * Filter balances by currency.
     * If not specified, all account's balances will be returned.
     * 
     */
    public GetAccountBalancesRequest withAsset(Optional<? extends String> asset) {
        Utils.checkNotNull(asset, "asset");
        this.asset = asset;
        return this;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    public GetAccountBalancesRequest withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = Optional.ofNullable(cursor);
        return this;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    public GetAccountBalancesRequest withCursor(Optional<? extends String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * Filter balances by date.
     * If not specified, all account's balances will be returned.
     * 
     */
    public GetAccountBalancesRequest withFrom(OffsetDateTime from) {
        Utils.checkNotNull(from, "from");
        this.from = Optional.ofNullable(from);
        return this;
    }

    /**
     * Filter balances by date.
     * If not specified, all account's balances will be returned.
     * 
     */
    public GetAccountBalancesRequest withFrom(Optional<? extends OffsetDateTime> from) {
        Utils.checkNotNull(from, "from");
        this.from = from;
        return this;
    }

    /**
     * The maximum number of results to return per page.
     */
    public GetAccountBalancesRequest withLimit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * The maximum number of results to return per page.
     */
    public GetAccountBalancesRequest withLimit(Optional<? extends Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public GetAccountBalancesRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public GetAccountBalancesRequest withPageSize(Optional<? extends Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Fields used to sort payments (default is date:desc).
     */
    public GetAccountBalancesRequest withSort(java.util.List<String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }

    /**
     * Fields used to sort payments (default is date:desc).
     */
    public GetAccountBalancesRequest withSort(Optional<? extends java.util.List<String>> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }

    /**
     * Filter balances by date.
     * If not specified, default will be set to now.
     * 
     */
    public GetAccountBalancesRequest withTo(OffsetDateTime to) {
        Utils.checkNotNull(to, "to");
        this.to = Optional.ofNullable(to);
        return this;
    }

    /**
     * Filter balances by date.
     * If not specified, default will be set to now.
     * 
     */
    public GetAccountBalancesRequest withTo(Optional<? extends OffsetDateTime> to) {
        Utils.checkNotNull(to, "to");
        this.to = to;
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
        GetAccountBalancesRequest other = (GetAccountBalancesRequest) o;
        return 
            java.util.Objects.deepEquals(this.accountId, other.accountId) &&
            java.util.Objects.deepEquals(this.asset, other.asset) &&
            java.util.Objects.deepEquals(this.cursor, other.cursor) &&
            java.util.Objects.deepEquals(this.from, other.from) &&
            java.util.Objects.deepEquals(this.limit, other.limit) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize) &&
            java.util.Objects.deepEquals(this.sort, other.sort) &&
            java.util.Objects.deepEquals(this.to, other.to);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountId,
            asset,
            cursor,
            from,
            limit,
            pageSize,
            sort,
            to);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountBalancesRequest.class,
                "accountId", accountId,
                "asset", asset,
                "cursor", cursor,
                "from", from,
                "limit", limit,
                "pageSize", pageSize,
                "sort", sort,
                "to", to);
    }
    
    public final static class Builder {
 
        private String accountId;
 
        private Optional<? extends String> asset = Optional.empty();
 
        private Optional<? extends String> cursor = Optional.empty();
 
        private Optional<? extends OffsetDateTime> from = Optional.empty();
 
        private Optional<? extends Long> limit = Optional.empty();
 
        private Optional<? extends Long> pageSize;
 
        private Optional<? extends java.util.List<String>> sort = Optional.empty();
 
        private Optional<? extends OffsetDateTime> to = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The account ID.
         */
        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        /**
         * Filter balances by currency.
         * If not specified, all account's balances will be returned.
         * 
         */
        public Builder asset(String asset) {
            Utils.checkNotNull(asset, "asset");
            this.asset = Optional.ofNullable(asset);
            return this;
        }

        /**
         * Filter balances by currency.
         * If not specified, all account's balances will be returned.
         * 
         */
        public Builder asset(Optional<? extends String> asset) {
            Utils.checkNotNull(asset, "asset");
            this.asset = asset;
            return this;
        }

        /**
         * Parameter used in pagination requests. Maximum page size is set to 15.
         * Set to the value of next for the next page of results.
         * Set to the value of previous for the previous page of results.
         * No other parameters can be set when this parameter is set.
         * 
         */
        public Builder cursor(String cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = Optional.ofNullable(cursor);
            return this;
        }

        /**
         * Parameter used in pagination requests. Maximum page size is set to 15.
         * Set to the value of next for the next page of results.
         * Set to the value of previous for the previous page of results.
         * No other parameters can be set when this parameter is set.
         * 
         */
        public Builder cursor(Optional<? extends String> cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }

        /**
         * Filter balances by date.
         * If not specified, all account's balances will be returned.
         * 
         */
        public Builder from(OffsetDateTime from) {
            Utils.checkNotNull(from, "from");
            this.from = Optional.ofNullable(from);
            return this;
        }

        /**
         * Filter balances by date.
         * If not specified, all account's balances will be returned.
         * 
         */
        public Builder from(Optional<? extends OffsetDateTime> from) {
            Utils.checkNotNull(from, "from");
            this.from = from;
            return this;
        }

        /**
         * The maximum number of results to return per page.
         */
        public Builder limit(long limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        /**
         * The maximum number of results to return per page.
         */
        public Builder limit(Optional<? extends Long> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        /**
         * The maximum number of results to return per page.
         * 
         */
        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        /**
         * The maximum number of results to return per page.
         * 
         */
        public Builder pageSize(Optional<? extends Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Fields used to sort payments (default is date:desc).
         */
        public Builder sort(java.util.List<String> sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = Optional.ofNullable(sort);
            return this;
        }

        /**
         * Fields used to sort payments (default is date:desc).
         */
        public Builder sort(Optional<? extends java.util.List<String>> sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = sort;
            return this;
        }

        /**
         * Filter balances by date.
         * If not specified, default will be set to now.
         * 
         */
        public Builder to(OffsetDateTime to) {
            Utils.checkNotNull(to, "to");
            this.to = Optional.ofNullable(to);
            return this;
        }

        /**
         * Filter balances by date.
         * If not specified, default will be set to now.
         * 
         */
        public Builder to(Optional<? extends OffsetDateTime> to) {
            Utils.checkNotNull(to, "to");
            this.to = to;
            return this;
        }
        
        public GetAccountBalancesRequest build() {
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }
            return new GetAccountBalancesRequest(
                accountId,
                asset,
                cursor,
                from,
                limit,
                pageSize,
                sort,
                to);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_PageSize =
                new LazySingletonValue<>(
                        "pageSize",
                        "15",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}
