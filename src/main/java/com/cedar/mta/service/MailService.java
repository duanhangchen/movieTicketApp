package com.cedar.mta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.entity.MailMail;

@Service
public class MailService {
	@Autowired
	private MailMail mail;

	public void sendMailForSignUp() {
		String sender = "kaka.sanchay@gmail.com";// write here sender gmail id
		String receiver = "duanhang.chen@stonybrook.edu";// write here receiver
		String subject="Welcome to Cedar Movie Ticket App";
		String body="You have been registered for Cedar Movie Ticket App!";
		mail.sendMail(sender, receiver, subject, body);
	}
}
