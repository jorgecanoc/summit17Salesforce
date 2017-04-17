package com.redhat.salesforce;

public class MessageService {
	
	public MsgResponse alert(String opptyid, String name){
		
		MsgResponse msgresponse = new MsgResponse();
		Message msg = new Message();
		msg.setAlert("opptyid: " + opptyid + " with " + name + " in Salesforce has been closed!");
		
		msgresponse.setMessage(msg);
		return msgresponse;
	}

}
