package com.moc.oop.examples.part0.example1;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/5/11
 * Time: 7:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class SumXMLCalculator extends SumCalculator implements XMLCalculator{

    public SumXMLCalculator(double operandA, double operandB){
        super(operandA,operandB);
    }


    public String calculateXML(){
        return "<calculation><type>sum</type><value>"+super.calculate()+"</value></calculation";
    }

}
