/**
 * 
 */
package com.hms.restaurant.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.restaurant.data.UserDetails;

/**
 * @author Administrator
 *
 */
public interface UserDetailsRepository extends JpaRepository<UserDetails, Serializable>{

	UserDetails findByUserName(String userName);
	
	UserDetails findByEmailId(String emailId);	
	
	UserDetails findByPhoneNumber(String phoneNumber);	
	
}
