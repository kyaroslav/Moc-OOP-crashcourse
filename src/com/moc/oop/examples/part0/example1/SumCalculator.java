package com.moc.oop.examples.part0.example1;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/5/11
 * Time: 6:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class SumCalculator extends Calculator{

    public SumCalculator(){
        this(0,0);
    }

    public SumCalculator(double operandA, double operandB){
        super(operandA,operandB);
    }



    @Override
    public double calculate() {
        return (this.operandA+this.operandB);
    }


}
