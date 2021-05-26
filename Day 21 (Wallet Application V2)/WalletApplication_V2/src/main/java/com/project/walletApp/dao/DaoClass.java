package com.project.walletApp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Repository;

@Repository
public class DaoClass implements DaoInterface{
	
	Connection DaoClass;
	 Statement stment;
	 String query;
	 

	public DaoClass(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password ="";
			String dbUrl = "jdbc:mysql://localhost:3306/wallet_application";
			
			this.DaoClass = DriverManager.getConnection(dbUrl,username,password);
			this.stment = this.DaoClass.createStatement();

			
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found" +e.getMessage());
		}catch(SQLException e) {
			System.out.println("Issues with the Connectivity: " +e.getMessage());
		}
		
	}
	// store the details of new account
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
	
	//check if its a valid account number 
	public boolean SerchAccount(int accountNo) {
		query = "SELECT `Account Number` FROM `accountdetails` WHERE Account Number =?";
		PreparedStatement pstmt;
		try {
			pstmt = DaoClass.prepareStatement(query);
			pstmt.setInt(1,accountNo);
			ResultSet rs = pstmt.executeQuery(query);
			if(rs != null) {
				return true;
			}
			else
				return false;
		} catch (SQLException e) {
			System.out.println("Issue with Insertion " + e.getMessage());
		}
		return false;
	}
	// To update the amount in database 
	public void UpdateAmmount(int accountNo, double amount) {
		query = "SELECT `Amount` FROM `accountdetails` WHERE Account Number =?";
		PreparedStatement pstmt;
		try {
			pstmt = DaoClass.prepareStatement(query);
			pstmt.setInt(1,accountNo);
			ResultSet rs = pstmt.executeQuery(query);
			double updatedAmount = amount + rs.getDouble(1);
			query = "UPDATE accountdetails set amount = ? where `Account Number` = ?";
			pstmt = DaoClass.prepareStatement(query);
			pstmt.setDouble(1,updatedAmount);
			pstmt.setInt(2, accountNo);
			pstmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Issue with Insertion " + e.getMessage());
		}
	}
	
	// To Update The amount of database
	public void Withdraw(int accountNo, double amount) {
		query = "SELECT `Amount` FROM `accountdetails` WHERE Account Number =?";
		PreparedStatement pstmt;
		try {
			pstmt = DaoClass.prepareStatement(query);
			pstmt.setInt(1,accountNo);
			ResultSet rs = pstmt.executeQuery(query);
			double updatedAmount;
			if(rs.getDouble(1) > amount) {
				updatedAmount = rs.getDouble(1)- amount;
			}
			else {
				// Exception handle 
				return;
			}
			query = "UPDATE accountdetails set amount = ? where `Account Number` = ?";
			pstmt = DaoClass.prepareStatement(query);
			pstmt.setDouble(1,updatedAmount);
			pstmt.setInt(2, accountNo);
			pstmt.executeUpdate(query);
			
		} catch (SQLException e) {
			System.out.println("Issue with Insertion " + e.getMessage());
		}
	}
	
	public boolean FundsTransfer(int accountFrom,int accountTo,double amount){
		query = "SELECT `Amount` FROM `accountdetails` WHERE Account Number =?";
		PreparedStatement pstmt;
		try {
			pstmt = DaoClass.prepareStatement(query);
			pstmt.setInt(1,accountFrom);
			ResultSet rs = pstmt.executeQuery(query);
			if(rs.getDouble(1) >=amount) {
				Withdraw(accountFrom, amount);    		// Withdraw from accountFrom
				UpdateAmmount( accountTo,amount);		// Deposite to another Account	
				
				query = "INSERT into transection_tabel values(?,?,?,?)";
				pstmt = DaoClass.prepareStatement(query);
				pstmt.setString(1, GetTransectionDate());
				pstmt.setInt(2, accountFrom);
				pstmt.setInt(3, accountTo);
				pstmt.setDouble(4, amount);
				pstmt.executeQuery(query);
				return true;
			}
			return false;
		} catch (SQLException e) {
			System.out.println("Issue with Insertion " + e.getMessage());
		}
		return false;
	}
	
	private String GetTransectionDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date date = new java.util.Date();
		return (formatter.format(date));
	}
	public void CheckBalance(int accountNo) {
		query = "SELECT * FROM `accountdetails` WHERE Account Number =?";
		PreparedStatement pstmt;
		try {
			pstmt = DaoClass.prepareStatement(query);
			pstmt.setInt(1,accountNo);
			ResultSet rs = pstmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("----------------------------------------------------------");
				System.out.println("Account Number :"+ rs.getInt(1));
				System.out.println("Account Holder Name :" +rs.getString(2));
				System.out.println("Amount :" +rs.getDouble(3));
				System.out.println("----------------------------------------------------------");
			}
			
			
		} catch (SQLException e) {
			System.out.println("Issue ! " + e.getMessage());
		}
	}
	
	public void viewTransections(int accountFrom) {
		query = "Select * From transection_tabel";
		PreparedStatement pstmt;
		try {
			pstmt = DaoClass.prepareStatement(query);
			pstmt.setInt(1,accountFrom);
			ResultSet rs = pstmt.executeQuery(query);
			
			System.out.println("Date Of Transection" +rs.getString(1));
			System.out.println("Account Number "+rs.getInt(2));
			System.out.println("Funds Transfered to");
			System.out.println("Account Number " +rs.getInt(3));
			System.out.println("Total Amount Transfered : " +rs.getDouble(4));
			
		} catch (SQLException e) {
			System.out.println("Transection not found " + e.getMessage());
		}
		
	}
	
	

}
