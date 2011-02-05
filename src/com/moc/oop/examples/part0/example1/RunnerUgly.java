package com.moc.oop.examples.part0.example1;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/5/11
 * Time: 6:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class RunnerUgly {

    public static void main(String[] args) {
        double sum=new SumCalculator(Double.parseDouble(args[0]) ,Double.parseDouble(args[1])).calculate();
        double mult=new MultCalculator(Double.parseDouble(args[0]) ,Double.parseDouble(args[1])).calculate();
        System.out.println("<calculation><type>sum</type><value>"+sum+"</value></calculation");
        System.out.println("<calculation><type>multiplication</type><value>"+mult+"</value></calculation");
    }

}
