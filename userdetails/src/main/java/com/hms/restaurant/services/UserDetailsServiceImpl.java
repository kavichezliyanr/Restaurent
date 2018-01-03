/**
 * 
 */
package com.hms.restaurant.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hms.restaurant.data.UserDetails;
import com.hms.restaurant.repository.UserDetailsRepository;

/**
 * @author Administrator
 *
 */
@Service("userDetailsService")
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	UserDetailsRepository userDetailsRepository;

	@Override
	public UserDetails findById(int Id) {
		return userDetailsRepository.findOne(Id);
	}

	@Override
	public UserDetails findByUserName(String name) {
		// TODO Auto-generated method stub
		return userDetailsRepository.findByUserName(name);
	}

	@Override
	public UserDetails findByEmailId(String emailId) {
		// TODO Auto-generated method stub
		return userDetailsRepository.findByEmailId(emailId);
	}

	@Override
	public UserDetails findByPhoneNUmber(String phoneNumber) {
		// TODO Auto-generated method stub
		return userDetailsRepository.findByPhoneNumber(phoneNumber);
	}

	@Override
	public void saveUserDetails(UserDetails userDetails) {
		userDetails.setWhenModified(new Timestamp(System.currentTimeMillis()));
		userDetailsRepository.save(userDetails);
	}

	@Override
	public void updateUserDetails(UserDetails userDetail) {
		saveUserDetails(userDetail);
	}

	@Override
	public void deleteUserDetailsById(int id) {
		UserDetails userDetails = findById(id);
		userDetails.setActive("D");
		saveUserDetails(userDetails);
	}

	@Override
	public void deleteAllUserDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserDetails> findAllUserDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUserNameExist(UserDetails userDetails) {
		UserDetails userDetail = findByUserName(userDetails.getUserName());
			if(userDetail.getPassword().equals(userDetails.getPassword())) {
				return true;
			}
		return false;
	}

}
