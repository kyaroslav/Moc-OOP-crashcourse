package com.moc.oop.examples.part0.example1;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/5/11
 * Time: 11:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class NamedMultCalculator extends NamedCalculator{


    public NamedMultCalculator(double operandA, double operandB){
        super(operandA,operandB);
        this.TYPE_NAME="mult";
    }

    public double calculate(){
        return (this.operandA*this.operandB);
    }

}
