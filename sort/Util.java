package com.jerry.sort;

/**
 * 排序需要使用的工具类
 */
public class Util {

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**交换数据
     * @param a 数组
     * @param i 交换位置索引
     * @param j 交换位置索引
     */
    public static void swap(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
