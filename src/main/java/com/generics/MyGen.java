package com.generics;

public class MyGen<T>{
    T x;
    static int count;
    MyGen(){
        count++;
    }
}

class Test
{
    public static void main(String[] args) {
        MyGen<Integer> m1 = new MyGen<>();
        MyGen<Integer> m2 = new MyGen<>();
        // Since its intialized twice. count is invoked twice and count became 2. Hence the output is 2.
        System.out.println(MyGen.count);
    }
}