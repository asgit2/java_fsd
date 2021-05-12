package com.collections.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ParticipantsDetails {

	public static void main(String[] args) throws InputMismatchException {
		Scanner sc = new Scanner(System.in);
		HashMap map = new HashMap();
		int choice;
		while(true) {
			System.out.println("-------------------------------------------------");
			System.out.println("--------Enter your choics--------");
			System.out.println("1. Enter new Participant Record");
			System.out.println("2. View All Participants Details");
			System.out.println("3. Update Participants Details");
			System.out.println("4. Delate Participants Details");
			System.out.println("5. Exit");
			System.out.println("-------------------------------------------------");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the Details of the Participants");
				System.out.println("Enter Id");
				int id = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter Skills");
				String skills = sc.next();
				Details obj = new Details(id,name,skills);
				map.put(id, obj);
				
				System.out.println("Details added Successfully");
				System.out.println("-------------------------------------------------");
				break;
			case 2:
				System.out.println("----------------Participants Deatils---------------");
				Set set = map.entrySet();
				for(Object ref: set) {
					Map.Entry me = (Map.Entry)ref;
					System.out.println("ID : " + me.getKey());
					System.out.println("Name : "+ ((Details) me.getValue()).getName());
					System.out.println("Skills : "+ ((Details) me.getValue()).getSkills());
					System.out.println("-------------------------------------------------");
				}
				
				break;
			case 3:
				System.out.println("-------------------------------------------------");
				System.out.println("To Update participants details \n Enter ID");
				 id = sc.nextInt();
				if(map.containsKey(id)) {
					System.out.println("Enter Name");
					name = sc.next();
					((Details) map.get(id)).setName(name);
					System.out.println("Enter skills");
					skills = sc.next();
					((Details) map.get(id)).setSkills(skills);
					System.out.println("Details Successfully Updated");
				}
				else {
					System.out.println("No Records found !!");
				}
				System.out.println("-------------------------------------------------");
				break;
			case 4:
				System.out.println("-------------------------------------------------");
				System.out.println("To Delete data \n enter Id");
				id= sc.nextInt();
				if(map.containsKey(id)) {
					map.remove(id);
					System.out.println("Record Deleted!!");
				}
				else {
					System.out.println("No Record found!!");
				}
				System.out.println("-------------------------------------------------");
				break;
			case 5:
				System.out.println("Thank You for using our Service");
				return;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}
	}

}

