package com.cedar.mta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.entity.MailMail;

@Service
public class MailService {

	@Autowired
	private MailMail mail;

	public void sentMail(String subject,String body) {
		String sender = "kaka.sanchay@gmail.com";// write here sender gmail id
		String receiver = "duanhang.chen@stonybrook.edu";// write here receiver
															// id
		mail.sendMail(sender, receiver, subject, body);

		System.out.println("success");
	}
}
