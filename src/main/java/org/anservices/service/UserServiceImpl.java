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

}
