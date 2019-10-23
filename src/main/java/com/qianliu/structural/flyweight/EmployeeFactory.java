package com.qianliu.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工工厂
 */
public class EmployeeFactory {
    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<String,Employee>();

    public static Employee getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);//获取一个部门经理

        if(manager == null){
            manager = new Manager(department);
            System.out.print("创建部门经理:"+department);
            String reportContent = department+"部门汇报:此次报告的主要内容是......";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告:"+reportContent);
            EMPLOYEE_MAP.put(department,manager);// 将部门和这个部门的部门经理放入EMPLOYEE_MAP

        }
        return manager;
    }

}
