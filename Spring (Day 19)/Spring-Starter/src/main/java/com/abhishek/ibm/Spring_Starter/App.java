package com.abhishek.ibm.Spring_Starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");
    Engineer theEngineer = context.getBean("theEnginner", Engineer.class);
    
    theEngineer.workForwages();
    //System.out.println(theEngineer);
    
    
    
    
    
    /*
    
    ClassPathXmlApplicationContext studentContext = new ClassPathXmlApplicationContext("applicationContent.xml");
    Student stud = studentContext.getBean("student",Student.class);
    //System.out.println(stud);
     * 
     */
    }
    
}
