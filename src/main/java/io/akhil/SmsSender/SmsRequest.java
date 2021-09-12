package io.akhil.SmsSender;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmsRequest {
	
	private final String phoneNumber;
    private final String messages ;
	
	public SmsRequest(@JsonProperty("phoneNumber")String phoneNumber, 
						@JsonProperty("message") String messages) {
		super();
		this.phoneNumber = phoneNumber;
		this.messages = messages;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getMessages() {
		return messages;
	}
	@Override
	public String toString() {
		return "SmsRequest [phoneNumber=" + phoneNumber + ", messages=" + messages + "]";
	}
	

}
