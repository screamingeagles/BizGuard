package com.management.entity;

public class dbhelper {

	 private static final String dbPassword    = "admin";
	 private static final String dbName        = "root";
	 private static final String url             = "jdbc:mysql://localhost:3306/";
	 private static final String database        = "biz_guard";    

	 
	 public static UserInterface CheckLogin(String UserEmail, String UserPassword) {
		 	System.out.print("\nIn Checking");
		 
		 	UserInterface ui = new UserInterface(0,"","",0); 
		 	java.sql.Connection con = null;
	        try
	        {
	        	String strsSQL  = "Select UserId, Password, UserType from users Where (UserActive=true) AND (UserEmail='" + UserEmail + "')";
	            Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); //Class.forName("com.mysql.jdbc.Driver");
	            con = java.sql.DriverManager.getConnection(url+ database + "?zeroDateTimeBehavior=convertToNull&&useSSL=false", dbName, dbPassword);
	            
	            java.sql.Statement statement= con.createStatement();
	            java.sql.ResultSet rs = statement.executeQuery(strsSQL);    
	            while(rs.next()){
	            	
	            	if (UserPassword.equals(rs.getString(2))){
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
