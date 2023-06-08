package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jalebi {
    private double price;
    private String type;

    public Jalebi() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Jalebi{" +
                "price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
    @PostConstruct
    public void Start(){
        System.out.println("method started..!!!");
    }
    @PreDestroy
    public void End(){
        System.out.println("method ended...");
    }
}
