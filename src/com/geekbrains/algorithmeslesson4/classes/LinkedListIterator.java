package com.geekbrains.algorithmeslesson4.classes;

import com.geekbrains.algorithmeslesson4.interfaces.LinkIterator;
import com.geekbrains.algorithmeslesson4.interfaces.LinkedList;

public class LinkedListIterator<E> implements LinkIterator<E> {

    private SimpleLinkedListImpl list;
    private LinkedList.Entry<E> current;
    private LinkedList.Entry<E> previous;

    public LinkedListIterator(SimpleLinkedListImpl list) {
        this.list = list;
        reset();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public E next() {
        E nextValue = current.getValue();
        previous = current;
        current = current.getNext();
        return nextValue;
    }

    @Override
    public void reset() {
        current = list.first;
        previous = null;
    }

    @Override
    public void insertBefore(E value) {
        if (previous == null) {
            list.insertFirst(value);
            reset();
        }
        else {
            LinkedList.Entry newItem = new LinkedList.Entry(value);
            newItem.setNext(current);
            newItem.setPrevious(previous);
            previous.setNext(newItem);
            current.setPrevious(newItem);

            current = newItem;
        }
    }

    @Override
    public void insertAfter(E value) {
        if (list.isEmpty()){
            list.insertFirst(value);
            reset();
        } else {
            LinkedList.Entry newItem = new LinkedList.Entry(value);
            LinkedList.Entry next = current.getNext();
            newItem.setNext(next);
            newItem.setPrevious(current);
            current.setNext(newItem);
            if (next != null) {
                next.setPrevious(newItem);
            }
            next();
        }
    }
}
