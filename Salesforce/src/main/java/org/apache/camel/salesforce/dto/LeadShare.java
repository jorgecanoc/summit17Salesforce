/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject LeadShare
 */
@XStreamAlias("LeadShare")
public class LeadShare extends AbstractSObjectBase {

    // LeadId
    private String LeadId;

    @JsonProperty("LeadId")
    public String getLeadId() {
        return this.LeadId;
    }

    @JsonProperty("LeadId")
    public void setLeadId(String LeadId) {
        this.LeadId = LeadId;
    }

    // UserOrGroupId
    private String UserOrGroupId;

    @JsonProperty("UserOrGroupId")
    public String getUserOrGroupId() {
        return this.UserOrGroupId;
    }

    @JsonProperty("UserOrGroupId")
    public void setUserOrGroupId(String UserOrGroupId) {
        this.UserOrGroupId = UserOrGroupId;
    }

    // LeadAccessLevel
    @XStreamConverter(PicklistEnumConverter.class)
    private LeadShare_LeadAccessLevelEnum LeadAccessLevel;

    @JsonProperty("LeadAccessLevel")
    public LeadShare_LeadAccessLevelEnum getLeadAccessLevel() {
        return this.LeadAccessLevel;
    }

    @JsonProperty("LeadAccessLevel")
    public void setLeadAccessLevel(LeadShare_LeadAccessLevelEnum LeadAccessLevel) {
        this.LeadAccessLevel = LeadAccessLevel;
    }

    // RowCause
    @XStreamConverter(PicklistEnumConverter.class)
    private LeadShare_RowCauseEnum RowCause;

    @JsonProperty("RowCause")
    public LeadShare_RowCauseEnum getRowCause() {
        return this.RowCause;
    }

    @JsonProperty("RowCause")
    public void setRowCause(LeadShare_RowCauseEnum RowCause) {
        this.RowCause = RowCause;
    }

}