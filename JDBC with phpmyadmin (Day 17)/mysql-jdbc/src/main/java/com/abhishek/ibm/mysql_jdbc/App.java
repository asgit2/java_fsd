package com.abhishek.ibm.mysql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class App 
{
	 Connection dbConnect;
	 Statement stment;
	 String query;
	App(){
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
    public static void main( String[] args ){

    	App theApp = new App();
    	Scanner sc=new Scanner(System.in);
    	int choice;
    	while(true) {

    		System.out.println("-------------------------------------------------");
			System.out.println("--------Enter your choics--------");
			System.out.println("1. Add a new Record");
			System.out.println("2. Display all the records");
			System.out.println("3. Update record");
			System.out.println("4. Delate record");
			System.out.println("5. Exit");
			System.out.println("-------------------------------------------------");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
		    	System.out.println("Enter the Employee Details: id | name | Location");
		    	System.out.println("-------------------------------------------------");
		    	theApp.AddEmployeeDetail(sc.nextInt(), sc.nextLine(),sc.nextLine());
		    	System.out.println("-------------------------------------------------");
				break;
			case 2:
				System.out.println("Displaying All the records");
				System.out.println("-------------------------------------------------");
				theApp.getDetails();
				System.out.println("-------------------------------------------------");
				break;
			case 3:
				System.out.println("To Update a records enter ID");
				System.out.println("-------------------------------------------------");
				theApp.UpdateRecord(sc.nextInt(),sc.nextLine(),sc.nextLine());
				System.out.println("-------------------------------------------------");
				break;
			case 4:
				System.out.println(" To Delete a Record enter Id");
				System.out.println("-------------------------------------------------");
				theApp.DeleteRecord(sc.nextInt());
				System.out.println("-------------------------------------------------");
				break;
			case 5:
				System.out.println("-------------------------------------------------");
				System.out.println("Thank You for Using our Service");
				System.out.println("-------------------------------------------------");
				return;
				
			}
    		
    	}

    }
     void AddEmployeeDetail(int id,String name,String loc) {

    	 query ="INSERT into emp_details values(?,?,?)";
    	 try {
			PreparedStatement pstemt = dbConnect.prepareStatement(query);
			pstemt.setInt(1, id);
			pstemt.setString(2, name);
			pstemt.setString(3, loc);
			if(pstemt.executeUpdate() > 0) {
				System.out.println("Details added Successfully");
			}
		} catch (SQLException e) {
			System.out.println("Can get a PreparedStatement : "+e.getMessage());
		}
    	 
    }
     
     
     void DeleteRecord(int id) {
    	 query = "Delete from emp_details where emp_ID="+id;
    	 
    	 try {
			stment.executeUpdate(query);
			System.out.println("Record Deleated successfully...");
			
		} catch (SQLException e) {
			System.out.println("Record Deleation Error:" +e.getMessage());
		}
    	 
     }
     void UpdateRecord(int id,String name,String loc) {
    	 query = "UPDATE emp_details set emp_Name='"+name+ "', emp_Location ='"+loc+"' where emp_ID ="+id;
    	 try {
			if(stment.executeUpdate(query) > 0)
				System.out.println("Records Updated...");
		} catch (SQLException e) {
			System.out.println("Cannot Update details :" +e.getMessage());
		}
     }
    void getDetails() {
    	query = "select * from emp_details";
    	
    	try {
			
			ResultSet rs = stment.executeQuery(query);
			System.out.println("Employee Names & there work location");
			while(rs.next()) {
				System.out.println(rs.getString(2) + "\t" + rs.getString(3));
			}
		} catch (SQLException e) {
			System.out.println("Cannot access the data :" +e.getMessage());
		}
    	
    	
    }
}



