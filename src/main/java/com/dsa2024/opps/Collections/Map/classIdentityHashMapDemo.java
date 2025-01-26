package com.dsa2024.opps.Collections.Map;

import java.util.*;

public class classIdentityHashMapDemo {
    public static void main(String[] args) {
        // HashMap m = new HashMap(); // output {10=Kalyan}
        IdentityHashMap m = new IdentityHashMap();
        Integer I1 = new Integer(10);
        Integer I2 = new Integer(10);
        m.put(I1, "Pawan");
        m.put(I2, "Kalyan");
        System.out.println(m); // {10=Kalyan}
    }
}
