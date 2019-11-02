package com.qianliu.behavioral.interpret;

public class AddInterpret implements Interpret {

    private Interpret firstInterpret,secondInterpret;

    public AddInterpret(Interpret firstInterpret,Interpret secondInterpret){
        this.firstInterpret = firstInterpret;
        this.secondInterpret = secondInterpret;
    }

    @Override
    public int interpret() {
        return firstInterpret.interpret() + secondInterpret.interpret();
    }
}
