package com.qianliu.structural.bridge;

/**
 * ABC银行
 */
public class ABCBank extends Bank {
    // 传入需要开户是活期还是定期
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
