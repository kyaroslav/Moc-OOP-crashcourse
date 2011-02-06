package com.moc.oop.examples.part0.example2;

import com.moc.oop.examples.part0.example1.MultCalculator;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/5/11
 * Time: 7:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class MultXMLCalculator extends MultCalculator {

     public MultXMLCalculator(double operandA, double operandB){
        super(operandA,operandB);
    }

    public String calculateXML(){
        return "<calculation><type>sum</type><value>"+super.calculate()+"</value></calculation";
    }

}
