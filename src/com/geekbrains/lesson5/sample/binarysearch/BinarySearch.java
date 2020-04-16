package com.geekbrains.lesson5.sample.binarysearch;

import com.geekbrains.lesson5.sample.exception.SearchException;

public class BinarySearch {
    private int[] arr;
    private int size;

    public BinarySearch(int size) {
        this.size = 0;
        this.arr = new int[size];
    }

    public String binaryFind(int search) throws SearchException {
        return recBinaryFind(search, 0, size - 1);
    }

    private String recBinaryFind(int searchKey, int low, int high) throws SearchException {
        int curIn;
        curIn = (low + high) / 2;
        if (arr[curIn] == searchKey)
            return true + " index of " + searchKey;
        else
            throw new SearchException("Элемент не найден");
    }

    public void insert(int value) {
        int i;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] > value)
                break;
        }
        for (int j = this.size; j > i; j--) {
            this.arr[j] = this.arr[j - 1];
        }
        this.arr[i] = value;
        this.size++;
    }
}
