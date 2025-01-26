package com.dsa2024.opps.Collections.Map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class classWeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        // HashMap m = new HashMap(); // output: {temp=Durga}{temp=Durga}
        WeakHashMap m = new WeakHashMap();
        Temp t = new Temp();
        m.put(t, "Durga");
        System.out.println(m);
        t = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);
    }
}

class Temp {
    public String toString() {
        return "temp";
    }

    public void finalize() {
        System.out.println("finalize() Called");
    }
}
