package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Sprite implements InitializingBean , DisposableBean {
    private double price;

    public Sprite() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sprite{" +
                "price=" + price +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("method of destroy ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("method of init");
    }
}
