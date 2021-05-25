package com.project.walletApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
//@PropertySource("classpath:db.properties")
public class DaoClass implements DaoInterface{
	
	Connection DaoClass;
	 Statement stment;
	 String query;
	 

	//@PropertySource("classpath:db.properties")
	public DaoClass(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			@Value("${username}")
			String username = "root";
//			@Value("${password}")
			String password ="";
//			@Value("${dburl}")
			String dbUrl = "jdbc:mysql://localhost:3306/accountdetails";
			
			this.DaoClass = DriverManager.getConnection(dbUrl,username,password);
			this.stment = this.DaoClass.createStatement();

			
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found" +e.getMessage());
		}catch(SQLException e) {
			System.out.println("Issues with the Connectivity: " +e.getMessage());
		}
	}

	public void storeDetails(int accountNumber,String name, double amount) {

		String query = "INSERT into accountdetails values (?,?,?)";
		PreparedStatement pstmt;
		try {
			pstmt = DaoClass.prepareStatement(query);
			pstmt.setInt(1,accountNumber);
			pstmt.setString(2, name);
			pstmt.setDouble(3, amount);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Issue with Insertion " + e.getMessage());
		}
		
		
	}
	

}
