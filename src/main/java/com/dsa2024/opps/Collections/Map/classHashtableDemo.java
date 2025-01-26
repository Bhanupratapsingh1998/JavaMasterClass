package com.dsa2024.opps.Collections.Map;

import java.util.Hashtable;

public class classHashtableDemo {
    public static void main(String[] args) {
        // Use generics for type safety
        Hashtable<Temp1, String> h = new Hashtable<>();
        h.put(new Temp1(5), "A");
        h.put(new Temp1(2), "B");
        h.put(new Temp1(6), "C");
        h.put(new Temp1(15), "D");
        h.put(new Temp1(23), "E");
        h.put(new Temp1(16), "F");
        // h.put("Durga", null); // RE: java.lang.NullPointerException
        System.out.println(h); // {6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
    }
}

class Temp1 {
    int i;

    Temp1(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Temp1 temp = (Temp1) obj;
        return i == temp.i;
    }

    @Override
    public String toString() {
        return i + "";
    }
}
