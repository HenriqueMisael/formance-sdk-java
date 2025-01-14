/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class Query {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("after")
    private Optional<? extends java.util.List<String>> after;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cursor")
    private Optional<? extends String> cursor;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ledgers")
    private Optional<? extends java.util.List<String>> ledgers;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pageSize")
    private Optional<? extends Long> pageSize;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("policy")
    private Optional<? extends String> policy;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends QueryRaw> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort")
    private Optional<? extends String> sort;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("target")
    private Optional<? extends String> target;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terms")
    private Optional<? extends java.util.List<String>> terms;

    @JsonCreator
    public Query(
            @JsonProperty("after") Optional<? extends java.util.List<String>> after,
            @JsonProperty("cursor") Optional<? extends String> cursor,
            @JsonProperty("ledgers") Optional<? extends java.util.List<String>> ledgers,
            @JsonProperty("pageSize") Optional<? extends Long> pageSize,
            @JsonProperty("policy") Optional<? extends String> policy,
            @JsonProperty("raw") Optional<? extends QueryRaw> raw,
            @JsonProperty("sort") Optional<? extends String> sort,
            @JsonProperty("target") Optional<? extends String> target,
            @JsonProperty("terms") Optional<? extends java.util.List<String>> terms) {
        Utils.checkNotNull(after, "after");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(ledgers, "ledgers");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(policy, "policy");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(sort, "sort");
        Utils.checkNotNull(target, "target");
        Utils.checkNotNull(terms, "terms");
        this.after = after;
        this.cursor = cursor;
        this.ledgers = ledgers;
        this.pageSize = pageSize;
        this.policy = policy;
        this.raw = raw;
        this.sort = sort;
        this.target = target;
        this.terms = terms;
    }
    
    public Query() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> after() {
        return (Optional<java.util.List<String>>) after;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> cursor() {
        return (Optional<String>) cursor;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> ledgers() {
        return (Optional<java.util.List<String>>) ledgers;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> pageSize() {
        return (Optional<Long>) pageSize;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> policy() {
        return (Optional<String>) policy;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<QueryRaw> raw() {
        return (Optional<QueryRaw>) raw;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> sort() {
        return (Optional<String>) sort;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> target() {
        return (Optional<String>) target;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> terms() {
        return (Optional<java.util.List<String>>) terms;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Query withAfter(java.util.List<String> after) {
        Utils.checkNotNull(after, "after");
        this.after = Optional.ofNullable(after);
        return this;
    }

    public Query withAfter(Optional<? extends java.util.List<String>> after) {
        Utils.checkNotNull(after, "after");
        this.after = after;
        return this;
    }

    public Query withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = Optional.ofNullable(cursor);
        return this;
    }

    public Query withCursor(Optional<? extends String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    public Query withLedgers(java.util.List<String> ledgers) {
        Utils.checkNotNull(ledgers, "ledgers");
        this.ledgers = Optional.ofNullable(ledgers);
        return this;
    }

    public Query withLedgers(Optional<? extends java.util.List<String>> ledgers) {
        Utils.checkNotNull(ledgers, "ledgers");
        this.ledgers = ledgers;
        return this;
    }

    public Query withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    public Query withPageSize(Optional<? extends Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    public Query withPolicy(String policy) {
        Utils.checkNotNull(policy, "policy");
        this.policy = Optional.ofNullable(policy);
        return this;
    }

    public Query withPolicy(Optional<? extends String> policy) {
        Utils.checkNotNull(policy, "policy");
        this.policy = policy;
        return this;
    }

    public Query withRaw(QueryRaw raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public Query withRaw(Optional<? extends QueryRaw> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public Query withSort(String sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }

    public Query withSort(Optional<? extends String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }

    public Query withTarget(String target) {
        Utils.checkNotNull(target, "target");
        this.target = Optional.ofNullable(target);
        return this;
    }

    public Query withTarget(Optional<? extends String> target) {
        Utils.checkNotNull(target, "target");
        this.target = target;
        return this;
    }

    public Query withTerms(java.util.List<String> terms) {
        Utils.checkNotNull(terms, "terms");
        this.terms = Optional.ofNullable(terms);
        return this;
    }

    public Query withTerms(Optional<? extends java.util.List<String>> terms) {
        Utils.checkNotNull(terms, "terms");
        this.terms = terms;
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
        Query other = (Query) o;
        return 
            java.util.Objects.deepEquals(this.after, other.after) &&
            java.util.Objects.deepEquals(this.cursor, other.cursor) &&
            java.util.Objects.deepEquals(this.ledgers, other.ledgers) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize) &&
            java.util.Objects.deepEquals(this.policy, other.policy) &&
            java.util.Objects.deepEquals(this.raw, other.raw) &&
            java.util.Objects.deepEquals(this.sort, other.sort) &&
            java.util.Objects.deepEquals(this.target, other.target) &&
            java.util.Objects.deepEquals(this.terms, other.terms);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            after,
            cursor,
            ledgers,
            pageSize,
            policy,
            raw,
            sort,
            target,
            terms);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Query.class,
                "after", after,
                "cursor", cursor,
                "ledgers", ledgers,
                "pageSize", pageSize,
                "policy", policy,
                "raw", raw,
                "sort", sort,
                "target", target,
                "terms", terms);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<String>> after = Optional.empty();
 
        private Optional<? extends String> cursor = Optional.empty();
 
        private Optional<? extends java.util.List<String>> ledgers = Optional.empty();
 
        private Optional<? extends Long> pageSize = Optional.empty();
 
        private Optional<? extends String> policy = Optional.empty();
 
        private Optional<? extends QueryRaw> raw = Optional.empty();
 
        private Optional<? extends String> sort = Optional.empty();
 
        private Optional<? extends String> target = Optional.empty();
 
        private Optional<? extends java.util.List<String>> terms = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder after(java.util.List<String> after) {
            Utils.checkNotNull(after, "after");
            this.after = Optional.ofNullable(after);
            return this;
        }

        public Builder after(Optional<? extends java.util.List<String>> after) {
            Utils.checkNotNull(after, "after");
            this.after = after;
            return this;
        }

        public Builder cursor(String cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = Optional.ofNullable(cursor);
            return this;
        }

        public Builder cursor(Optional<? extends String> cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }

        public Builder ledgers(java.util.List<String> ledgers) {
            Utils.checkNotNull(ledgers, "ledgers");
            this.ledgers = Optional.ofNullable(ledgers);
            return this;
        }

        public Builder ledgers(Optional<? extends java.util.List<String>> ledgers) {
            Utils.checkNotNull(ledgers, "ledgers");
            this.ledgers = ledgers;
            return this;
        }

        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        public Builder pageSize(Optional<? extends Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        public Builder policy(String policy) {
            Utils.checkNotNull(policy, "policy");
            this.policy = Optional.ofNullable(policy);
            return this;
        }

        public Builder policy(Optional<? extends String> policy) {
            Utils.checkNotNull(policy, "policy");
            this.policy = policy;
            return this;
        }

        public Builder raw(QueryRaw raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        public Builder raw(Optional<? extends QueryRaw> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        public Builder sort(String sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = Optional.ofNullable(sort);
            return this;
        }

        public Builder sort(Optional<? extends String> sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = sort;
            return this;
        }

        public Builder target(String target) {
            Utils.checkNotNull(target, "target");
            this.target = Optional.ofNullable(target);
            return this;
        }

        public Builder target(Optional<? extends String> target) {
            Utils.checkNotNull(target, "target");
            this.target = target;
            return this;
        }

        public Builder terms(java.util.List<String> terms) {
            Utils.checkNotNull(terms, "terms");
            this.terms = Optional.ofNullable(terms);
            return this;
        }

        public Builder terms(Optional<? extends java.util.List<String>> terms) {
            Utils.checkNotNull(terms, "terms");
            this.terms = terms;
            return this;
        }
        
        public Query build() {
            return new Query(
                after,
                cursor,
                ledgers,
                pageSize,
                policy,
                raw,
                sort,
                target,
                terms);
        }
    }
}

