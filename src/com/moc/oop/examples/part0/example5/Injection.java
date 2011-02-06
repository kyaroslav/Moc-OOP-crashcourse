package com.moc.oop.examples.part0.example5;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/6/11
 * Time: 10:37 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class Injection {

        protected InjectedCalculator calculator;

        public Injection(InjectedCalculator calculator){
            this.calculator=calculator;
        }

        public Injection(){

        }

        abstract String injectingOutput();

}
