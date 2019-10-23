package com.qianliu.structural.bridge;

/**
 * ICBC银行
 */
public class ICBCBank extends Bank {
    // 传入需要开户是活期还是定期
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        //将openAcount操作委托给具体的SavingAccount/DepositAccount去实现，此处直接调用
        //此时Bank就不需要关心开户的操作是如何实现的了
        account.openAccount();
        return account;
    }
}
