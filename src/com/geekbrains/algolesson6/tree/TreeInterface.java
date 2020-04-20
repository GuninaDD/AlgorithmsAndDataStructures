package com.geekbrains.algolesson6.tree;

public interface TreeInterface<E> {

    enum TraverseMode {
        IN_ORDER,
        PRE_ORDER,
        POST_ORDER,
    }

    boolean add(E value);

    boolean find(E value);

    boolean remove(E value);

    boolean isEmpty();

    int size();

    void traverse(TraverseMode mode);

    void display();

    boolean isBalanced();

    Node getRoot();

    int height();
}
