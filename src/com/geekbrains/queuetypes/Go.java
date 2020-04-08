package com.geekbrains.queuetypes;

public class Go {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(14);

        System.out.println("1 dequeue: " + queue.dequeue() + "\n2 dequeue: " + queue.dequeue() + "\n3 dequeue: " + queue.dequeue());

        Reverser reverser = new Reverser();
        System.out.println(reverser.reverse("Something String"));
    }
}
