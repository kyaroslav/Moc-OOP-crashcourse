package com.moc.oop.examples.part0.example4;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/5/11
 * Time: 7:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class XMLDecorator extends AbstractDecorator {


    public XMLDecorator(NamedCalculator calculator){
        super(calculator);
    }

    @Override
    public String decorateTo(){
        return "<calculation><type>"+this.calculator.getTypeName()+"</type><value>"+this.calculator.calculate()+"</value></calculation";
    }


}
