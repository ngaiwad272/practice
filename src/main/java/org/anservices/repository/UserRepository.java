package org.anservices.repository;

import java.util.List;

import org.anservices.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUnameAndPassword(String loginName, String password);
	User findByUserId(Integer userId);
	List<User> findByActiveAndRole(Integer active,Integer rolFlag);

}
