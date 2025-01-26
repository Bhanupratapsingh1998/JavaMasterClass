package com.dsa2024.opps.Collections;

import java.util.*;

public class classListIteratorDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Baala");
        l.add("Venki");
        l.add("Chiru");
        l.add("Naag");
        System.out.println(l);
        ListIterator ltr = l.listIterator();
        while (ltr.hasNext()) {
            String s = (String) ltr.next();
            if (s.equals("Venki"))
                ltr.remove();
            if (s.equals("Naag"))
                ltr.add("Chaitu");
            if (s.equals("Chiru"))
                ltr.add("Charan");
        }
        System.out.println(l);
    }
}
