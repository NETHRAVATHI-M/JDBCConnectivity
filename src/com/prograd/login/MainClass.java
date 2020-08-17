package com.prograd.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		System.out.println("1 .Register");
		System.out.println("2. Login");
		int x;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		RegisterPojo pojo = new RegisterPojo();
		RegisterDAO dao =  new RegisterDAO();
		LoginDao daologin = new LoginDao();
		LoginPoojo login = new  LoginPoojo();
		x = Integer.parseInt(br.readLine());
		switch(x) {
		case 1: System.out.println("Enter FIRST NAME");
				String firstName = br.readLine();
				System.out.println("Enter Last name");
				String lastName = br.readLine();
				System.out.println("Enter Username");
				String userName = br.readLine();
				System.out.println("Enter password");
				String password = br.readLine();
				System.out.println("Enter email");
				String email = br.readLine();
				pojo.setFirstName(firstName);
				pojo.setLastName(lastName);
				pojo.setUserName(userName);
				pojo.setPassword(password);
				pojo.setEmail(email);
				dao.add(pojo);
		
				break;
		case 2:System.out.println("Enter Username");
			String Name = br.readLine();
			
			System.out.println("Enter password");
			String word = br.readLine();
			login.setUserName(Name);
			login.setPassword(word);
			if(daologin.validate(login)==true) {
				Luck luck = new Luck();
				luck.display();
				
			}else {
				System.out.println("login not success");
			}
				break;
		}
	}

}
