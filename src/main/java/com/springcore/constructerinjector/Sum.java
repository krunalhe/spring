package com.springcore.constructerinjector;

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
public Sum(String x ,String y){
        this.x= Integer.parseInt(x);
        this.y=Integer.parseInt(y);

    System.out.println("constructor String String call");
}
    public void doSum(){
        System.out.println("value of x" + this.x);
        System.out.println("value of y" + this.y);
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
