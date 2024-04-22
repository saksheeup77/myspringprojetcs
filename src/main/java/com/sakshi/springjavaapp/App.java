package com.sakshi.springjavaapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
   
     ApplicationContext ct = new ClassPathXmlApplicationContext("spring.xml");
     Student obj = (Student) ct.getBean("student1");
     Address obj1 =(Address) ct.getBean("address");
     
     obj1.setCity("Gurgaon");
     obj1.setState("Haryana");
     obj.setStudentAddress(obj1);
     obj.setStudentId(1);
     obj.setStudentName("SAKSHI");
     System.out.println(obj);
    }
}
