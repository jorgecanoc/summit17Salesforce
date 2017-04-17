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
 * Salesforce DTO for SObject CronJobDetail
 */
@XStreamAlias("CronJobDetail")
public class CronJobDetail extends AbstractSObjectBase {

    // JobType
    @XStreamConverter(PicklistEnumConverter.class)
    private CronJobDetail_JobTypeEnum JobType;

    @JsonProperty("JobType")
    public CronJobDetail_JobTypeEnum getJobType() {
        return this.JobType;
    }

    @JsonProperty("JobType")
    public void setJobType(CronJobDetail_JobTypeEnum JobType) {
        this.JobType = JobType;
    }

}