package com.moc.oop.examples.part0.example1;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/6/11
 * Time: 12:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class NamedDivCalculator extends NamedCalculator{

    public NamedDivCalculator(double operandA, double operandB){
        super(operandA,operandB);
        this.TYPE_NAME="div";
    }

    public double calculate(){
        return (this.operandA/this.operandB);
    }

}
