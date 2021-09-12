package io.akhil.SmsSender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.twilio.Twilio;

@Configuration
public class TwilioInitializer {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(TwilioInitializer.class);
	
	private final TwilioConfiguration twilioConfiguration;
	
	@Autowired
	public TwilioInitializer(TwilioConfiguration twilioConfiguration) {
		this.twilioConfiguration=twilioConfiguration;
		
		Twilio.init(twilioConfiguration.getAccountSid(), 
				twilioConfiguration.getAuthToken());
		LOGGER.info("TWILIO INITILALIZED WITH ID " , twilioConfiguration.getAccountSid());
	}
}