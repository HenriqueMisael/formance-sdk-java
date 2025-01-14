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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;

public class StageStatus {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<? extends String> error;

    @JsonProperty("instanceID")
    private String instanceID;

    @JsonProperty("stage")
    private double stage;

    @JsonProperty("startedAt")
    private OffsetDateTime startedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terminatedAt")
    private Optional<? extends OffsetDateTime> terminatedAt;

    @JsonCreator
    public StageStatus(
            @JsonProperty("error") Optional<? extends String> error,
            @JsonProperty("instanceID") String instanceID,
            @JsonProperty("stage") double stage,
            @JsonProperty("startedAt") OffsetDateTime startedAt,
            @JsonProperty("terminatedAt") Optional<? extends OffsetDateTime> terminatedAt) {
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(instanceID, "instanceID");
        Utils.checkNotNull(stage, "stage");
        Utils.checkNotNull(startedAt, "startedAt");
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.error = error;
        this.instanceID = instanceID;
        this.stage = stage;
        this.startedAt = startedAt;
        this.terminatedAt = terminatedAt;
    }
    
    public StageStatus(
            String instanceID,
            double stage,
            OffsetDateTime startedAt) {
        this(Optional.empty(), instanceID, stage, startedAt, Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> error() {
        return (Optional<String>) error;
    }

    @JsonIgnore
    public String instanceID() {
        return instanceID;
    }

    @JsonIgnore
    public double stage() {
        return stage;
    }

    @JsonIgnore
    public OffsetDateTime startedAt() {
        return startedAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> terminatedAt() {
        return (Optional<OffsetDateTime>) terminatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public StageStatus withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    public StageStatus withError(Optional<? extends String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    public StageStatus withInstanceID(String instanceID) {
        Utils.checkNotNull(instanceID, "instanceID");
        this.instanceID = instanceID;
        return this;
    }

    public StageStatus withStage(double stage) {
        Utils.checkNotNull(stage, "stage");
        this.stage = stage;
        return this;
    }

    public StageStatus withStartedAt(OffsetDateTime startedAt) {
        Utils.checkNotNull(startedAt, "startedAt");
        this.startedAt = startedAt;
        return this;
    }

    public StageStatus withTerminatedAt(OffsetDateTime terminatedAt) {
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.terminatedAt = Optional.ofNullable(terminatedAt);
        return this;
    }

    public StageStatus withTerminatedAt(Optional<? extends OffsetDateTime> terminatedAt) {
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.terminatedAt = terminatedAt;
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
        StageStatus other = (StageStatus) o;
        return 
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.instanceID, other.instanceID) &&
            java.util.Objects.deepEquals(this.stage, other.stage) &&
            java.util.Objects.deepEquals(this.startedAt, other.startedAt) &&
            java.util.Objects.deepEquals(this.terminatedAt, other.terminatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            error,
            instanceID,
            stage,
            startedAt,
            terminatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StageStatus.class,
                "error", error,
                "instanceID", instanceID,
                "stage", stage,
                "startedAt", startedAt,
                "terminatedAt", terminatedAt);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> error = Optional.empty();
 
        private String instanceID;
 
        private Double stage;
 
        private OffsetDateTime startedAt;
 
        private Optional<? extends OffsetDateTime> terminatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder error(String error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        public Builder error(Optional<? extends String> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        public Builder instanceID(String instanceID) {
            Utils.checkNotNull(instanceID, "instanceID");
            this.instanceID = instanceID;
            return this;
        }

        public Builder stage(double stage) {
            Utils.checkNotNull(stage, "stage");
            this.stage = stage;
            return this;
        }

        public Builder startedAt(OffsetDateTime startedAt) {
            Utils.checkNotNull(startedAt, "startedAt");
            this.startedAt = startedAt;
            return this;
        }

        public Builder terminatedAt(OffsetDateTime terminatedAt) {
            Utils.checkNotNull(terminatedAt, "terminatedAt");
            this.terminatedAt = Optional.ofNullable(terminatedAt);
            return this;
        }

        public Builder terminatedAt(Optional<? extends OffsetDateTime> terminatedAt) {
            Utils.checkNotNull(terminatedAt, "terminatedAt");
            this.terminatedAt = terminatedAt;
            return this;
        }
        
        public StageStatus build() {
            return new StageStatus(
                error,
                instanceID,
                stage,
                startedAt,
                terminatedAt);
        }
    }
}

