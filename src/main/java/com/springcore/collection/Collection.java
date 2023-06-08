package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Collection {
    public static void main(String[] args) {
        System.out.println("program started");

        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Employee emp= (Employee) context.getBean("emp");
        System.out.println(emp);

    }
}
