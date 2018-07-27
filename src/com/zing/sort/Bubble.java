package com.zing.sort;

/**
 * 大数沉淀法实现冒泡排序
 */
public class Bubble implements IBaseStrategySort{
    @Override
    public void sort(Comparable[] a) {
        int length = a.length;
        boolean hasSorted = false;
        for (int i = length-1; i >= 1 && !hasSorted; --i) {
            hasSorted = true;
            for (int j = 0; j < i; ++j) {
                if (Util.less(a[j+1], a[j])) {
                    Util.swap(a, j, j+1);
                    hasSorted = false;
                }
            }
        }
    }
}
