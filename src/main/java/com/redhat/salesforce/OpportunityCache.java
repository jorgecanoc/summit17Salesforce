package com.redhat.salesforce;

import java.util.ArrayList;
import java.util.List;

import com.redhat.salesforce.dto.Opportunity;

public class OpportunityCache{
	
	List<Opportunity> opportunties = new ArrayList<Opportunity>();

	public void clearOpps() throws Exception {
		
		 opportunties.clear();
	     
	}
	
	public void addOpps(Opportunity newOpp) throws Exception {
		
		 opportunties.add(newOpp);
	     
	}
	
	public List<Opportunity> getAllOpps() throws Exception {
		
		 return opportunties;
	     
	}

}
