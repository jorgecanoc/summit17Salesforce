/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject SolutionStatus
 */
@XStreamAlias("SolutionStatus")
public class SolutionStatus extends AbstractSObjectBase {

    // MasterLabel
    private String MasterLabel;

    @JsonProperty("MasterLabel")
    public String getMasterLabel() {
        return this.MasterLabel;
    }

    @JsonProperty("MasterLabel")
    public void setMasterLabel(String MasterLabel) {
        this.MasterLabel = MasterLabel;
    }

    // SortOrder
    private Integer SortOrder;

    @JsonProperty("SortOrder")
    public Integer getSortOrder() {
        return this.SortOrder;
    }

    @JsonProperty("SortOrder")
    public void setSortOrder(Integer SortOrder) {
        this.SortOrder = SortOrder;
    }

    // IsDefault
    private Boolean IsDefault;

    @JsonProperty("IsDefault")
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    @JsonProperty("IsDefault")
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    // IsReviewed
    private Boolean IsReviewed;

    @JsonProperty("IsReviewed")
    public Boolean getIsReviewed() {
        return this.IsReviewed;
    }

    @JsonProperty("IsReviewed")
    public void setIsReviewed(Boolean IsReviewed) {
        this.IsReviewed = IsReviewed;
    }

}