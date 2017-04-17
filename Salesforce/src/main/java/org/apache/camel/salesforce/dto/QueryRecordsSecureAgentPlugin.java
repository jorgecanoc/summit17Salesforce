/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type SecureAgentPlugin
 */
public class QueryRecordsSecureAgentPlugin extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<SecureAgentPlugin> records;

    public List<SecureAgentPlugin> getRecords() {
        return records;
    }

    public void setRecords(List<SecureAgentPlugin> records) {
        this.records = records;
    }
}