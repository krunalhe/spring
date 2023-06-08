package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Collection {
    public static void main(String[] args) {
        System.out.println("program started");

        ApplicationContext context=new ClassPathXmlApplicationContext("collectionconfig.xml");
        Employee emp= (Employee) context.getBean("emp");
        System.out.println("name of employee"+ emp.getName());
        System.out.println("phone numbers of employee" + emp.getPhone());
        System.out.println("addresses of employee" + emp.getAddresses());
        System.out.println("course completed by employee" + emp.getCourses());
        System.out.println("id pass"+ emp.getProperties());

    }
}
