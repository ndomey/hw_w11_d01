package org.example;

public class Main {
    public static void main(String[] args) {
        Bottle bottle = new Bottle();
        System.out.println(bottle.haveASip());
        System.out.println(bottle.bottomUp());
        System.out.println(bottle.refill());
    }
}