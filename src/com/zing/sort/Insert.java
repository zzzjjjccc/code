package com.zing.sort;

/**
 * 插入排序
 * 插入排序从左到右进行，每次都将当前元素插入到左侧已经排序的数组中，使得插入之后左部数组依然有序。
 */
public class Insert implements IBaseStrategySort{
    @Override
    public void sort(Comparable[] a) {
        int length = a.length;
        for (int i = 1; i < length; ++i) {
            for (int j = i; j > 0 && Util.less(a[j], a[j-1]); --j) {
                Util.swap(a, j, j-1);
            }
        }
    }
}
