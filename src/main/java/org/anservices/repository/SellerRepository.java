package org.anservices.repository;

import java.util.List;

import org.anservices.bean.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Integer>{
	List<Seller> findByActive(Integer cactive);
	Seller findBySellerId(Integer sellerId);
}
