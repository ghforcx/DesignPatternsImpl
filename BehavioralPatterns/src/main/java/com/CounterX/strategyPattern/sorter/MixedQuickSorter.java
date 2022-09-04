package com.CounterX.strategyPattern.sorter;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 使用混合原地快排
 * 当排序的子数组的长度小于 16 时使用选择排序
 */
public class MixedQuickSorter extends AbstractSorter implements Sorter {
    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length);
    }

    private Random random = new Random();
    private void quickSort(int[] arr, int stt, int end) {
        if (end - stt < 16) {
            selectSort(arr, stt, end);
            return;
        }
        int left = stt + 1, right = end - 1;
        int pos = random.nextInt(stt, end);
        swap(arr, stt, pos);
        int flag = arr[stt];
        int[] debug0 = Arrays.copyOfRange(arr, stt, end);
        while (left < right) {
            while (left < right && arr[left] <= flag) left++;
            while (left < right && arr[right] >= flag) right--;
            swap(arr, left, right);
        }
        if (arr[left] > flag) left--;
        swap(arr, stt, left);
        int[] debug1 = Arrays.copyOfRange(arr, stt, left);
        int[] debug2 = Arrays.copyOfRange(arr, left + 1, end);
        quickSort(arr, stt, left);
        quickSort(arr, left + 1, end);
    }

    private void selectSort(int[] arr, int stt, int end) {
        if (end <= stt) return;
        for (int i = stt; i < end; i++) {
            int min = arr[i];
            int pos = i;
            for (int j = i + 1; j < end; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    pos = j;
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
        }
    }
}
