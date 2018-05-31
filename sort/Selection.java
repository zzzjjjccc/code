package com.jerry.sort;

/**
 * 选择排序
 * 选择出数组中的最小元素，将它与数组的第一个元素交换位置。
 * 再从剩下的元素中选择出最小的元素，将它与数组的第二个元素交换位置。
 * 不断进行这样的操作，直到将整个数组排序。
 */
public class Selection implements IBaseStrategySort{

    @Override
    public void sort(Comparable[] a) {
        final int length = a.length;
        for (int i = 0; i < length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < length; j++) {
                if (Util.less(a[j], a[minIndex])) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Util.swap(a, i, minIndex);
            }
        }
    }
}
