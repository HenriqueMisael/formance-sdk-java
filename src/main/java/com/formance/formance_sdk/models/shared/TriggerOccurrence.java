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

public class TriggerOccurrence {

    @JsonProperty("date")
    private OffsetDateTime date;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<? extends String> error;

    @JsonProperty("event")
    private java.util.Map<String, java.lang.Object> event;

    @JsonProperty("triggerID")
    private String triggerID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("workflowInstance")
    private Optional<? extends WorkflowInstance> workflowInstance;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("workflowInstanceID")
    private Optional<? extends String> workflowInstanceID;

    @JsonCreator
    public TriggerOccurrence(
            @JsonProperty("date") OffsetDateTime date,
            @JsonProperty("error") Optional<? extends String> error,
            @JsonProperty("event") java.util.Map<String, java.lang.Object> event,
            @JsonProperty("triggerID") String triggerID,
            @JsonProperty("workflowInstance") Optional<? extends WorkflowInstance> workflowInstance,
            @JsonProperty("workflowInstanceID") Optional<? extends String> workflowInstanceID) {
        Utils.checkNotNull(date, "date");
        Utils.checkNotNull(error, "error");
        event = Utils.emptyMapIfNull(event);
        Utils.checkNotNull(triggerID, "triggerID");
        Utils.checkNotNull(workflowInstance, "workflowInstance");
        Utils.checkNotNull(workflowInstanceID, "workflowInstanceID");
        this.date = date;
        this.error = error;
        this.event = event;
        this.triggerID = triggerID;
        this.workflowInstance = workflowInstance;
        this.workflowInstanceID = workflowInstanceID;
    }
    
    public TriggerOccurrence(
            OffsetDateTime date,
            java.util.Map<String, java.lang.Object> event,
            String triggerID) {
        this(date, Optional.empty(), event, triggerID, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public OffsetDateTime date() {
        return date;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> error() {
        return (Optional<String>) error;
    }

    @JsonIgnore
    public java.util.Map<String, java.lang.Object> event() {
        return event;
    }

    @JsonIgnore
    public String triggerID() {
        return triggerID;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<WorkflowInstance> workflowInstance() {
        return (Optional<WorkflowInstance>) workflowInstance;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> workflowInstanceID() {
        return (Optional<String>) workflowInstanceID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TriggerOccurrence withDate(OffsetDateTime date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
        return this;
    }

    public TriggerOccurrence withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    public TriggerOccurrence withError(Optional<? extends String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    public TriggerOccurrence withEvent(java.util.Map<String, java.lang.Object> event) {
        Utils.checkNotNull(event, "event");
        this.event = event;
        return this;
    }

    public TriggerOccurrence withTriggerID(String triggerID) {
        Utils.checkNotNull(triggerID, "triggerID");
        this.triggerID = triggerID;
        return this;
    }

    public TriggerOccurrence withWorkflowInstance(WorkflowInstance workflowInstance) {
        Utils.checkNotNull(workflowInstance, "workflowInstance");
        this.workflowInstance = Optional.ofNullable(workflowInstance);
        return this;
    }

    public TriggerOccurrence withWorkflowInstance(Optional<? extends WorkflowInstance> workflowInstance) {
        Utils.checkNotNull(workflowInstance, "workflowInstance");
        this.workflowInstance = workflowInstance;
        return this;
    }

    public TriggerOccurrence withWorkflowInstanceID(String workflowInstanceID) {
        Utils.checkNotNull(workflowInstanceID, "workflowInstanceID");
        this.workflowInstanceID = Optional.ofNullable(workflowInstanceID);
        return this;
    }

    public TriggerOccurrence withWorkflowInstanceID(Optional<? extends String> workflowInstanceID) {
        Utils.checkNotNull(workflowInstanceID, "workflowInstanceID");
        this.workflowInstanceID = workflowInstanceID;
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
        TriggerOccurrence other = (TriggerOccurrence) o;
        return 
            java.util.Objects.deepEquals(this.date, other.date) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.event, other.event) &&
            java.util.Objects.deepEquals(this.triggerID, other.triggerID) &&
            java.util.Objects.deepEquals(this.workflowInstance, other.workflowInstance) &&
            java.util.Objects.deepEquals(this.workflowInstanceID, other.workflowInstanceID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            date,
            error,
            event,
            triggerID,
            workflowInstance,
            workflowInstanceID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TriggerOccurrence.class,
                "date", date,
                "error", error,
                "event", event,
                "triggerID", triggerID,
                "workflowInstance", workflowInstance,
                "workflowInstanceID", workflowInstanceID);
    }
    
    public final static class Builder {
 
        private OffsetDateTime date;
 
        private Optional<? extends String> error = Optional.empty();
 
        private java.util.Map<String, java.lang.Object> event;
 
        private String triggerID;
 
        private Optional<? extends WorkflowInstance> workflowInstance = Optional.empty();
 
        private Optional<? extends String> workflowInstanceID = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder date(OffsetDateTime date) {
            Utils.checkNotNull(date, "date");
            this.date = date;
            return this;
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

        public Builder event(java.util.Map<String, java.lang.Object> event) {
            Utils.checkNotNull(event, "event");
            this.event = event;
            return this;
        }

        public Builder triggerID(String triggerID) {
            Utils.checkNotNull(triggerID, "triggerID");
            this.triggerID = triggerID;
            return this;
        }

        public Builder workflowInstance(WorkflowInstance workflowInstance) {
            Utils.checkNotNull(workflowInstance, "workflowInstance");
            this.workflowInstance = Optional.ofNullable(workflowInstance);
            return this;
        }

        public Builder workflowInstance(Optional<? extends WorkflowInstance> workflowInstance) {
            Utils.checkNotNull(workflowInstance, "workflowInstance");
            this.workflowInstance = workflowInstance;
            return this;
        }

        public Builder workflowInstanceID(String workflowInstanceID) {
            Utils.checkNotNull(workflowInstanceID, "workflowInstanceID");
            this.workflowInstanceID = Optional.ofNullable(workflowInstanceID);
            return this;
        }

        public Builder workflowInstanceID(Optional<? extends String> workflowInstanceID) {
            Utils.checkNotNull(workflowInstanceID, "workflowInstanceID");
            this.workflowInstanceID = workflowInstanceID;
            return this;
        }
        
        public TriggerOccurrence build() {
            return new TriggerOccurrence(
                date,
                error,
                event,
                triggerID,
                workflowInstance,
                workflowInstanceID);
        }
    }
}

