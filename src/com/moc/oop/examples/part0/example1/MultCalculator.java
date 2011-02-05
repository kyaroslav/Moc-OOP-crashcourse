package com.moc.oop.examples.part0.example1;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/5/11
 * Time: 6:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class MultCalculator extends Calculator {


    public MultCalculator(){
        this(0,0);
    }

    public MultCalculator(double operandA, double operandB){
        super(operandA,operandB);
    }


    @Override
    double calculate() {
        return this.operandA*this.operandB;
    }
}
