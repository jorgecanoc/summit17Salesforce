/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject FeedPollChoice
 */
@XStreamAlias("FeedPollChoice")
public class FeedPollChoice extends AbstractSObjectBase {

    // FeedItemId
    private String FeedItemId;

    @JsonProperty("FeedItemId")
    public String getFeedItemId() {
        return this.FeedItemId;
    }

    @JsonProperty("FeedItemId")
    public void setFeedItemId(String FeedItemId) {
        this.FeedItemId = FeedItemId;
    }

    // Position
    private Integer Position;

    @JsonProperty("Position")
    public Integer getPosition() {
        return this.Position;
    }

    @JsonProperty("Position")
    public void setPosition(Integer Position) {
        this.Position = Position;
    }

    // ChoiceBody
    private String ChoiceBody;

    @JsonProperty("ChoiceBody")
    public String getChoiceBody() {
        return this.ChoiceBody;
    }

    @JsonProperty("ChoiceBody")
    public void setChoiceBody(String ChoiceBody) {
        this.ChoiceBody = ChoiceBody;
    }

}