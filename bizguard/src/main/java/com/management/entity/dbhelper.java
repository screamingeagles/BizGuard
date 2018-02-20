package com.management.entity;

public class dbhelper {

	 private static final String UserPassword    = "admin";
	 private static final String UserName        = "root";
	 private static final String url             = "jdbc:mysql://localhost:3306/";
	 private static final String database        = "biz_guard";    

	 
	 public static UserInterface CheckLogin(String UserEmail, String UserPassword) {
		 
		 	UserInterface ui = new UserInterface(0,"","",0); 
		 	java.sql.Connection con = null;
	        try
	        {
	        	String strsSQL  = "Select UserId, Password, UserType from users Where (UserActive=true) AND (UserEmail='" + UserEmail + "')";

	        	//Class.forName("com.mysql.jdbc.Driver");   
	            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	            con = java.sql.DriverManager.getConnection(url+ database + "?zeroDateTimeBehavior=convertToNull&&useSSL=false", UserName, UserPassword);
	            java.sql.Statement statement= con.createStatement();
	            java.sql.ResultSet rs = statement.executeQuery(strsSQL);    
	            
	            while(rs.next()){
	            	System.out.print(UserPassword + " :: " +  rs.getString(2));
	            	if (UserPassword == rs.getString(2)){
	            		ui.setUserId(rs.getInt(1));
	            		ui.setUserEmail(UserEmail);	            	
	            		ui.setUserType(rs.getInt(3));
	            	}
	            	else{
	            		ui.setUserEmail("Does not Match");
	            	}
	            	
	            }
	             rs.close();
	             return ui;
	        }
	        catch (Exception e){
	        	return ui;
	        }
	    }
	 
}
