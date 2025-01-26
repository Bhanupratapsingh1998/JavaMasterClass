package com.dsa2024.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {
    private static Class<?> studentInfo;
    private static Constructor<?>[] constructors;
    private static Method[] declaredMethods;

    public static void main(String[] args) throws ClassNotFoundException {
        studentInfo = Class.forName("com.dsa2024.Proxy.Student");
        constructors = studentInfo.getConstructors();
        for (Constructor constr : constructors) {
            System.out.println(constr);

        }
        declaredMethods = studentInfo.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);

        }
    }
}
