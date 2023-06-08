package com.springcore.lifecycle;

public class Samosa {
    private double price;


    public Samosa(){
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        System.out.println("setting property");
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
    public void hello(){
        System.out.println("i am here");
    }
    public void bye(){
        System.out.println("i will back");
    }
}
