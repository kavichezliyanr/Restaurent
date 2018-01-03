/**
 * 
 */
package com.hms.restaurant.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hms.restaurant.data.UserDetails;
import com.hms.restaurant.services.UserDetailsService;

/**
 * @author Administrator
 *
 */
@RestController
public class UserDetailsController {
	
	
	Log logger=LogFactory.getFactory().getInstance(UserDetailsController.class);
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@RequestMapping(value="/validate" ,consumes="Application/Json" )
	public boolean validate(@RequestParam UserDetails userDetails) {
		logger.info( " UserDetailsController : validate Starting"); 
		return userDetailsService.isUserNameExist(userDetails);
	}
		
}
