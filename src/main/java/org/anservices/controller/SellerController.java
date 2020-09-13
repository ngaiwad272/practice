package org.anservices.controller;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpSession;

import org.anservices.bean.Seller;
import org.anservices.bean.User;
import org.anservices.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class SellerController {
	@Autowired
	private SellerService sellerService;
	@RequestMapping(value="sell_form")
	public String sellerForm(Model m,HttpSession session) {
		int userId = (int) session.getAttribute("userId");
		System.out.println("User Id :"+userId);
		User user = sellerService.getUserDataForSell(userId);
		System.out.println("Seller Name :"+user.getName());
		m.addAttribute("sellerName", user.getName());
		m.addAttribute("phone", user.getPhone());
		return "seller";
	}
	
	@RequestMapping(value="submit_sell")
	public String submitSeller(Seller seller) {
		seller.setActive(SellerService.SELL_STATUS_INACTIVE);
		/*
		 * try { if(seller.getsImage()!=null) {
		 * seller.setImageBytes(seller.getsImage().getBytes()); } }catch (Exception e) {
		 * e.printStackTrace(); }
		 */
		sellerService.submitSell(seller);
		//TODO:validation remainig
		return "dashboard";
	}
	@RequestMapping(value="disp_seller")
	public String displaySeller(Model m) {
		m.addAttribute("sellerList", sellerService.fetchSell());
		return "displayseller";
	}
	@RequestMapping(value="view_sell")
	public String viewSeller(Model m,@RequestParam("sellerId")int sellId) {
		m.addAttribute("sellerView", sellerService.getViewSell(sellId));
		return "viewsell";
	}
	@RequestMapping(value="adm_sells")
	public String openAdminSell(Model m, Seller seller) {
		m.addAttribute("sellsList", sellerService.getInactiveSeller(SellerService.SELL_STATUS_INACTIVE));
		return "adminsell";
	}
	/*
	 * @RequestMapping(value="get_inactive_seller") public String
	 * getSellForApproved(Model m, Seller seller) {
	 * 
	 * return "redirect:ad_pan"; }
	 */
}
