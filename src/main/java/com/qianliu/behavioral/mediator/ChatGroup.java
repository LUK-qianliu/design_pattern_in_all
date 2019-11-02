package com.qianliu.behavioral.mediator;

public class ChatGroup {
    public static void sendMessage(User user,Message message){
        System.out.println(user.getUserName()+"发送了: "+message.getMessage());
    }
}
