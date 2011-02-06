package com.moc.oop.examples.part0.example4;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/6/11
 * Time: 12:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class JSONDecorator extends AbstractDecorator {
    public JSONDecorator(NamedCalculator calculator) {
        super(calculator);
    }

    @Override
    public String decorateTo(){
        return "{calculation:{type:"+this.calculator.getTypeName()+",value:"+this.calculator.calculate()+"}}";
    }

}
