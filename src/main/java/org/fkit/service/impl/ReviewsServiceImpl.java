package org.fkit.service.impl;

import org.fkit.domain.Reviews;
import org.fkit.mapper.ReviewsMapper;
import org.fkit.service.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("reviewsService")
public class ReviewsServiceImpl implements ReviewsService  {
	
	@Autowired
	private ReviewsMapper reviewsMapper;
	
	@Override
	public Reviews findOrderId(Reviews reviews){
		return reviewsMapper.findOrderId(reviews);
	}
	
	@Override
	public void addReviews(Reviews reviews){
		reviewsMapper.addReviews(reviews);
	}
}
