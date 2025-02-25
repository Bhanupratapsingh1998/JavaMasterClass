package com.dsa2024.opps.Collections;

import java.util.*;

public class classIteratorDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            l.add(i);
        }
        System.out.println(l);
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            Integer I = (Integer) itr.next();
            if (I % 2 == 0)
                System.out.println(I);
            else
                itr.remove();
        }
        System.out.println(l);
    }
}
