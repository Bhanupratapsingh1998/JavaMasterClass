package com.dsa2024.opps.Collections.Map;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap m = new TreeMap();
        m.put(100, "ZZZ");
        m.put(103, "YYY");
        m.put(101, "XXX");
        m.put(104, 106);
        m.put(107, null);
        // m.put("FFF", "XXX");
        // m.put(null, "XXX"); // RE: Exception in thread "main"
        // java.lang.NullPointerException
        System.out.println(m); // {100=ZZZ, 101=XXX, 103=YYY, 104=106, 107=null}
    }
}
