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

public class TaskStripeDescriptor {

    @JsonProperty("account")
    private String account;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("main")
    private Optional<? extends Boolean> main;

    @JsonProperty("name")
    private String name;

    @JsonCreator
    public TaskStripeDescriptor(
            @JsonProperty("account") String account,
            @JsonProperty("main") Optional<? extends Boolean> main,
            @JsonProperty("name") String name) {
        Utils.checkNotNull(account, "account");
        Utils.checkNotNull(main, "main");
        Utils.checkNotNull(name, "name");
        this.account = account;
        this.main = main;
        this.name = name;
    }
    
    public TaskStripeDescriptor(
            String account,
            String name) {
        this(account, Optional.empty(), name);
    }

    @JsonIgnore
    public String account() {
        return account;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> main() {
        return (Optional<Boolean>) main;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TaskStripeDescriptor withAccount(String account) {
        Utils.checkNotNull(account, "account");
        this.account = account;
        return this;
    }

    public TaskStripeDescriptor withMain(boolean main) {
        Utils.checkNotNull(main, "main");
        this.main = Optional.ofNullable(main);
        return this;
    }

    public TaskStripeDescriptor withMain(Optional<? extends Boolean> main) {
        Utils.checkNotNull(main, "main");
        this.main = main;
        return this;
    }

    public TaskStripeDescriptor withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        TaskStripeDescriptor other = (TaskStripeDescriptor) o;
        return 
            java.util.Objects.deepEquals(this.account, other.account) &&
            java.util.Objects.deepEquals(this.main, other.main) &&
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            account,
            main,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaskStripeDescriptor.class,
                "account", account,
                "main", main,
                "name", name);
    }
    
    public final static class Builder {
 
        private String account;
 
        private Optional<? extends Boolean> main = Optional.empty();
 
        private String name;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder account(String account) {
            Utils.checkNotNull(account, "account");
            this.account = account;
            return this;
        }

        public Builder main(boolean main) {
            Utils.checkNotNull(main, "main");
            this.main = Optional.ofNullable(main);
            return this;
        }

        public Builder main(Optional<? extends Boolean> main) {
            Utils.checkNotNull(main, "main");
            this.main = main;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public TaskStripeDescriptor build() {
            return new TaskStripeDescriptor(
                account,
                main,
                name);
        }
    }
}

