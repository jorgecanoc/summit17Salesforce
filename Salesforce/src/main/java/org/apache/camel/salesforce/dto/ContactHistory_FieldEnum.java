/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Field
 */
public enum ContactHistory_FieldEnum {

    // Account
    ACCOUNT("Account"),
    // AssistantName
    ASSISTANTNAME("AssistantName"),
    // AssistantPhone
    ASSISTANTPHONE("AssistantPhone"),
    // Birthdate
    BIRTHDATE("Birthdate"),
    // CleanStatus
    CLEANSTATUS("CleanStatus"),
    // Department
    DEPARTMENT("Department"),
    // Description
    DESCRIPTION("Description"),
    // DoNotCall
    DONOTCALL("DoNotCall"),
    // Email
    EMAIL("Email"),
    // EmailBouncedDate
    EMAILBOUNCEDDATE("EmailBouncedDate"),
    // EmailBouncedReason
    EMAILBOUNCEDREASON("EmailBouncedReason"),
    // Fax
    FAX("Fax"),
    // FirstName
    FIRSTNAME("FirstName"),
    // HasOptedOutOfEmail
    HASOPTEDOUTOFEMAIL("HasOptedOutOfEmail"),
    // HasOptedOutOfFax
    HASOPTEDOUTOFFAX("HasOptedOutOfFax"),
    // HomePhone
    HOMEPHONE("HomePhone"),
    // Jigsaw
    JIGSAW("Jigsaw"),
    // Languages__c
    LANGUAGES__C("Languages__c"),
    // LastName
    LASTNAME("LastName"),
    // LeadSource
    LEADSOURCE("LeadSource"),
    // Level__c
    LEVEL__C("Level__c"),
    // MailingAddress
    MAILINGADDRESS("MailingAddress"),
    // MailingCity
    MAILINGCITY("MailingCity"),
    // MailingCountry
    MAILINGCOUNTRY("MailingCountry"),
    // MailingGeocodeAccuracy
    MAILINGGEOCODEACCURACY("MailingGeocodeAccuracy"),
    // MailingLatitude
    MAILINGLATITUDE("MailingLatitude"),
    // MailingLongitude
    MAILINGLONGITUDE("MailingLongitude"),
    // MailingPostalCode
    MAILINGPOSTALCODE("MailingPostalCode"),
    // MailingState
    MAILINGSTATE("MailingState"),
    // MailingStreet
    MAILINGSTREET("MailingStreet"),
    // MobilePhone
    MOBILEPHONE("MobilePhone"),
    // Name
    NAME("Name"),
    // OtherAddress
    OTHERADDRESS("OtherAddress"),
    // OtherCity
    OTHERCITY("OtherCity"),
    // OtherCountry
    OTHERCOUNTRY("OtherCountry"),
    // OtherGeocodeAccuracy
    OTHERGEOCODEACCURACY("OtherGeocodeAccuracy"),
    // OtherLatitude
    OTHERLATITUDE("OtherLatitude"),
    // OtherLongitude
    OTHERLONGITUDE("OtherLongitude"),
    // OtherPhone
    OTHERPHONE("OtherPhone"),
    // OtherPostalCode
    OTHERPOSTALCODE("OtherPostalCode"),
    // OtherState
    OTHERSTATE("OtherState"),
    // OtherStreet
    OTHERSTREET("OtherStreet"),
    // Owner
    OWNER("Owner"),
    // Phone
    PHONE("Phone"),
    // ReportsTo
    REPORTSTO("ReportsTo"),
    // Salutation
    SALUTATION("Salutation"),
    // Title
    TITLE("Title"),
    // contactCreatedFromLead
    CONTACTCREATEDFROMLEAD("contactCreatedFromLead"),
    // contactMerged
    CONTACTMERGED("contactMerged"),
    // contactUpdatedByLead
    CONTACTUPDATEDBYLEAD("contactUpdatedByLead"),
    // created
    CREATED("created"),
    // feedEvent
    FEEDEVENT("feedEvent"),
    // locked
    LOCKED("locked"),
    // ownerAccepted
    OWNERACCEPTED("ownerAccepted"),
    // ownerAssignment
    OWNERASSIGNMENT("ownerAssignment"),
    // unlocked
    UNLOCKED("unlocked");

    final String value;

    private ContactHistory_FieldEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ContactHistory_FieldEnum fromValue(String value) {
        for (ContactHistory_FieldEnum e : ContactHistory_FieldEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}