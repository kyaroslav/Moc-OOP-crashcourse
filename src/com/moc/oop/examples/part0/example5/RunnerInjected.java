package com.moc.oop.examples.part0.example5;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/6/11
 * Time: 11:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class RunnerInjected {

    public static void main(String[] args) {



        SumInjectedCalculator sum=new SumInjectedCalculator (Double.parseDouble(args[0]) ,Double.parseDouble(args[1]));
        sum.inject(new XMLInjection(sum));

        MultInjectedCalculator mult=new MultInjectedCalculator (Double.parseDouble(args[0]) ,Double.parseDouble(args[1]));
        mult.inject(new XMLInjection(mult));

        System.out.println(sum.displayInjected());
        System.out.println(mult.displayInjected());
        System.out.println("New Injection");
        sum.inject(new JSONInjection(sum));
        mult.inject(new JSONInjection(mult));
        System.out.println(sum.displayInjected());
        System.out.println(mult.displayInjected());

    }

}
