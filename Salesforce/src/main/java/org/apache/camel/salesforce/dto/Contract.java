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
 * Salesforce DTO for SObject Contract
 */
@XStreamAlias("Contract")
public class Contract extends AbstractSObjectBase {

    // AccountId
    private String AccountId;

    @JsonProperty("AccountId")
    public String getAccountId() {
        return this.AccountId;
    }

    @JsonProperty("AccountId")
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    // Pricebook2Id
    private String Pricebook2Id;

    @JsonProperty("Pricebook2Id")
    public String getPricebook2Id() {
        return this.Pricebook2Id;
    }

    @JsonProperty("Pricebook2Id")
    public void setPricebook2Id(String Pricebook2Id) {
        this.Pricebook2Id = Pricebook2Id;
    }

    // OwnerExpirationNotice
    @XStreamConverter(PicklistEnumConverter.class)
    private Contract_OwnerExpirationNoticeEnum OwnerExpirationNotice;

    @JsonProperty("OwnerExpirationNotice")
    public Contract_OwnerExpirationNoticeEnum getOwnerExpirationNotice() {
        return this.OwnerExpirationNotice;
    }

    @JsonProperty("OwnerExpirationNotice")
    public void setOwnerExpirationNotice(Contract_OwnerExpirationNoticeEnum OwnerExpirationNotice) {
        this.OwnerExpirationNotice = OwnerExpirationNotice;
    }

    // StartDate
    private java.time.ZonedDateTime StartDate;

    @JsonProperty("StartDate")
    public java.time.ZonedDateTime getStartDate() {
        return this.StartDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(java.time.ZonedDateTime StartDate) {
        this.StartDate = StartDate;
    }

    // EndDate
    private java.time.ZonedDateTime EndDate;

    @JsonProperty("EndDate")
    public java.time.ZonedDateTime getEndDate() {
        return this.EndDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(java.time.ZonedDateTime EndDate) {
        this.EndDate = EndDate;
    }

    // BillingStreet
    private String BillingStreet;

    @JsonProperty("BillingStreet")
    public String getBillingStreet() {
        return this.BillingStreet;
    }

    @JsonProperty("BillingStreet")
    public void setBillingStreet(String BillingStreet) {
        this.BillingStreet = BillingStreet;
    }

    // BillingCity
    private String BillingCity;

    @JsonProperty("BillingCity")
    public String getBillingCity() {
        return this.BillingCity;
    }

    @JsonProperty("BillingCity")
    public void setBillingCity(String BillingCity) {
        this.BillingCity = BillingCity;
    }

    // BillingState
    private String BillingState;

    @JsonProperty("BillingState")
    public String getBillingState() {
        return this.BillingState;
    }

    @JsonProperty("BillingState")
    public void setBillingState(String BillingState) {
        this.BillingState = BillingState;
    }

    // BillingPostalCode
    private String BillingPostalCode;

    @JsonProperty("BillingPostalCode")
    public String getBillingPostalCode() {
        return this.BillingPostalCode;
    }

    @JsonProperty("BillingPostalCode")
    public void setBillingPostalCode(String BillingPostalCode) {
        this.BillingPostalCode = BillingPostalCode;
    }

    // BillingCountry
    private String BillingCountry;

    @JsonProperty("BillingCountry")
    public String getBillingCountry() {
        return this.BillingCountry;
    }

    @JsonProperty("BillingCountry")
    public void setBillingCountry(String BillingCountry) {
        this.BillingCountry = BillingCountry;
    }

    // BillingLatitude
    private Double BillingLatitude;

    @JsonProperty("BillingLatitude")
    public Double getBillingLatitude() {
        return this.BillingLatitude;
    }

    @JsonProperty("BillingLatitude")
    public void setBillingLatitude(Double BillingLatitude) {
        this.BillingLatitude = BillingLatitude;
    }

    // BillingLongitude
    private Double BillingLongitude;

    @JsonProperty("BillingLongitude")
    public Double getBillingLongitude() {
        return this.BillingLongitude;
    }

    @JsonProperty("BillingLongitude")
    public void setBillingLongitude(Double BillingLongitude) {
        this.BillingLongitude = BillingLongitude;
    }

    // BillingAddress
    private org.apache.camel.component.salesforce.api.dto.Address BillingAddress;

    @JsonProperty("BillingAddress")
    public org.apache.camel.component.salesforce.api.dto.Address getBillingAddress() {
        return this.BillingAddress;
    }

    @JsonProperty("BillingAddress")
    public void setBillingAddress(org.apache.camel.component.salesforce.api.dto.Address BillingAddress) {
        this.BillingAddress = BillingAddress;
    }

    // ContractTerm
    private Integer ContractTerm;

    @JsonProperty("ContractTerm")
    public Integer getContractTerm() {
        return this.ContractTerm;
    }

    @JsonProperty("ContractTerm")
    public void setContractTerm(Integer ContractTerm) {
        this.ContractTerm = ContractTerm;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private Contract_StatusEnum Status;

    @JsonProperty("Status")
    public Contract_StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(Contract_StatusEnum Status) {
        this.Status = Status;
    }

    // CompanySignedId
    private String CompanySignedId;

    @JsonProperty("CompanySignedId")
    public String getCompanySignedId() {
        return this.CompanySignedId;
    }

    @JsonProperty("CompanySignedId")
    public void setCompanySignedId(String CompanySignedId) {
        this.CompanySignedId = CompanySignedId;
    }

    // CompanySignedDate
    private java.time.ZonedDateTime CompanySignedDate;

    @JsonProperty("CompanySignedDate")
    public java.time.ZonedDateTime getCompanySignedDate() {
        return this.CompanySignedDate;
    }

    @JsonProperty("CompanySignedDate")
    public void setCompanySignedDate(java.time.ZonedDateTime CompanySignedDate) {
        this.CompanySignedDate = CompanySignedDate;
    }

    // CustomerSignedId
    private String CustomerSignedId;

    @JsonProperty("CustomerSignedId")
    public String getCustomerSignedId() {
        return this.CustomerSignedId;
    }

    @JsonProperty("CustomerSignedId")
    public void setCustomerSignedId(String CustomerSignedId) {
        this.CustomerSignedId = CustomerSignedId;
    }

    // CustomerSignedTitle
    private String CustomerSignedTitle;

    @JsonProperty("CustomerSignedTitle")
    public String getCustomerSignedTitle() {
        return this.CustomerSignedTitle;
    }

    @JsonProperty("CustomerSignedTitle")
    public void setCustomerSignedTitle(String CustomerSignedTitle) {
        this.CustomerSignedTitle = CustomerSignedTitle;
    }

    // CustomerSignedDate
    private java.time.ZonedDateTime CustomerSignedDate;

    @JsonProperty("CustomerSignedDate")
    public java.time.ZonedDateTime getCustomerSignedDate() {
        return this.CustomerSignedDate;
    }

    @JsonProperty("CustomerSignedDate")
    public void setCustomerSignedDate(java.time.ZonedDateTime CustomerSignedDate) {
        this.CustomerSignedDate = CustomerSignedDate;
    }

    // SpecialTerms
    private String SpecialTerms;

    @JsonProperty("SpecialTerms")
    public String getSpecialTerms() {
        return this.SpecialTerms;
    }

    @JsonProperty("SpecialTerms")
    public void setSpecialTerms(String SpecialTerms) {
        this.SpecialTerms = SpecialTerms;
    }

    // ActivatedById
    private String ActivatedById;

    @JsonProperty("ActivatedById")
    public String getActivatedById() {
        return this.ActivatedById;
    }

    @JsonProperty("ActivatedById")
    public void setActivatedById(String ActivatedById) {
        this.ActivatedById = ActivatedById;
    }

    // ActivatedDate
    private java.time.ZonedDateTime ActivatedDate;

    @JsonProperty("ActivatedDate")
    public java.time.ZonedDateTime getActivatedDate() {
        return this.ActivatedDate;
    }

    @JsonProperty("ActivatedDate")
    public void setActivatedDate(java.time.ZonedDateTime ActivatedDate) {
        this.ActivatedDate = ActivatedDate;
    }

    // StatusCode
    @XStreamConverter(PicklistEnumConverter.class)
    private Contract_StatusCodeEnum StatusCode;

    @JsonProperty("StatusCode")
    public Contract_StatusCodeEnum getStatusCode() {
        return this.StatusCode;
    }

    @JsonProperty("StatusCode")
    public void setStatusCode(Contract_StatusCodeEnum StatusCode) {
        this.StatusCode = StatusCode;
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

    // ContractNumber
    private String ContractNumber;

    @JsonProperty("ContractNumber")
    public String getContractNumber() {
        return this.ContractNumber;
    }

    @JsonProperty("ContractNumber")
    public void setContractNumber(String ContractNumber) {
        this.ContractNumber = ContractNumber;
    }

    // LastApprovedDate
    private java.time.ZonedDateTime LastApprovedDate;

    @JsonProperty("LastApprovedDate")
    public java.time.ZonedDateTime getLastApprovedDate() {
        return this.LastApprovedDate;
    }

    @JsonProperty("LastApprovedDate")
    public void setLastApprovedDate(java.time.ZonedDateTime LastApprovedDate) {
        this.LastApprovedDate = LastApprovedDate;
    }

}