package com.cedar.mta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.repository.MovieRepository;
import com.cedar.mta.repository.SupportFormRepository;

@Service
public class SupportFormService {
	
	@Autowired
	private SupportFormRepository supportFormRepository;
	
	public void addSupport(String body,String title,String email){
		supportFormRepository.addForm(body, title, email);
	}
}
