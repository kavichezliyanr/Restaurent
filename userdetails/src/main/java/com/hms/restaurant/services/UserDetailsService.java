/**
 * 
 */
package com.hms.restaurant.services;

import java.util.List;

import com.hms.restaurant.data.UserDetails;

/**
 * @author Administrator
 *
 */
public interface UserDetailsService {
	
	UserDetails findById(int Id);
	 
	UserDetails findByUserName(String name);
	
	UserDetails findByEmailId(String name);
	
	UserDetails findByPhoneNUmber(String name);
 
    void saveUserDetails(UserDetails userDetails);
 
    void updateUserDetails(UserDetails userDetail);
 
    void deleteUserDetailsById(int id);
 
    void deleteAllUserDetails();
 
    List<UserDetails> findAllUserDetails();
    
    boolean isUserNameExist(UserDetails userDetails);

}
