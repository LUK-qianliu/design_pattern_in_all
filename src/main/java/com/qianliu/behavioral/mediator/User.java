package com.qianliu.behavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String userName;

    public void send(Message message){
        ChatGroup.sendMessage(this, message);
    }
}
