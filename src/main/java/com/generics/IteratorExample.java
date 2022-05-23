package com.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(15);
        c.add(20);
        removeEven(c);
        System.out.println(c);
    }

    private static void removeEven(Collection<?> c) {
        Iterator<?> it = c.iterator();
        while(it.hasNext()){
            int x = (Integer) it.next();
            if(x%2 == 0){
                it.remove();
            }
        }

    }
}
