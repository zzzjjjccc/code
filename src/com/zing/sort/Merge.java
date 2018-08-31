package com.zing.sort;

import java.util.Arrays;

/**
 * 归并排序，自顶向下的归并排序
 */
public class Merge implements IBaseStrategySort{

    @Override
    public void sort(Comparable[] a) {
        sort(a, 0, a.length-1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid+1, hi);
        merge(a, lo, mid, hi);
    }

    private void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        Comparable[] aux = Arrays.copyOf(a, a.length);
        for (int k = lo; k <= hi; ++k) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (Util.less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }
}
