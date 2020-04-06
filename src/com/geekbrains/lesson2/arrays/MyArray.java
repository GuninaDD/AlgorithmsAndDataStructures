package com.geekbrains.lesson2.arrays;

import java.util.Arrays;

public class MyArray {
    private int[] arr;
    private int size;
    private boolean isSorting;

    public MyArray(int size) {
        this.size = size;
        this.arr = new int[size];
        this.isSorting = false;
    }

    public void setItem(int index, int value) {
        this.arr[index] = value;
    }

    public boolean searchItem(int item) {
        if (isSorting) {
            int low = 0;
            int high = this.size - 1;
            int mid;
            while (low <= high) {
                mid = (low + high) / 2;
                if (item == this.arr[mid]) {
                    return true;
                } else {
                    if (item < this.arr[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        } else {
            for (int i = 0; i < this.size; i++) {
                if (this.arr[i] == item) {
                    return true;
                }
            }
        }
        return false;
    }


    public void showArray() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.arr[i]);
        }
    }

    public void deleteItem(int item) {
        int i = 0;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] == item) {
                break;
            }
        }

        for (int j = i; j < this.size - 1; j++) {
            this.arr[j] = this.arr[j + 1];
        }
        this.size--;
    }

    public void insertItem(int item) {
        int[] newArray = Arrays.copyOf(this.arr, this.size + 1);
        newArray[newArray.length - 1] = item;
        this.arr = new int[newArray.length];
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = newArray[i];
        }
        this.size = newArray.length;
    }

    //public void insertItem(int item) {
    //    int[] newArray = Arrays.copyOf(this.arr, this.size + 1);
    //    newArray[newArray.length - 1] = item;
    //    this.arr = new int[newArray.length];
    //    for (int i = 0; i < this.arr.length; i++) {
    //        this.arr[i] = newArray[i];
    //    }
    //    this.size = newArray.length;
    //}

    public void sortBubble() {
        int out, in;
        for (out = this.size - 1; out >= 1; out--) {
            for (in = 0; in < out; in++) {
                if (this.arr[in] > this.arr[in + 1]) {
                    changeItems(in, in + 1);
                }
            }
        }
        this.isSorting = true;
    }

    private void changeItems(int a, int b) {
        int tmp = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = tmp;
    }

    public void sortSelect() {
        int out, in, mark;
        for (out = 0; out < this.size; out++) {
            mark = out;
            for (in = out + 1; in < this.size; in++) {
                if (this.arr[in] < this.arr[mark]) {
                    mark = in;
                }
            }
            changeItems(out, mark);
        }
        this.isSorting = true;
    }

    public void sortInsert() {
        int in, out;
        for (out = 1; out < this.size; out++) {
            int temp = this.arr[out];
            in = out;
            while (in > 0 && this.arr[in - 1] >= temp) {
                this.arr[in] = this.arr[in - 1];
                --in;
            }
            this.arr[in] = temp;
        }
        this.isSorting = true;
    }

}
