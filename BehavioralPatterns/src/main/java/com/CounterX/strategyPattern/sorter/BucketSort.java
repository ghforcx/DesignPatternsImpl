package com.CounterX.strategyPattern.sorter;

import java.util.ArrayList;
import java.util.List;

public class BucketSort extends AbstractSorter implements Sorter {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        int[][] buckets = new int[2][n];
        int[] lens = new int[2];
        for (int i : arr) {
            if (i < 0) buckets[0][lens[0]++] = i;
            if (i > 0) buckets[1][lens[1]++] = i;
        }
        signedIntBucketSort(buckets[0], lens[0], -1);
        signedIntBucketSort(buckets[1], lens[1], 1);
        int idx = 0;
        while(lens[0] > 0) {
            arr[idx++] = buckets[0][--lens[0]];
        }
        int left = idx;
        idx = n - 1;
        while(lens[1] > 0) {
            arr[idx--] = buckets[1][--lens[1]];
        }
        while (idx >= left) arr[idx--] = 0;
    }

    private void signedIntBucketSort(int[] arr, int n, int sign) {

        int[][] buckets = new int[10][n];
        int[] lens = new int[10];
        int base = 1;
        for (int t = 0; t < 9; t++, base *= 10) {
            for (int i = 0; i < n; i++) {
                int b = sign > 0 ? arr[i] / base % 10 : -arr[i] / base % 10;
                buckets[b][lens[b]++] = arr[i];
            }
            int idx = 0;
            for (int b = 0; b < 10; b++) {
                for (int i = 0; i < lens[b]; i++) {
                    arr[idx++] = buckets[b][i];
                }
                lens[b] = 0;
            }
        }
    }

}
