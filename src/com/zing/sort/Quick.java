package com.zing.sort;

/**
 * 快速排序
 * 选基准数
 * 小的放左
 * 大的放右
 */
public class Quick implements IBaseStrategySort{
    @Override
    public void sort(Comparable[] a) {
        sort(a, 0, a.length-1);
    }

    private void sort(Comparable[] a, int left, int right) {
        if (left < right) {
            int i = left;
            int j = right;
            Comparable x = a[left];  // 每次选取数列第一个值做基准数
            while (i < j) {
                while (i < j && Util.less(x, a[j])) {
                    --j;
                }
                if (i < j) {
                    a[i++] = a[j];
                }
                while (i < j && Util.less(a[i], x)) {
                    ++i;
                }
                if (i < j) {
                    a[j--] = a[i];
                }
            }
            a[i] = x;
            sort(a, left, i-1);
            sort(a, i+1, right);
        }
    }
}
