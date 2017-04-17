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
 * Salesforce DTO for SObject CaseTeamRole
 */
@XStreamAlias("CaseTeamRole")
public class CaseTeamRole extends AbstractSObjectBase {

    // AccessLevel
    @XStreamConverter(PicklistEnumConverter.class)
    private CaseTeamRole_AccessLevelEnum AccessLevel;

    @JsonProperty("AccessLevel")
    public CaseTeamRole_AccessLevelEnum getAccessLevel() {
        return this.AccessLevel;
    }

    @JsonProperty("AccessLevel")
    public void setAccessLevel(CaseTeamRole_AccessLevelEnum AccessLevel) {
        this.AccessLevel = AccessLevel;
    }

    // PreferencesVisibleInCSP
    private Boolean PreferencesVisibleInCSP;

    @JsonProperty("PreferencesVisibleInCSP")
    public Boolean getPreferencesVisibleInCSP() {
        return this.PreferencesVisibleInCSP;
    }

    @JsonProperty("PreferencesVisibleInCSP")
    public void setPreferencesVisibleInCSP(Boolean PreferencesVisibleInCSP) {
        this.PreferencesVisibleInCSP = PreferencesVisibleInCSP;
    }

}