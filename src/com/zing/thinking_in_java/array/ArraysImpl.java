package com.zing.thinking_in_java.array;

import java.util.Arrays;

public class ArraysImpl {

    public static void main(String[] args) {
        int[] a = new int[10];
        Arrays.fill(a, 10);
        int[] b = new int[10];
        Arrays.fill(b, 10);
        System.out.println("a == b? " + (Arrays.equals(a, b)));
        for (int d : a) {
            System.out.println(d);
        }
    }
}
