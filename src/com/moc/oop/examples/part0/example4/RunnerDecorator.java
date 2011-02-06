package com.moc.oop.examples.part0.example4;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/5/11
 * Time: 11:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class RunnerDecorator {

     public static void main(String[] args) {

         XMLDecorator sumDecorator = new XMLDecorator(new NamedSumCalculator(Double.parseDouble(args[0]) ,Double.parseDouble(args[1])));
         XMLDecorator multDecorator = new XMLDecorator(new NamedMultCalculator(Double.parseDouble(args[0]) ,Double.parseDouble(args[1])));
         XMLDecorator divDecorator = new XMLDecorator(new NamedDivCalculator(Double.parseDouble(args[0]) ,Double.parseDouble(args[1])));
         JSONDecorator sumJSONDecorator= new JSONDecorator(new NamedDivCalculator(Double.parseDouble(args[0]) ,Double.parseDouble(args[1])));
        System.out.println(sumDecorator.decorateTo());
        System.out.println(multDecorator.decorateTo());
        System.out.println(divDecorator.decorateTo());
        System.out.println(sumJSONDecorator.decorateTo());
    }

}
