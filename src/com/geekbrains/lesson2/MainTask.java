package com.geekbrains.lesson2;

import com.geekbrains.lesson2.arrays.MyArray;
import com.geekbrains.lesson2.spiral.SpiralInsert;

import java.util.Random;

public class MainTask {
    public static final int SIZE = 1_000_000;
    public static final int SIZE_SPIRAL = 10;

    public static void main(String[] args) {

        MyArray myBubbleArray = initArray(SIZE);

        System.out.print("Search 11 in array = ");
        System.out.println(myBubbleArray.searchItem(5));
        System.out.println();

        System.out.println("Start array");
        myBubbleArray.showArray();
        System.out.println();

        System.out.println("Insert 10 in start array");
        myBubbleArray.insertItem(10);
        myBubbleArray.showArray();

        System.out.println();
        System.out.println("Delete 10 in array");
        System.out.println();

        myBubbleArray.deleteItem(10);
        System.out.println();

        myBubbleArray.showArray();
        System.out.println();
        getBubbleRuntime(myBubbleArray);


        MyArray mySelectArray = initArray(SIZE);
        getSelectRuntime(mySelectArray);

        MyArray myInsertArray = initArray(SIZE);
        getInsertRuntime(myInsertArray);

        System.out.println();

        initSpiralArray();
    }

    private static void initSpiralArray() {
        SpiralInsert si = new SpiralInsert(SIZE_SPIRAL);
        si.getSpiralMatrix();
    }

    private static MyArray initArray(int size) {
        MyArray myArray = new MyArray(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            myArray.setItem(i, random.nextInt(10));
        }
        return myArray;
    }

    private static void getBubbleRuntime(MyArray myArray) {
        long start = System.currentTimeMillis();
        myArray.sortBubble();
        long finish = System.currentTimeMillis();
        System.out.println("Bubble sort = " + (finish - start));
    }

    private static void getSelectRuntime(MyArray myArray) {
        long start = System.currentTimeMillis();
        myArray.sortSelect();
        long finish = System.currentTimeMillis();
        System.out.println("Select sort = " + (finish - start));
    }

    private static void getInsertRuntime(MyArray myArray) {
        long start = System.currentTimeMillis();
        myArray.sortInsert();
        long finish = System.currentTimeMillis();
        System.out.println("Insert sort = " + (finish - start));
    }
}
