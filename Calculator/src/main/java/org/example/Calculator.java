package org.example;

public class Calculator {

    private int num_1;
    private int num_2;
    private double num_3;
    private double num_4;

    public Calculator(int inputNum_1, int inputNum_2, int inputNum_3, int inputNum_4){
    this.num_1 = inputNum_1;
    this.num_2 = inputNum_2;
    this.num_3 = inputNum_3;
    this.num_4 = inputNum_4;
    }

    public int add(){
        return this.num_1 + this.num_2;
    }

    public int sub(){
        return this.num_2 - this.num_1;
    }

    public int mult(){
        return this.num_1 * this.num_2;
    }

    public double div(){
        return this.num_3 / this.num_4;
    }

}
