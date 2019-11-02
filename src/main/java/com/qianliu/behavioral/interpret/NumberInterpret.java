package com.qianliu.behavioral.interpret;

public class NumberInterpret implements Interpret {

    int number;

    public NumberInterpret(String number){
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
