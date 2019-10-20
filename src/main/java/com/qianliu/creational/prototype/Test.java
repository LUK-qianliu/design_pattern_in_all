package com.qianliu.creational.prototype;


public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail:"+mail);
        for(int i = 0;i < 10;i++){
            Mail mailTemp = (Mail) mail.clone(); // 使用的时候是clone出来的mail
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名"+i+"@163.com");
            mailTemp.setContent("恭喜您，此次慕课网活动中奖了");
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆的mailTemp:"+mailTemp);// 每次clone出来mail对象都不一样
        }
        MailUtil.saveOriginMailRecord(mail);//存储使用原始mail
    }
}
