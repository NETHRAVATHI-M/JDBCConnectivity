package com.prograd.login;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {

	public void add(RegisterPojo pojo) throws ClassNotFoundException, SQLException {
	String firstName =	pojo.getFirstName();
	String lastName = pojo.getLastName();
	String userName = pojo.getUserName();
	String password = pojo.getPassword();
	String email = pojo.getEmail();
	ConnectionManager cm = new ConnectionManager();
	//INSERT DATA INTO DATABASE
	String sql ="insert into USERDETAILS(firstName,lastName,userName,password,email)VALUES(?,?,?,?,?)";
	//CREATE STATEMENT
	PreparedStatement st = cm.getConnection().prepareStatement(sql);
	st.setString(1, firstName);
	st.setString(2, lastName);
	st.setString(3, userName);
	st.setString(4, password);
	st.setString(5, email);
	st.executeUpdate();
	cm.getConnection().close();
		
	}
}
