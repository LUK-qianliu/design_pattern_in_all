package com.qianliu.structural.flyweight;

/**
 * 部门经理
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportContent);
    }
    private String title = "部门经理";//内部状态
    private String department;//外部状态
    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }


}
