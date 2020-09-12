package org.anservices.controller;

import javax.servlet.http.HttpSession;

import org.anservices.bean.Buyer;
import org.anservices.bean.User;
import org.anservices.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BuyerController {
	
	@Autowired
	private BuyerService buyerService;
	
	@RequestMapping(value="buyer_form")
	public String buyerForm(Model m,HttpSession session) {
		int userId = (int) session.getAttribute("userId");
		System.out.println("User Id :"+userId);
		User user = buyerService.getUserDataForBuy(userId);
		System.out.println("Buyer Name :"+user.getName());
		m.addAttribute("buyerName", user.getName());
		m.addAttribute("phone", user.getPhone());
		return "buyer";
	}
	@RequestMapping(value="submit_buy")
	public String submitBuyer(Buyer buyer) {
		//Seller seller = cmd.getSeller();
		buyer.setActive(BuyerService.BUY_STATUS_ACTIVE);
		buyerService.submitBuy(buyer);
		//TODO:validation remainig
		return "dashboard";
	}
}
