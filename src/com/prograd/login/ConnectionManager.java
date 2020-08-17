package com.prograd.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	public Connection getConnection() throws SQLException, ClassNotFoundException {
		//register the driver class usinf forName of class .dynamical y load the driver class
		Class.forName("oracle.jdbc.OracleDriver");
		
		//CREATE THE CONNECTION OBJECT
		Connection con =null;
		//connecting to database
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","nethranayana@123");
		if(con!=null) {
			System.out.println("connection establish");
		}
		return con;
	}
	
	
}
