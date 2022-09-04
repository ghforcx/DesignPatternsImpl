package com.CounterX.strategyPattern.sorter;

public abstract class AbstractSorter implements Sorter {
    @Override
    public abstract void sort(int[] arr);
    protected void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
