package com.qianliu.behavioral.interpret;

public class MultiInterpret implements Interpret {

    private Interpret firstInterpret,secondInterpret;

    public MultiInterpret(Interpret firstInterpret, Interpret secondInterpret){
        this.firstInterpret = firstInterpret;
        this.secondInterpret = secondInterpret;
    }

    @Override
    public int interpret() {
        return firstInterpret.interpret() * secondInterpret.interpret();
    }

}
