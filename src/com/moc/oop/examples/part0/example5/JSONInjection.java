package com.moc.oop.examples.part0.example5;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/6/11
 * Time: 10:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class JSONInjection extends Injection{


    public JSONInjection(InjectedCalculator calculator){
        this.calculator=calculator;
    }

    public String injectingOutput(){
        return "{calculation:{type:"+this.calculator.getTypeName()+",value:"+this.calculator.calculate()+"}}";
    }

}
