package org.fkit.service;

import org.fkit.domain.Reviews;

public interface ReviewsService {

	Reviews findOrderId(Reviews reviews);
	void addReviews(Reviews reviews);
	
}
