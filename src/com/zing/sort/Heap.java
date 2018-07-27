package com.zing.sort;

/**
 * 堆排序
 */
public class Heap implements IBaseStrategySort{

    /**
     * 下沉
     *
     * @param k 位置
     */
    private void sink(Comparable[] a, int k, int N) {
        while (2*k <= N) {
            int j = 2*k;
            if (j < N && Util.less(a[j], a[j+1])) {
                ++j;
            }
            if (!Util.less(a[k], a[j])) {
                break;
            }
            Util.swap(a, k, j);
            k = j;
        }
    }

    @Override
    public void sort(Comparable[] a) {
        int N = a.length - 1;
        for (int k = N / 2; k >= 0; --k) {
            sink(a, k, N);
        }
        while (N > 0) {
            Util.swap(a, 0, N--);
            sink(a, 0, N);
        }
    }
}
