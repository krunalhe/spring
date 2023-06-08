package com.springcore.constructerinjector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCI {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ciconfig.xml");
        Person p= (Person) context.getBean("person");
        System.out.println(p);
        Student student= (Student) context.getBean("student");
        System.out.println(student);
        Sum sum=(Sum) context.getBean("sum");
        sum.doSum();

    }
}
