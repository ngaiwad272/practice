package org.anservices.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.anservices.bean.User;
import org.anservices.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Override
	public void changeLoginStatus(Integer userId, Integer loginStatus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isUserNameExist(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void register(User user) {
		userRepository.save(user);
	}

	@Override
	public User login(String loginName, String password)
			throws org.anservices.exception.UserBlockedException {
		return userRepository.findByUnameAndPassword(loginName, password);
	}

	@Override
	public List<org.anservices.bean.User> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getInactiveSeller(Integer rolFlag, Integer active) {

		return userRepository.findByActiveAndRole(active,rolFlag);
	}

	@Override
	public User getUserById(Integer userid) {
		return userRepository.findByUserId(userid);
	}

	@Override
	public boolean setActive(Integer userid) {
		try {
			User user = userRepository.findByUserId(userid);
			user.setActive(ACC_STATUS_ACTIVE);
			userRepository.save(user);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean saveProfile(Integer userId, User user) {
		User olduser = userRepository.findByUserId(userId);
		olduser.setName(user.getName());
		olduser.setEmail(user.getEmail());
		olduser.setPhone(user.getPhone());
		olduser.setSzimage1(user.getSzimage1());
		olduser.setAddress(user.getAddress());
		olduser.setCountry(user.getCountry());
		olduser.setState(user.getState());
		olduser.setDistrict(user.getDistrict());
		olduser.setTaluka(user.getTaluka());
		olduser.setCity(user.getCity());
		olduser.setPincode(user.getPincode());
		olduser.setProedit(PROFILE_EDIT_YES);
		olduser.setAadhar(user.getAadhar());
		userRepository.save(olduser);
		return true;
	}

}
