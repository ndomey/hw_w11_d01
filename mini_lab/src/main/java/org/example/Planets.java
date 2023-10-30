package org.example;

public class Planets {

    private String name;
    private int size;

    public Planets(String inputName, int inputSize){
        this.name = inputName;
        this.size = inputSize;
    }

    public String getName(){
        return this.name;
    }

    public int getSize(){
        return this.size;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setSize(int newSize){
        this.size = newSize;
    }

    public String explode(){
        return "Boom! " + this.name + " has exploded";
    }

}
