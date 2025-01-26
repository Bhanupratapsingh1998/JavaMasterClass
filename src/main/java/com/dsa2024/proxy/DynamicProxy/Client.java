package com.dsa2024.proxy.DynamicProxy;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        ITEmployee itEmp = new ITEmployee();
        itEmp.setId(101);
        itEmp.setName("Bhanu");
        itEmp.setSalary(33968);

        EmployeeSalaryInvocationHandler empHandler = new EmployeeSalaryInvocationHandler(itEmp);
        IEmployee iEmployee = (IEmployee) Proxy.newProxyInstance(ITEmployee.class.getClassLoader(),
                new Class[] { IEmployee.class },
                empHandler);
        // System.out.println(iEmployee.getSalary());
        iEmployee.giveHike(20000);

    }
}
