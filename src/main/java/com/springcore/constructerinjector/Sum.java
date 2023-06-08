package com.springcore.embigity;

public class Sum {
    private int x;
    private int y;

    public Sum(int x,int y){
      this.x=x;
      this.y=y;
        System.out.println("constructor int int call");
    }

    public Sum(double x, double y){
        this.x= (int) x;
          this.y=(int) y;

        System.out.println("constructor double double calling..");
    }

    public void doSum(){
        System.out.println("sum si ="+ (this.x+this.y));
    }
    @Override
    public String toString() {
        return "Sum{" +
                "x=" + x +
                ", x=" + y +
                '}';
    }
}
