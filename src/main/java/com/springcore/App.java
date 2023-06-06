package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello krunal");

        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       Student student=(Student) context.getBean("student");
        System.out.println(student);
    }
}
