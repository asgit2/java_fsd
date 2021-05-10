//package com.cg.eis.exception;
import java.util.*;
public class employee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of Employee");
        String name = sc.nextLine();
        System.out.println("Enter salary");
        int sal = sc.nextInt();
        try{
            if(sal<3000){
                throw new EmployeeException("Salary less the 3000");
            }
            else{
                System.out.println("Name :"+name);
                System.out.println("Salary :"+sal);
            }
        }
        catch(EmployeeException ref){
            System.out.println(ref);
        }
    }
}
/*
class EmployeeException extends Exception{
    public EmployeeException(String msg){
        super(msg);
    }
}
*/