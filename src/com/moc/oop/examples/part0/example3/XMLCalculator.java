package com.moc.oop.examples.part0.example3;

import com.moc.oop.examples.part0.example4.NamedCalculator;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/5/11
 * Time: 7:21 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class XMLCalculator extends NamedCalculator {

    public XMLCalculator(double operandA, double operandB){
        super(operandA,operandB);
    }



    public String calculateXML(){
        return "<calculation><type>"+this.getTypeName()+"</type><value>"+this.calculate()+"</value></calculation";
    }

}
