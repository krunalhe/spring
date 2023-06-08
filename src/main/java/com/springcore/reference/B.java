package com.springcore.reference;

public class B {
    private int Y;

    public B() {
    }

    public B(int y) {
        Y = y;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    @Override
    public String toString() {
        return "B{" +
                "Y=" + Y +
                '}';
    }
}
