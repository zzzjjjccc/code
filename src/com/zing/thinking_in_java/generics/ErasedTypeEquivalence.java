package com.zing.thinking_in_java.generics;

import java.util.ArrayList;
import java.util.List;

public class ErasedTypeEquivalence {

    public static void main(String[] args) {
        Class c1 = new ArrayList<Integer>().getClass();
        Class c2 = new ArrayList<String>().getClass();
        System.out.println("c1 == c2 " + (c1 == c2));

        List<String> s = new ArrayList<>();
        s.add("zhang");
        s.add("jia");
        s.add("chang");
        print(s);
   }

    private static void print(List<? extends String> a) {
        for (Object s : a) {
            System.out.println(s.toString());
        }
    }
}
