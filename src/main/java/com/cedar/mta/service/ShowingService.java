package com.cedar.mta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.entity.Showing;
import com.cedar.mta.repository.ShowingRepository;

@Service
public class ShowingService {
	
	@Autowired
	private ShowingRepository showingRepository;	
	
	public List<Showing> findAll(){
		return showingRepository.findAll();
	}
	
	public Showing findById(Integer id){
		return showingRepository.findOne(id);
	}

	public Showing findById(int id) {
		return showingRepository.findOne(id);
	}
	
	public List<Showing> findShowing(Integer theaterid) {
		return showingRepository.findShowing(theaterid);
	}
	
	public List<Showing> findShowingByMovie(Integer theaterid,Integer movieid,java.sql.Date date){
		return showingRepository.findShowingByMovie(theaterid, movieid, date);
	}
	
}
