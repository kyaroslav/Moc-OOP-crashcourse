package com.moc.oop.examples.part0.example1;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/6/11
 * Time: 12:52 AM
 * To change this template use File | Settings | File Templates.
 */
abstract class AbstractDecorator {

    protected NamedCalculator calculator;

    public AbstractDecorator(NamedCalculator calculator){
       this.calculator=calculator;
    }

    public AbstractDecorator(){
        this(null);
    }


    abstract String decorateTo();

}
