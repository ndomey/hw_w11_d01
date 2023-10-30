package org.example;

public class Main {
    public static void main(String[] args) {

        Planets planets = new Planets("Mars", 908973);

        System.out.println(planets.getName() + " is " + planets.getSize());

        System.out.println(planets.explode());
    }
}