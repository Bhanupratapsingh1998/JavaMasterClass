package com.dsa2024.proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeeSalaryInvocationHandler implements InvocationHandler {
    private ITEmployee itEmployee;
    private Object invoke;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Pre Processing
        double hikeValue = (double) args[0];
        if (hikeValue <= 0.0) {
            throw new RuntimeException("Hike amount is not valid..");
        }
        // making the actual call service layer
        invoke = method.invoke(itEmployee, args);

        // post processing
        System.out.println("executing method : " + method.getName() + " for employee id : " + itEmployee.getId());
        return invoke;
    }

    public EmployeeSalaryInvocationHandler(ITEmployee itEmployee) {
        this.itEmployee = itEmployee;
    }

    public ITEmployee getItEmployee() {
        return itEmployee;
    }

    public void setItEmployee(ITEmployee itEmployee) {
        this.itEmployee = itEmployee;
    }

}
