package org.anservices.service;

import org.anservices.bean.Buyer;
import org.anservices.bean.User;

public interface BuyerService {
	public static final Integer BUY_STATUS_ACTIVE=1;
	public static final Integer BUY_STATUS_INACTIVE=2;
	
	/**
	 * The Method handle the buyer information task.
	 * @param buyer the new buyer detail as buyer Object.
	 */
	public void submitBuy(Buyer buyer);
	/**
	 * The Method handle the users information for buy 
	 * @param userId get only records of userId
	 * @return
	 */
	public User getUserDataForBuy(int userId);
}
