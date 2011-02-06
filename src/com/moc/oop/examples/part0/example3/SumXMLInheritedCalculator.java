package com.moc.oop.examples.part0.example3;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/6/11
 * Time: 10:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class SumXMLInheritedCalculator extends XMLCalculator{

    public SumXMLInheritedCalculator(double operandA, double operandB){
        super(operandA,operandB);
        this.TYPE_NAME="sum";
    }


    public double calculate(){
        return this.operandA+this.operandB;
    }


}
