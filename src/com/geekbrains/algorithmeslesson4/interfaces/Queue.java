package com.geekbrains.algorithmeslesson4.interfaces;

public interface Queue<E> {
        boolean insert(E value);
        E remove();
        E peek();

        int size();
        boolean isEmpty();
        boolean isFull();
}
