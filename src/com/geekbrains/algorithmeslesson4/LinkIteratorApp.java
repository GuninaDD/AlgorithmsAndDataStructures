package com.geekbrains.algorithmeslesson4;


import com.geekbrains.algorithmeslesson4.classes.LinkedListIterator;
import com.geekbrains.algorithmeslesson4.classes.SimpleLinkedListImpl;

public class LinkIteratorApp {
    public static void main(String[] args) {
        SimpleLinkedListImpl linkedList = new SimpleLinkedListImpl();
        LinkedListIterator iterator = new LinkedListIterator(linkedList);

        iterator.insertAfter("Artem");
        iterator.insertBefore("Sergey");

        linkedList.display();
    }
}
