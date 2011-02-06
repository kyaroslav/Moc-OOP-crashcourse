package com.moc.oop.examples.part0.example5;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/6/11
 * Time: 10:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class XMLInjection extends Injection{

    public XMLInjection(InjectedCalculator calculator){
        this.calculator=calculator;
    }

    public String injectingOutput(){
        return "<calculation><type>"+this.calculator.getTypeName()+"</type><value>"+this.calculator.calculate()+"</value></calculation";
    }

}
