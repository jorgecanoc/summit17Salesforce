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
 * Salesforce DTO for SObject CaseContactRole
 */
@XStreamAlias("CaseContactRole")
public class CaseContactRole extends AbstractSObjectBase {

    // CasesId
    private String CasesId;

    @JsonProperty("CasesId")
    public String getCasesId() {
        return this.CasesId;
    }

    @JsonProperty("CasesId")
    public void setCasesId(String CasesId) {
        this.CasesId = CasesId;
    }

    // ContactId
    private String ContactId;

    @JsonProperty("ContactId")
    public String getContactId() {
        return this.ContactId;
    }

    @JsonProperty("ContactId")
    public void setContactId(String ContactId) {
        this.ContactId = ContactId;
    }

    // Role
    @XStreamConverter(PicklistEnumConverter.class)
    private CaseContactRole_RoleEnum Role;

    @JsonProperty("Role")
    public CaseContactRole_RoleEnum getRole() {
        return this.Role;
    }

    @JsonProperty("Role")
    public void setRole(CaseContactRole_RoleEnum Role) {
        this.Role = Role;
    }

}