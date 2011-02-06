package com.moc.oop.examples.part0.example3;

/**
 * Created by IntelliJ IDEA.
 * User: fritz
 * Date: 2/6/11
 * Time: 10:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class RunnerInheritedXML {

    public static void main(String[] args) {
        String sum=new SumXMLInheritedCalculator(Double.parseDouble(args[0]) ,Double.parseDouble(args[1])).calculateXML();
        String mult=new MultXMLInheritedCalculator(Double.parseDouble(args[0]) ,Double.parseDouble(args[1])).calculateXML();
        System.out.println(sum);
        System.out.println(mult);
    }


}
