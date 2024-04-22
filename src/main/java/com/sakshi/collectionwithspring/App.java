package com.sakshi.collectionwithspring;

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
    	String str="";
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student student=(Student) context.getBean("student");
        //context.getBean() --> will return an OBJECT
        //student --> Student type so we will downcast it.
        System.out.println(student);
    }
}
