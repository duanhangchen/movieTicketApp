package com.cedar.mta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.repository.ActorRepository;
import com.cedar.mta.repository.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
	private TransactionRepository transactionRepository;	
	
	public void addTransaction(Integer user_id,double price,String date){
		transactionRepository.addTransaction(user_id, price, date);
	}
}
