/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject MailmergeTemplate
 */
@XStreamAlias("MailmergeTemplate")
public class MailmergeTemplate extends AbstractSObjectBase {

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // Filename
    private String Filename;

    @JsonProperty("Filename")
    public String getFilename() {
        return this.Filename;
    }

    @JsonProperty("Filename")
    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    // BodyLength
    private Integer BodyLength;

    @JsonProperty("BodyLength")
    public Integer getBodyLength() {
        return this.BodyLength;
    }

    @JsonProperty("BodyLength")
    public void setBodyLength(Integer BodyLength) {
        this.BodyLength = BodyLength;
    }

    // Body
    // blob field url, use getBlobField to get the content
    @XStreamAlias("Body")
    private String BodyUrl;

    @JsonProperty("Body")
    public String getBodyUrl() {
        return this.BodyUrl;
    }

    @JsonProperty("Body")
    public void setBodyUrl(String BodyUrl) {
        this.BodyUrl = BodyUrl;
    }

    // LastUsedDate
    private java.time.ZonedDateTime LastUsedDate;

    @JsonProperty("LastUsedDate")
    public java.time.ZonedDateTime getLastUsedDate() {
        return this.LastUsedDate;
    }

    @JsonProperty("LastUsedDate")
    public void setLastUsedDate(java.time.ZonedDateTime LastUsedDate) {
        this.LastUsedDate = LastUsedDate;
    }

    // SecurityOptionsAttachmentScannedForXSS
    private Boolean SecurityOptionsAttachmentScannedForXSS;

    @JsonProperty("SecurityOptionsAttachmentScannedForXSS")
    public Boolean getSecurityOptionsAttachmentScannedForXSS() {
        return this.SecurityOptionsAttachmentScannedForXSS;
    }

    @JsonProperty("SecurityOptionsAttachmentScannedForXSS")
    public void setSecurityOptionsAttachmentScannedForXSS(Boolean SecurityOptionsAttachmentScannedForXSS) {
        this.SecurityOptionsAttachmentScannedForXSS = SecurityOptionsAttachmentScannedForXSS;
    }

    // SecurityOptionsAttachmentHasXSSThreat
    private Boolean SecurityOptionsAttachmentHasXSSThreat;

    @JsonProperty("SecurityOptionsAttachmentHasXSSThreat")
    public Boolean getSecurityOptionsAttachmentHasXSSThreat() {
        return this.SecurityOptionsAttachmentHasXSSThreat;
    }

    @JsonProperty("SecurityOptionsAttachmentHasXSSThreat")
    public void setSecurityOptionsAttachmentHasXSSThreat(Boolean SecurityOptionsAttachmentHasXSSThreat) {
        this.SecurityOptionsAttachmentHasXSSThreat = SecurityOptionsAttachmentHasXSSThreat;
    }

    // SecurityOptionsAttachmentScannedforFlash
    private Boolean SecurityOptionsAttachmentScannedforFlash;

    @JsonProperty("SecurityOptionsAttachmentScannedforFlash")
    public Boolean getSecurityOptionsAttachmentScannedforFlash() {
        return this.SecurityOptionsAttachmentScannedforFlash;
    }

    @JsonProperty("SecurityOptionsAttachmentScannedforFlash")
    public void setSecurityOptionsAttachmentScannedforFlash(Boolean SecurityOptionsAttachmentScannedforFlash) {
        this.SecurityOptionsAttachmentScannedforFlash = SecurityOptionsAttachmentScannedforFlash;
    }

    // SecurityOptionsAttachmentHasFlash
    private Boolean SecurityOptionsAttachmentHasFlash;

    @JsonProperty("SecurityOptionsAttachmentHasFlash")
    public Boolean getSecurityOptionsAttachmentHasFlash() {
        return this.SecurityOptionsAttachmentHasFlash;
    }

    @JsonProperty("SecurityOptionsAttachmentHasFlash")
    public void setSecurityOptionsAttachmentHasFlash(Boolean SecurityOptionsAttachmentHasFlash) {
        this.SecurityOptionsAttachmentHasFlash = SecurityOptionsAttachmentHasFlash;
    }

}