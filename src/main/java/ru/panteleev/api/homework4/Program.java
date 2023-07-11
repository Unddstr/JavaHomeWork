package ru.panteleev.api.homework4;

import java.util.LinkedList;

public class Program {

    static LinkedList<Object> reversLinkedList(LinkedList<Object> linkedList) {
        LinkedList<Object> ll = new LinkedList<>();

        for (Object o : linkedList) {
            ll.addFirst(o);
        }

        return ll;
    }

    public static void main(String[] args) {

        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Исходный LinkedList: ");
        System.out.println(linkedList);
        System.out.println("Перевернутый LinkedList: ");
        System.out.println(reversLinkedList(linkedList));
        System.out.println("==============================");

        MyQueue mq = new MyQueue(linkedList);
        int x = 3;
        mq.enqueue(x);
        mq.print();
        System.out.println(mq.dequeue());
        mq.print();
        System.out.println(mq.first());
        mq.print();
    }
}
