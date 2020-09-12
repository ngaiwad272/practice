package org.anservices.service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.anservices.bean.Seller;
import org.anservices.bean.User;
import org.anservices.repository.SellerRepository;
import org.anservices.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService{

	@Autowired
	private SellerRepository sellerRepository;
	@Autowired
	private UserRepository userRepository;
	@Override
	public void submitSell(Seller seller) {
		sellerRepository.save(seller);
	}

	@Override
	public User getUserDataForSell(Integer userId) {
		return userRepository.findByUserId(userId);
	}

	@Override
	public List<Seller> fetchSell() {
		return sellerRepository.findAll();
	}

	@Override
	public List<Seller> getViewSell(Integer sellId) {
		
		return sellerRepository.findBySellerId(sellId);
	}

	@Override
	public List<Seller> getInactiveSeller(Integer cactive) {
		return sellerRepository.findByActive(cactive);
	}

	/*
	 * @Override public void submitSell(Seller seller) { sellerDao.save(seller); }
	 * 
	 * @Override public User getUserDataForSell(int userId) { String fetchUserInfo =
	 * "SELECT szuserid, szname, szemail, szphone, szusername, crole, clogin, cactive"
	 * + " FROM user WHERE szuserid=?"; return
	 * getJdbcTemplate().queryForObject(fetchUserInfo, new UserRowMapper(),userId);
	 * }
	 * 
	 * @Override public List<Seller> fetchSell() { String
	 * getAll="SELECT szsellid, szuserid, szphone, sztype, szsubtype, szaddress, sztilldate, szactive, szimage1 FROM sell"
	 * ; return getJdbcTemplate().query(getAll, new SellerRowMapper() ); }
	 * 
	 * @Override public List<Seller> getViewSell(int sellId) { String fetchSell =
	 * "SELECT szsellid, szuserid, szphone, sztype, szsubtype, szaddress, sztilldate, szactive, szimage1"
	 * +" FROM sell WHERE szsellid=?"; return getJdbcTemplate().query(fetchSell, new
	 * SellerRowMapper(),sellId); }
	 */
	
	
}
