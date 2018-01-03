/**
 * 
 */
package com.hms.restaurant.data;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name="USERDETAIL")
public class UserDetails implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 3899235389273726541L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	
	@NotEmpty
	@Column(name="USERNAME" , nullable=false)
	private String userName;
	
	@NotEmpty
	@Column(name="PASSWORD" , nullable=false)
	private String password;
	
	@Column(name="EMAILID" , nullable=true)
	private String emailId;
	
	@Column(name="PHONENUMBER" , nullable=true)
	private String phoneNumber;
	
	@NotEmpty
	@Column(name="FULLNAME" , nullable=false)
	private String fullName;
	
	@NotEmpty
	@Column(name="GMAILVERIFIED" , nullable=false)
	private boolean GmailVerified;
	
	@NotEmpty
	@Column(name="VERSION" , nullable=false)
	private int version;
	
	@NotEmpty
	@Column(name="WHENMODIFIED" , nullable=false)
	private Timestamp whenModified;
	
	@NotEmpty
	@Column(name="ACTIVE" , nullable=false)
	private String Active;

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the gmailVerified
	 */
	public boolean isGmailVerified() {
		return GmailVerified;
	}

	/**
	 * @param gmailVerified the gmailVerified to set
	 */
	public void setGmailVerified(boolean gmailVerified) {
		GmailVerified = gmailVerified;
	}

	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/**
	 * @return the whenModified
	 */
	public Timestamp getWhenModified() {
		return whenModified;
	}

	/**
	 * @param whenModified the whenModified to set
	 */
	public void setWhenModified(Timestamp whenModified) {
		this.whenModified = whenModified;
	}

	/**
	 * @return the active
	 */
	public String getActive() {
		return Active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(String active) {
		Active = active;
	}

}
