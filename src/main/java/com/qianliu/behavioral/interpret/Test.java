package com.qianliu.behavioral.interpret;

public class Test {

    public static void main(String[] args) {
        String string = "6 100 11 + *";
        System.out.println(ExpressionParser.parser(string));
    }
}
