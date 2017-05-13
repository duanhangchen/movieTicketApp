package com.cedar.mta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.entity.NewsLetter;
import com.cedar.mta.repository.NewsLetterRepository;

@Service
public class NewsLetterService {
	
	@Autowired
	private NewsLetterRepository newsLetterRepository;
	
	public List<NewsLetter> findAll(){
		return newsLetterRepository.findAll();
	}
	
	
	

}
