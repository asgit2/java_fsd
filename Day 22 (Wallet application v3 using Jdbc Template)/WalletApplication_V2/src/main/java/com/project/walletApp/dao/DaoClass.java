package com.project.walletApp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.walletApp.bean.AccountDetails;
import com.project.walletApp.bean.transection_tabel;

@Repository
public class DaoClass implements DaoInterface{
	
	DataSource dataSource;
	JdbcTemplate jdbcTemplate;
	String query;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void storeDetails(AccountDetails accountDetails) {
		query ="INSERT into accountdetails values (?,?,?)";
		jdbcTemplate.update(query,
				new Object[] {
						accountDetails.getAccountNo(),
						accountDetails.getAccountHolderName(),
						accountDetails.getTotalAmount()
				});
	}
	public boolean SerchAccount(int accountNo) {
		query = "SELECT `Account Number` FROM `accountdetails` WHERE Account Number =?";
		if(!(jdbcTemplate.queryForObject(query,Boolean.class,accountNo)))
			return true;
		return false;
	}
	
	public void UpdateAmmount(int accountNo,double amount) {
		query = "SELECT `Amount` FROM `accountdetails` WHERE Account Number =?";
		double CurrentAmount = jdbcTemplate.queryForObject(query,Double.class,accountNo); 
		double updatedAmount = amount + CurrentAmount;
		query = "UPDATE accountdetails set amount = ? where `Account Number` = ?";
		jdbcTemplate.update(query, updatedAmount,accountNo);
	}
	public void Withdraw(int accountNo, double amount) {
		query = "SELECT `Amount` FROM `accountdetails` WHERE Account Number =?";
		double CurrentAmount = jdbcTemplate.queryForObject(query,Double.class ,accountNo);
		double updatedAmount=0.0;
		if(CurrentAmount > amount) {
			updatedAmount = CurrentAmount- amount;
		}
		jdbcTemplate.update("UPDATE accountdetails set amount = ? where `Account Number` = ?", updatedAmount, accountNo);
		
	}
	public boolean FundsTransfer(int accountFrom,int accountTo,double amount) {
		double CurrentBalance = jdbcTemplate.queryForObject("SELECT `Amount` FROM `accountdetails` WHERE Account Number =?",
				Double.class, accountFrom);
		if(CurrentBalance >=amount) {
			Withdraw(accountFrom, amount);    		// Withdraw from accountFrom
			UpdateAmmount( accountTo,amount);		// Deposite to another Account	
			jdbcTemplate.update("INSERT into transection_tabel values(?,?,?,?)",
					GetTransectionDate(),accountFrom,accountTo,amount);
			return true;
		}
		return false;
		
	}
	
	private String GetTransectionDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date date = new java.util.Date();
		return (formatter.format(date));
	}
	
	public List<AccountDetails> CheckBalance(int accountNo) {
		return jdbcTemplate.query("SELECT * FROM `accountdetails` WHERE Account Number =?",
				(ResultSet rs, int rowNum) -> new accountdetails(
						rs.getInt(1),rs.getString(2),rs.getDouble(3);
						),accountNo);
	}

	public List<transection_tabel> viewTransections(int accountFrom) {
		return jdbcTemplate.query("Select * From transection_tabel",
				(ResultSet rs,int rowNum) -> new transection_tabel(
						rs.getDate(1),rs.getInt(2),rs.getInt(3),rs.getDouble(4))
				);	
	}
}
