package com.company;

public class Bags {
    private double size;
    private int amount;

    public Bags( double size, int amount) {
        this.size=size;
        this.amount=amount;
    }

    public void capableSize() {
        if (size > 10) {
            System.out.println("is Okay");
        }
        else {
            System.out.println("is Small");
        }
    }

    public void isEnought() {
        if (amount > 10) {
            System.out.println("Is enough");
        }
        else {
            System.out.println("Not enough");
        }
    }
}
