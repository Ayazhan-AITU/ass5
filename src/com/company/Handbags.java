package com.company;

public interface Handbags {
   public void isOpen();
   default void isBought() {
        System.out.println("NO");
    }






}
