/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Sun Apr 16 12:59:17 EDT 2017
 */
package com.redhat.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject OpportunityLineItem
 */
@XStreamAlias("OpportunityLineItem")
public class OpportunityLineItem extends AbstractSObjectBase {

    // OpportunityId
    private String OpportunityId;

    @JsonProperty("OpportunityId")
    public String getOpportunityId() {
        return this.OpportunityId;
    }

    @JsonProperty("OpportunityId")
    public void setOpportunityId(String OpportunityId) {
        this.OpportunityId = OpportunityId;
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

    // PricebookEntryId
    private String PricebookEntryId;

    @JsonProperty("PricebookEntryId")
    public String getPricebookEntryId() {
        return this.PricebookEntryId;
    }

    @JsonProperty("PricebookEntryId")
    public void setPricebookEntryId(String PricebookEntryId) {
        this.PricebookEntryId = PricebookEntryId;
    }

    // Product2Id
    private String Product2Id;

    @JsonProperty("Product2Id")
    public String getProduct2Id() {
        return this.Product2Id;
    }

    @JsonProperty("Product2Id")
    public void setProduct2Id(String Product2Id) {
        this.Product2Id = Product2Id;
    }

    // ProductCode
    private String ProductCode;

    @JsonProperty("ProductCode")
    public String getProductCode() {
        return this.ProductCode;
    }

    @JsonProperty("ProductCode")
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    // Quantity
    private Double Quantity;

    @JsonProperty("Quantity")
    public Double getQuantity() {
        return this.Quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Double Quantity) {
        this.Quantity = Quantity;
    }

    // TotalPrice
    private Double TotalPrice;

    @JsonProperty("TotalPrice")
    public Double getTotalPrice() {
        return this.TotalPrice;
    }

    @JsonProperty("TotalPrice")
    public void setTotalPrice(Double TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    // UnitPrice
    private Double UnitPrice;

    @JsonProperty("UnitPrice")
    public Double getUnitPrice() {
        return this.UnitPrice;
    }

    @JsonProperty("UnitPrice")
    public void setUnitPrice(Double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    // ListPrice
    private Double ListPrice;

    @JsonProperty("ListPrice")
    public Double getListPrice() {
        return this.ListPrice;
    }

    @JsonProperty("ListPrice")
    public void setListPrice(Double ListPrice) {
        this.ListPrice = ListPrice;
    }

    // ServiceDate
    private java.time.ZonedDateTime ServiceDate;

    @JsonProperty("ServiceDate")
    public java.time.ZonedDateTime getServiceDate() {
        return this.ServiceDate;
    }

    @JsonProperty("ServiceDate")
    public void setServiceDate(java.time.ZonedDateTime ServiceDate) {
        this.ServiceDate = ServiceDate;
    }

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

}
