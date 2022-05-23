package com.generics;

public class WithoutGenericsExamples {
    public static void main(String[] args) {
        Pair p = new Pair();
        p.x = 12;
        p.y = "GFG";
        String str = (String) p.x;
    }
}
//Exception in thread "main"
// java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String
//it shows runtime error
class Pair
{
    Object x;
    Object y;
}
