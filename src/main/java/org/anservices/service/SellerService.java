package org.anservices.service;

import java.util.List;

import org.anservices.bean.Seller;
import org.anservices.bean.User;


public interface SellerService {
	public static final Integer SELL_STATUS_ACTIVE=1;
	public static final Integer SELL_STATUS_INACTIVE=0;
	
	/**
	 * The Method handle the seller information task.
	 * @param seller the new seller detail as seller Object.
	 */
	public void submitSell(Seller seller);
	/**
	 * The Method handle the users information for sell 
	 * @param userId get only records of userId
	 * @return
	 */
	public User getUserDataForSell(Integer userId);
	/**
	 * This Method handles all sell for display
	 * @return
	 */
	public List<Seller> fetchSell();
	/**
	 * 
	 * @return :specific sell for view
	 */
	public List<Seller> getViewSell(Integer sellId);
	/**
	 * 
	 * @param cactive get all Inactive seller for approve
	 * @return
	 */
	public List<Seller> getInactiveSeller(Integer cactive);
}
