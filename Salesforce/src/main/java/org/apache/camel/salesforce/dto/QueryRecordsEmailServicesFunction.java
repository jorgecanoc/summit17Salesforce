/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type EmailServicesFunction
 */
public class QueryRecordsEmailServicesFunction extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<EmailServicesFunction> records;

    public List<EmailServicesFunction> getRecords() {
        return records;
    }

    public void setRecords(List<EmailServicesFunction> records) {
        this.records = records;
    }
}