package com.jerry.sort;

/**
 * 测试类
 */
public class Client {

    private static  <V> void print(V[] a){
        for (V v : a) {
            System.out.print(v +" ");
        }
    }

    private static void sort(Comparable[] a, IBaseStrategySort strategy) {
        strategy.sort(a);
    }

    public static void main(String[] args) {
        Integer[] a = {3,5,2,1,5,6,7,8,12,324,12,34,54,5243,324,234,454,1234,45,22,0};
        sort(a, new Heap());
        print(a);
    }
}
