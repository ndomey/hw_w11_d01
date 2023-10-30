package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(3, 5, 8, 7);
        System.out.println(calculator.add());
        System.out.println(calculator.sub());
        System.out.println(calculator.mult());
        System.out.println(calculator.div());
    }
}