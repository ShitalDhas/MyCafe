package com.MyCafeManagement.JWT;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.MyCafeManagement.POJO.User;
import com.MyCafeManagement.dao.UserDao;

import java.util.ArrayList;
import java.util.Objects;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerUsersDetailsService implements UserDetailsService {
	private final UserDao userDao = null;
    private User userDetail;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 log.info("Inside loadUserByUsername {}", username);
	        userDetail = userDao.findByEmailId(username);
	        if(!Objects.isNull(userDetail))
	            return new org.springframework.security.core.userdetails.User(userDetail.getEmail(), userDetail.getPassword(),new ArrayList<>());
	        else throw new UsernameNotFoundException("User not found");
	    }

	public User getUserDetail() {
		return userDetail;
	}
}
