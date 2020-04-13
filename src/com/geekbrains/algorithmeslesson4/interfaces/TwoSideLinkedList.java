package com.geekbrains.algorithmeslesson4.interfaces;

import com.geekbrains.algorithmeslesson4.interfaces.LinkedList;

public interface TwoSideLinkedList<E> extends LinkedList<E> {
    void insertLast(E value);
    E removeLast();
    E getLastValue();
}
