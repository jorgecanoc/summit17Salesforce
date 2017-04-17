/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject SecureAgentPlugin
 */
@XStreamAlias("SecureAgentPlugin")
public class SecureAgentPlugin extends AbstractSObjectBase {

    // SecureAgentId
    private String SecureAgentId;

    @JsonProperty("SecureAgentId")
    public String getSecureAgentId() {
        return this.SecureAgentId;
    }

    @JsonProperty("SecureAgentId")
    public void setSecureAgentId(String SecureAgentId) {
        this.SecureAgentId = SecureAgentId;
    }

    // PluginName
    private String PluginName;

    @JsonProperty("PluginName")
    public String getPluginName() {
        return this.PluginName;
    }

    @JsonProperty("PluginName")
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    // PluginType
    private String PluginType;

    @JsonProperty("PluginType")
    public String getPluginType() {
        return this.PluginType;
    }

    @JsonProperty("PluginType")
    public void setPluginType(String PluginType) {
        this.PluginType = PluginType;
    }

    // RequestedVersion
    private String RequestedVersion;

    @JsonProperty("RequestedVersion")
    public String getRequestedVersion() {
        return this.RequestedVersion;
    }

    @JsonProperty("RequestedVersion")
    public void setRequestedVersion(String RequestedVersion) {
        this.RequestedVersion = RequestedVersion;
    }

    // UpdateWindowStart
    private java.time.ZonedDateTime UpdateWindowStart;

    @JsonProperty("UpdateWindowStart")
    public java.time.ZonedDateTime getUpdateWindowStart() {
        return this.UpdateWindowStart;
    }

    @JsonProperty("UpdateWindowStart")
    public void setUpdateWindowStart(java.time.ZonedDateTime UpdateWindowStart) {
        this.UpdateWindowStart = UpdateWindowStart;
    }

    // UpdateWindowEnd
    private java.time.ZonedDateTime UpdateWindowEnd;

    @JsonProperty("UpdateWindowEnd")
    public java.time.ZonedDateTime getUpdateWindowEnd() {
        return this.UpdateWindowEnd;
    }

    @JsonProperty("UpdateWindowEnd")
    public void setUpdateWindowEnd(java.time.ZonedDateTime UpdateWindowEnd) {
        this.UpdateWindowEnd = UpdateWindowEnd;
    }

}