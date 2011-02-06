package com.moc.oop.examples.part0.example2;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/5/11
 * Time: 7:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class RunnerXML {
    public static void main(String[] args) {
        String sum=new SumXMLCalculator(Double.parseDouble(args[0]) ,Double.parseDouble(args[1])).calculateXML();
        String mult=new MultXMLCalculator(Double.parseDouble(args[0]) ,Double.parseDouble(args[1])).calculateXML();
        System.out.println(sum);
        System.out.println(mult);
    }
}
