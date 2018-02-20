package com.management.entity;

public class UserInterface {
	
	  private Integer UserId;
	  private String UserName;
	  private String UserEmail;
	  private Integer UserType;
	  
	  
	  public UserInterface(Integer userId, String userName, String userEmail, Integer userType){
		  UserId = userId;
		  UserName = userName;
		  UserEmail = userEmail;
		  UserType = userType;
	  }
	  public Integer getUserId() {
		return UserId;
	}
	  public void setUserId(Integer userId) {
		UserId = userId;
	}
	  public String getUserName() {
		return UserName;
	}
	  public void setUserName(String userName) {
		UserName = userName;
	}
	  public String getUserEmail() {
		return UserEmail;
	}
	  public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	  public Integer getUserType() {
		return UserType;
	}
	  public void setUserType(Integer userType) {
		UserType = userType;
	}

}
