package com.generics;

public class WithGenerics_ComplierError {} /*{
    public static void main(String[] args) {
        Pair1<Integer, String> p = new Pair1<Integer, String>();
        p.x = 12;
        p.y = "GFG";
        String str = (String) p.x;
    }
}

public Pair1<T,S>
{
    T x;
    S y;
}
*/