package com.qianliu.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Staff {

    private static final List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    //执行所有command
    public void execAll(){
        for (Command command: commandList) {
            command.exec();
        }
        commandList.clear();//清空
    }
}
