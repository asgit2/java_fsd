package com.project.ibm.jdbc_Template;

import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class jdbcDao {

	DataSource dataSource;
	JdbcTemplate jdbcTemplate;
	String query;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	int getCount() {
		query="Select count(*) from emp_details";
		return jdbcTemplate.queryForObject(query, Integer.class);
	}
	
	String getEmp_Name(int id) {
		query = "Select Emp_Name from emp_details where emp_ID = ?";
			String result= jdbcTemplate.queryForObject(query, new Object[] {id},String.class);
			return result;
		
	}
//	List<emp_details> printData() {
//		
//		return jdbcTemplate.query("select * from emp_details", new emp_mapper());
//	}
	
	List<emp_details> printData() {
		
		return jdbcTemplate.query("select * from emp_details",
				(ResultSet rs, int rowNum) -> new emp_details(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3)
						)
				);
	}
	
	void AddNewRecord(emp_details emp) {
		String query = "INSERT into emp_details values(?,?,?)";
		jdbcTemplate.update(query,
				new Object[] {
						emp.getEmp_Id(),
						emp.getEmp_Name(),
						emp.getEmp_Location()
				});
	}
	void UpdateRecord(emp_details emp) {
		jdbcTemplate.update("UPDATE emp_details set emp_Name = ?, emp_Location =? where emp_ID = ?",
				new Object[] {
						emp.getEmp_Name(),
						emp.getEmp_Location(),
						emp.getEmp_Id()
				});
	}
	void DeleteRecord(int id) {
		jdbcTemplate.update("DELETE from emp_details where emp_ID =?",id);
	}
	


// As I have implemented with lambds so dont need this 

//	class emp_mapper implements RowMapper<emp_details>{
//
//		public emp_details mapRow(ResultSet rs, int rowNum) throws SQLException {
//			emp_details emp = new emp_details();
//			emp.setEmp_Id(rs.getInt(1));
//			emp.setEmp_Name(rs.getString(2));
//			emp.setEmp_Location(rs.getString(3));
//			return emp;
//		}
//		
//	}
	

}
