package com.cedar.mta.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.entity.GiftCard;
import com.cedar.mta.entity.Movie;
import com.cedar.mta.repository.GiftRepository;
import com.cedar.mta.repository.MovieRepository;

@Service
public class GiftService {
	@Autowired
	private GiftRepository giftRepository;
	
	
	public List<GiftCard> findAll(){
		return giftRepository.findAll();
	}
	public GiftCard findById(int id) {
		return giftRepository.findOne(id);
	}
	
	List<GiftCard> findAllGiftCardByAccountId(int id){
		return giftRepository.findAllGiftCardByAccountId(id);
	}
	
	List<GiftCard> findGiftCardByCode(String code){
		return giftRepository.findGiftCardByCode(code);
	}
	
	public void insertGiftCard(BigDecimal amount, String code, int id){
		giftRepository.insertGiftCard(amount, code, id);
	}

}
