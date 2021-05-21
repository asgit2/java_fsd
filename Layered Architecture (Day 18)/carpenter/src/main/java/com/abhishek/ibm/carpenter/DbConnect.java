package com.abhishek.ibm.carpenter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {

	Connection dbConnect;
	 Statement stment;
	 String query;
	DbConnect(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password ="";
			String dbUrl = "jdbc:mysql://localhost:3306/ibm_tranning";
			
			this.dbConnect = DriverManager.getConnection(dbUrl,username,password);
			this.stment = this.dbConnect.createStatement();

			
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found" +e.getMessage());
		}catch(SQLException e) {
			System.out.println("Issue with the connectivity : "+e.getMessage());
		}
	}
	public void sortBy(int ch) {
	   	 query = "Select * from carpenter_info";
	   	 if(ch == 1) {
	   		 query +=" "+ "order by id";
	   	 }
	   	 else if(ch ==2) {
	   		 query += " " + "order by name ";
	   	 }
	   	 else if(ch ==3) {
	   		 query += " "+"order by age";
	   	 }
	   	 else {
	   		 System.out.println("Cannot sort the data");
	   		 return;
	   	 }
	   	 try {
				ResultSet rs = stment.executeQuery(query);
				System.out.println("Carpenter Details");
				while(rs.next()) {
					System.out.println("\t"+rs.getString(1)+"\t"+rs.getString(2) + "\t\t" + rs.getString(3) + "\t"+ rs.getString(4));
				}
			} catch (SQLException e) {
				System.out.println("Cannot access the data :" +e.getMessage());
			}
			
	}
	void AddEmployeeDetail(int id,String name,String loc,int age) {

	   	 query ="INSERT into carpenter_info values(?,?,?,?)";
	   	 try {
				PreparedStatement pstemt = dbConnect.prepareStatement(query);
				pstemt.setInt(1, id);
				pstemt.setString(2, name);
				pstemt.setString(3, loc);
				pstemt.setInt(4, age);
				if(pstemt.executeUpdate() > 0) {
					System.out.println("Details added Successfully");
				}
			} catch (SQLException e) {
				System.out.println("Can get a PreparedStatement : "+e.getMessage());
			}
	   	 
   }
    
    
    void DeleteRecord(int id) {
	   	 query = "Delete from carpenter_info where ID="+id;
	   	 
	   	 try {
				stment.executeUpdate(query);
				System.out.println("Record Deleated successfully...");
				
			} catch (SQLException e) {
				System.out.println("Record Deleation Error:" +e.getMessage());
			}
	   	 
    }
    void UpdateRecord(int id,String name,String loc,int age) {
	   	 query ="UPDATE carpenter_info set Name= ?, Address = ?, Age = ? where ID=?";
	   	 try {
				PreparedStatement pstemt = dbConnect.prepareStatement(query);
				pstemt.setString(1, name);
				pstemt.setString(2, loc);
				pstemt.setInt(3, age);
				pstemt.setInt(4, id);
				if(pstemt.executeUpdate() > 0) {
					System.out.println("Records Updated Successfully");
				}
			} catch (SQLException e) {
				System.out.println("Cannot Update details :" +e.getMessage());
			}
    }
    
   void getDetails() {
	   	query = "select * from carpenter_info";
	   	
	   	try {
				ResultSet rs = stment.executeQuery(query);
				System.out.println("Carpenter Details");
				while(rs.next()) {
					System.out.println("\t"+rs.getString(1)+"\t"+rs.getString(2) + "\t\t" + rs.getString(3) + "\t"+ rs.getString(4));
				}
			} catch (SQLException e) {
				System.out.println("Cannot access the data :" +e.getMessage());
			}
	  
	   }

}
