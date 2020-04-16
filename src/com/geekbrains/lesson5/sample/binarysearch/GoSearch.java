package com.geekbrains.lesson5.sample.binarysearch;

import com.geekbrains.lesson5.sample.exception.SearchException;

public class GoSearch {
    public static void main(String[] args) {
        BinarySearch arr = new BinarySearch(3);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);

        int search = 2;

        try {
            System.out.println(arr.binaryFind(search));
        } catch (SearchException e) {
            e.printStackTrace();
        }
    }
}
