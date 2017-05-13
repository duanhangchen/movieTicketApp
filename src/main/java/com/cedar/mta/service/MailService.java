package com.cedar.mta.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.entity.MailMail;

@Service
public class MailService {
	@Autowired
	private MailMail mail;

	public void sendMailForSignUp(String email) {
		String sender = "teamcedar308@gmail.com";// write here sender gmail id
		String subject="Welcome to Cedar Movie Ticket App";
		String body="You have been registered for Cedar Movie Ticket App!";
		mail.sendMail(sender, email, subject, body);
	}
	
	public void sendMailForGiftCard(String email, BigDecimal amount, String recipient, String sender, String code, String message){
		String sender2 = "teamcedar308@gmail.com";
		String subject = "You got a Cedar Movie Gift Card";
		String body = "Hi, " + recipient + '\n' 
				+ "   " + sender + " sent you a" + " $" + amount + " Cedar Movie Gift Card!" + "\n\n\n"
				+ "			" + message + "\n\n\n"
				+ "To redeem this card, log into Cedar Movie and enter the following code" + '\n'
				+ "    " + code + '\n'
				+ "Happy Movie Watching!";
		mail.sendMail(sender2, email, subject, body);
	}
}
