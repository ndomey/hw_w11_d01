package org.example;

public class Bottle {

    private int volume;

    public Bottle(){
        this.volume = 100;
    }

    public int haveASip(){
        return this.volume - 10;
    }

    public int bottomUp(){
        return this.volume = 0;
    }

    public int refill(){
        return this.volume = 100;
    }

    public int isItFull(){
        return this.volume;
    }

}
