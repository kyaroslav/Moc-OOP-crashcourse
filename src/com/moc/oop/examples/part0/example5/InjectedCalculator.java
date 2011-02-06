package com.moc.oop.examples.part0.example5;

import com.moc.oop.examples.part0.example4.NamedCalculator;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/6/11
 * Time: 10:35 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class InjectedCalculator extends NamedCalculator {

    protected Injection injection;

     public InjectedCalculator(double operandA, double operandB){
        super(operandA,operandB);
    }

    public void inject(Injection injection){
        this.injection=injection;
    }

    abstract String displayInjected();

}
