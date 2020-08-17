package com.prograd.login;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {

	public boolean validate(LoginPoojo login) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		String userName = login.getUserName();
		String password = login.getPassword();
		ConnectionManager  con = new ConnectionManager();
		Statement st = con.getConnection().createStatement();
		ResultSet rs = st.executeQuery("select * from USERDETAILS");
		boolean b = false;
		while(rs.next()) {
			if(userName.equals(rs.getString("USERNAME")) && password.equals(rs.getString("PASSWORD"))) {
				con.getConnection().close();
				return true;
			}
			else {
				con.getConnection().close();
				
				
			}
			
		}
		
		return false;
		
		
	}
	
	

}
