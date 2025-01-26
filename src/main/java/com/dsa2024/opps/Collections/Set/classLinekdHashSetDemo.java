package com.dsa2024.opps.Collections.Set;

import java.util.LinkedHashSet;

public class classLinekdHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        h.add(null);
        System.out.println(h.add("Z")); // false
        System.out.println(h); // [null, D, B, C, 10, Z]
    }
}
