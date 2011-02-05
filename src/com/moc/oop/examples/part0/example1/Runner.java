package com.moc.oop.examples.part0.example1;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/5/11
 * Time: 6:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Runner {
    public static void main(String[] args) {
        double sum=new SumCalculator(Double.parseDouble(args[0]) ,Double.parseDouble(args[1])).calculate();
        double mult=new MultCalculator(Double.parseDouble(args[0]) ,Double.parseDouble(args[1])).calculate();
        System.out.println(sum);
        System.out.println(mult);
    }
}


