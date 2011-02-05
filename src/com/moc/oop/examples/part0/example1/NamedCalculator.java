package com.moc.oop.examples.part0.example1;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/5/11
 * Time: 7:39 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class NamedCalculator extends Calculator{

    protected String TYPE_NAME;

    public NamedCalculator(double operandA, double operandB){
        super(operandA,operandB);
        this.TYPE_NAME=null;
    }

    public String getTypeName(){
        return TYPE_NAME;
    }



}
