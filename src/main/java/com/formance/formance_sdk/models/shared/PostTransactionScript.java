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

public class PostTransactionScript {

    @JsonProperty("plain")
    private String plain;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vars")
    private Optional<? extends java.util.Map<String, java.lang.Object>> vars;

    @JsonCreator
    public PostTransactionScript(
            @JsonProperty("plain") String plain,
            @JsonProperty("vars") Optional<? extends java.util.Map<String, java.lang.Object>> vars) {
        Utils.checkNotNull(plain, "plain");
        Utils.checkNotNull(vars, "vars");
        this.plain = plain;
        this.vars = vars;
    }
    
    public PostTransactionScript(
            String plain) {
        this(plain, Optional.empty());
    }

    @JsonIgnore
    public String plain() {
        return plain;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.Map<String, java.lang.Object>> vars() {
        return (Optional<java.util.Map<String, java.lang.Object>>) vars;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostTransactionScript withPlain(String plain) {
        Utils.checkNotNull(plain, "plain");
        this.plain = plain;
        return this;
    }

    public PostTransactionScript withVars(java.util.Map<String, java.lang.Object> vars) {
        Utils.checkNotNull(vars, "vars");
        this.vars = Optional.ofNullable(vars);
        return this;
    }

    public PostTransactionScript withVars(Optional<? extends java.util.Map<String, java.lang.Object>> vars) {
        Utils.checkNotNull(vars, "vars");
        this.vars = vars;
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
        PostTransactionScript other = (PostTransactionScript) o;
        return 
            java.util.Objects.deepEquals(this.plain, other.plain) &&
            java.util.Objects.deepEquals(this.vars, other.vars);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            plain,
            vars);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostTransactionScript.class,
                "plain", plain,
                "vars", vars);
    }
    
    public final static class Builder {
 
        private String plain;
 
        private Optional<? extends java.util.Map<String, java.lang.Object>> vars = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder plain(String plain) {
            Utils.checkNotNull(plain, "plain");
            this.plain = plain;
            return this;
        }

        public Builder vars(java.util.Map<String, java.lang.Object> vars) {
            Utils.checkNotNull(vars, "vars");
            this.vars = Optional.ofNullable(vars);
            return this;
        }

        public Builder vars(Optional<? extends java.util.Map<String, java.lang.Object>> vars) {
            Utils.checkNotNull(vars, "vars");
            this.vars = vars;
            return this;
        }
        
        public PostTransactionScript build() {
            return new PostTransactionScript(
                plain,
                vars);
        }
    }
}

