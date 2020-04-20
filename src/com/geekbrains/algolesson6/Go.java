package com.geekbrains.algolesson6;

import com.geekbrains.algolesson6.tree.Tree;

import java.util.Random;

public class Go {
    private static final int TREE_COUNT = 20;
    private static final int MIN_VALUE = -100;
    private static final int MAX_VALUE = 100;
    private static final int TREE_HEIGHT = 6;

    public static void main(String[] args) {
        Random rn = new Random();
        int bound = MAX_VALUE - MIN_VALUE + 1;
        int balancedCount = 0;

        for (int i = 0; i < TREE_COUNT; i++) {
            Tree<Integer> tree = new Tree<>(TREE_HEIGHT);
            do {
                try {
                    tree.add(rn.nextInt(bound) + MIN_VALUE);
                } catch (IndexOutOfBoundsException ex) {
                    break;
                }
            } while (true);
            if (tree.isBalanced()) {
                balancedCount++;
            }
        }
        System.out.printf("Получилось %d сбалансированных дерева из %d (%d%%)", balancedCount, TREE_COUNT, balancedCount * 100 / TREE_COUNT);
    }
}
