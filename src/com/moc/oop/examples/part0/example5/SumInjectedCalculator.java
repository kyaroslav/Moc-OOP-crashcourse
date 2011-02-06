package com.moc.oop.examples.part0.example5;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/6/11
 * Time: 10:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class SumInjectedCalculator extends InjectedCalculator {

    public SumInjectedCalculator(double operandA, double operandB){
        super(operandA,operandB);
        this.TYPE_NAME="sum";
        this.injection=injection;
    }

    @Override
    public double calculate(){
        return this.operandA+this.operandB;
    }


    @Override
    public String displayInjected(){
        return this.injection.injectingOutput();
    }

}
