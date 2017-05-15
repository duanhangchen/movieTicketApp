package com.cedar.mta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.entity.Ads;
import com.cedar.mta.entity.Movie;
import com.cedar.mta.repository.AdRepository;
import com.cedar.mta.repository.MovieRepository;

@Service
public class AdService {
	@Autowired
	private AdRepository adRepository;
	
	public List<Ads> findAll(){
		return adRepository.findAll();
	}
	public Ads findById(int id) {
		return adRepository.findOne(id);
	}
	
	public List<Ads> findAllAds(){
		return adRepository.findAllAds();
	}

}
