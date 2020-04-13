package com.geekbrains.algorithmeslesson4.interfaces;

public interface Stack<E> {
    boolean push(E value);
    E pop();
    E peek();

    int size();
    boolean isEmpty();
    boolean isFull();
}
