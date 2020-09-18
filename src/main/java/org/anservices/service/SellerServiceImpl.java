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
	public Seller getViewSell(Integer sellId) {
		return sellerRepository.findBySellerId(sellId);
	}

	@Override
	public List<Seller> getActiveInactiveSeller(Integer cactive) {
		return sellerRepository.findByActive(cactive);
	}

	@Override
	public boolean setActive(Integer sellerId) {
		try {
			Seller seller = sellerRepository.findBySellerId(sellerId);
			seller.setActive(SELL_STATUS_ACTIVE);
			sellerRepository.save(seller);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
