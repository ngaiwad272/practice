package org.anservices.service;

import java.util.List;

import org.anservices.bean.User;
import org.anservices.exception.UserBlockedException;


public interface UserService {
	public static final Integer ACC_STATUS_ACTIVE=1;
	public static final Integer ACC_STATUS_INACTIVE=2;
	public static final Integer ACC_STATUS_BLOCKED=3;
	
	public static final Integer ROLE_ADMIN=1;
	public static final Integer ROLE_USER_SELLER=2;
	public static final Integer ROLE_USER=3;
	/**
	 * The Method handle the user Registration task.
	 * @param user the new user detail as user Object.
	 */
	public void register(User user);
	/**
	 * The Method handle login operation(authantication) using given credential
	 * it returns User object when sucess and null when failed.
	 * when user account is blocked an exception will be thrown by this method 
	 * @param loginName
	 * @param password
	 * @return
	 * @throws com.ngservices.exception.UserBlockedException when user account is blocked
	 */
	public User login(String loginName, String password) throws UserBlockedException;
	/**
	 * Call this method to get list of registered user
	 * @return
	 */
	public List<User> getUserList();
	/**
	 * This Method change the user login status for details passed as argument. 
	 * @param userId
	 * @param loginStatus
	 */
	public void changeLoginStatus(Integer userId, Integer loginStatus);
	/**
	 * Checke the userName availability
	 * @param username
	 * @return
	 */
	public boolean isUserNameExist(String username);
	/**
	 * get all pending seller for approve
	 * @param rolFlag
	 * @param active
	 * @return
	 */
	public List<User> getInactiveSeller(Integer rolFlag, Integer active);
}
