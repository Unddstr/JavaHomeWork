package ru.panteleev.api.homework4;

import java.util.LinkedList;

public class MyQueue {
    private LinkedList<Object> elements;

    public MyQueue(LinkedList<Object> linkedList) {
        this.elements = linkedList;
    }

    void enqueue(int i) {
        elements.addLast(elements.remove(i));
    }

    Object dequeue() {
        return elements.pop();
    }

    Object first() {
        return elements.getFirst();
    }

    void print() {
        System.out.print("[ ");
        for (Object o : elements) {
            System.out.print(o + " ");
        }
        System.out.println("]");
    }
}
