package com.geekbrains.algorithmeslesson4.interfaces;

public interface LinkedList<E> extends Iterable<E>{
    void insertFirst(E value);

    E removeFirst();

    boolean remove(E value);

    boolean contains(E value);

    boolean isEmpty();

    int size();

    void display();

    E getFirstValue();

    Entry getFirst();

    class Entry<E> {
        private final E value;
        private Entry<E> next;
        private Entry<E> previous;

        public Entry(E value) {
            this.value = value;
        }

        public void setNext(Entry<E> next) {
            this.next = next;
        }

        public void setPrevious(Entry<E> previous) {
            this.previous = previous;
        }

        public E getValue() {
            return value;
        }

        public Entry<E> getPrevious() {
            return previous;
        }

        public Entry<E> getNext() {
            return next;
        }
    }
}
