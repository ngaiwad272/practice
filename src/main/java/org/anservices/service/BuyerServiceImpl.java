package org.anservices.service;

import org.anservices.bean.Buyer;
import org.anservices.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerServiceImpl implements BuyerService{

	@Override
	public void submitBuy(Buyer buyer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserDataForBuy(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Autowired public void submitBuy(Buyer buyer) { buyerDao.save(buyer); }
	 * 
	 * @Override public User getUserDataForBuy(int userId) { String fetchUserInfo =
	 * "SELECT szuserid, szname, szemail, szphone, szusername, crole, clogin, cactive"
	 * + " FROM user WHERE szuserid=?"; return
	 * getJdbcTemplate().queryForObject(fetchUserInfo, new UserRowMapper(),userId);
	 * }
	 */

}
