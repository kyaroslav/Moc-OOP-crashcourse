package com.moc.oop.examples.part0.example1;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/5/11
 * Time: 5:57 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Calculator {

    protected double operandA;
    protected double operandB;


    public Calculator(){
        this(0,0);
    }

    public Calculator(double operandA,double operandB){
        this.operandA=operandA;
        this.operandB=operandB;
    }

    public abstract double calculate();


}
