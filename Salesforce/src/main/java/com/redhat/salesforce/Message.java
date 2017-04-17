package com.redhat.salesforce;

public class Message {

	private String alert;
	private String sound= "default";
	
	
	public String getAlert() {
		return alert;
	}
	public void setAlert(String alert) {
		this.alert = alert;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	
	
	
}
