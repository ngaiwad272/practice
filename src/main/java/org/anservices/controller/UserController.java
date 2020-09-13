package org.anservices.controller;

import javax.servlet.http.HttpSession;

import org.anservices.bean.User;
import org.anservices.command.LoginCommand;
import org.anservices.exception.UserBlockedException;
import org.anservices.service.SellerService;
import org.anservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/reg_form")
	public String registrationForm() {
		System.out.println("In user Controller registration form");
		return "registration";//JSP
	}
	
	@RequestMapping(value="/register")
	public String registerUser(User user) {
		try {
			System.out.println("In user Controller register user");
			if(user.getRolFlag()=="user") {
				user.setRole(UserService.ROLE_USER);
				user.setActive(UserService.ACC_STATUS_ACTIVE);
			}else {
				user.setRole(UserService.ROLE_USER_SELLER);
				user.setActive(UserService.ACC_STATUS_INACTIVE);
			}
			userService.register(user);
			return "redirect:login?act=reg";
		}
		catch(DuplicateKeyException e) {
			e.printStackTrace();
			//m.addAttribute("err", "UserName is already registered. please select another username");
			return "reg_form";
		}
	}
	@RequestMapping(value= {"/","/login"})
	public String login(Model m) {
		//m.addAttribute("command", new LoginCommand());
		return "login";	
	}
	@RequestMapping(value= "/hlogin", method = RequestMethod.POST)
	public String handleLogin(@ModelAttribute("command") LoginCommand cmd, Model m, HttpSession session) {
		try {
			User loggedInUser = userService.login(cmd.getUname(), cmd.getPassword());
			if(loggedInUser == null) {
				//add error message and go back to login-form
				m.addAttribute("err","Login Faild: Enter valid credentials");
				return "login";
			}
			else {
				//SUCCESS
				//Check the role and redirect to appropriate role control
				if(loggedInUser.getRole().equals(UserService.ROLE_ADMIN)) {
					//add Admin User detail in session(assign session to logged in user)
					addUserInSession(loggedInUser, session);
					return "redirect:dboard";
				}
				else if(loggedInUser.getRole().equals(UserService.ROLE_USER_SELLER)) {
					addUserInSession(loggedInUser, session);
					return "redirect:dboard";
				}
				else if(loggedInUser.getRole().equals(UserService.ROLE_USER)){
					//add General User detail in session(assign session to logged in user)
					addUserInSession(loggedInUser, session);
					return "redirect:dboard";
				}
				else {
					//add error message and go back to login-form
					m.addAttribute("err", "Invalid User Role");
					return "login";
				}
			}
		} catch (UserBlockedException e) {
			//add error message and go back to login-form
			m.addAttribute("err", e.getMessage());
			return "login";
		}
	}
	@RequestMapping(value= {"/dboard"})
	public String dashboard() {
		//m.addAttribute("command", new LoginCommand());
		return "dashboard";	
	}
	private void addUserInSession(User user,HttpSession session) {
		System.out.println("called: addUserSession()");
		session.setAttribute("user", user);
		System.out.println("userId:"+user.getUserId());
		session.setAttribute("userId", user.getUserId());
		System.out.println("role"+ user.getRole());
		session.setAttribute("role", user.getRole());
		System.out.println("username"+ user.getUname());
		session.setAttribute("username", user.getUname());
	}
	@RequestMapping(value= "/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login?act=lo";
	}
	@RequestMapping(value="/adm_seller")
	public String openAdminUser(User user, Model m) {
		Integer role= UserService.ROLE_USER_SELLER;
		Integer active=UserService.ACC_STATUS_INACTIVE;
		m.addAttribute("sellerList", userService.getInactiveSeller(role, active));
		return "adminseller";
	}
	@RequestMapping(value="/getseller")
	public String getUserInfo(@RequestParam("userId")Integer userId,Model m) {
		m.addAttribute("seller",userService.getUserById(userId));
		return "viewsellerinfo";
	}
	@RequestMapping(value = "/set_active_seller")
	public String setActive() {
		
		return null;
	}
}
