package com.geekbrains.lesson2.spiral;

import java.util.stream.IntStream;

public class SpiralInsert {
    private int size;
    private int[][] arr;

    public SpiralInsert(int size){
        this.size = size;
        this.arr = new int[size][];
    }

    public void getSpiralMatrix(){
        IntStream.range(0, size).forEach(i->this.arr[i] = new int[size]);

        int x = 0;
        int y = 0;
        int z = size;
        for (int i = 0, j = size * size; i < j;) {
            this.arr[x][y] = ++i;
            if (x < z + (size - z) / 2 - 1 && y == (size - z) / 2) {
                x++;
            } else if (x == z + (size - z) / 2 - 1 && y < z + (size - z) / 2 - 1) {
                y++;
            } else if (x > (size - z) / 2 && y == z + (size - z) / 2 - 1) {
                x--;
            } else if (x == (size - z) / 2 && y > (size - z) / 2 + 1) {
                y--;
            } else {
                x++;
                z -= 2;
            }
        }
        showArray();
    }

    public void showArray(){
        IntStream.range(0, size).forEach(i -> {
            IntStream.range(0, size).forEach(j -> System.out.printf("%02d ", this.arr[j][i]));
            System.out.println();
        });
    }
}
