package com.jerry.sort;

/**
 * 希尔排序
 * 是对插入排序的一种改进
 * 插入排序间隔一个值交换
 * 希尔排序间隔h个值交换，最后h=1排序完成
 */
public class Shell implements IBaseStrategySort{
    @Override
    public void sort(Comparable[] a) {
        int h = 1;
        int length = a.length;
        while (h < length / 3) {
            h = 3*h + 1;  // 1, 4, 13, 40
        }
        while (h >= 1) {
            for (int i = h; i < length; ++i) {
                for (int j = i; j >= h && Util.less(a[j], a[j-h]); j -= h) {
                    Util.swap(a, j, j-h);
                }
            }
            h /= 3;
        }
    }
}
