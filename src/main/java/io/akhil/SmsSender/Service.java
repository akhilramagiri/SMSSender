package io.akhil.SmsSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@org.springframework.stereotype.Service
public class Service {
 private final SmsSender smsSender;
@Autowired
public Service(@Qualifier("twilio")SmsSender smsSender) {
	super();
	this.smsSender = smsSender;
}

 public void sendSms(SmsRequest smsRequest) {
	smsSender.sendSms(smsRequest);
 }
}
