package com.generics;

import java.util.ArrayList;
import java.util.List;

public class CollectionsBulkOperations {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(20);

        System.out.println("contains :: "+list.containsAll(list2));
        list.addAll(list2);
        System.out.println("Add :: "+list);
        list.removeAll(list2);
        System.out.println("Remove :: "+list);
        list.add(10);
        list.add(20);

        list2.add(10);
        list2.add(20);
        list.retainAll(list2);
        System.out.println("RetainAll :: "+list);

        list.add(15);
        list.add(19);
        list.add(30);
        list.removeIf((n) -> (n %2 == 0));
        System.out.println("RemoveIF ::"+ list);

    }
}
