package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("lcconfig.xml");
//        Samosa s1= (Samosa) context.getBean("samosa");
//        System.out.println(s1);
//        context.registerShutdownHook();
//        System.out.println("++++++++++++++++++++++++++++");
//        Sprite s2= (Sprite) context.getBean("colddrink");
//        System.out.println(s2);
//        context.registerShutdownHook();
//        System.out.println("+++++++++++++++++++++++++++++");
        Jalebi j= (Jalebi) context.getBean("jalebi");
        System.out.println(j);
        context.registerShutdownHook();



    }
}
