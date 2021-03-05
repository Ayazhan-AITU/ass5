package com.company;

import com.company.Handbags;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
	// write your code here
        Handbags bag1 = new Handbags() {
            public void isOpen() {
                System.out.println("YES");
            }
        };

        bag1.isBought();
        bag1.isOpen();

        final Bags bag2 = Bags.class.getConstructor(double.class, int.class).newInstance(30.0, 50);

        bag2.capableSize();
        bag2.isEnought();
    }
}
