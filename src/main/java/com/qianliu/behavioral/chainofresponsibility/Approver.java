package com.qianliu.behavioral.chainofresponsibility;

import lombok.Setter;

public abstract class Approver {
    @Setter
    protected Approver nextApprover;

    public abstract void check(Course course);
}
