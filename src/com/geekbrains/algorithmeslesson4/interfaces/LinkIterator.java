package com.geekbrains.algorithmeslesson4.interfaces;

import java.util.Iterator;

public interface LinkIterator<E> extends Iterator<E> {
    void reset();

    void insertBefore(E value);

    void insertAfter(E value);
}
