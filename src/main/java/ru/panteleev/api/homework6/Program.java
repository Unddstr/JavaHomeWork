package ru.panteleev.api.homework6;

import java.util.HashSet;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", 2, "Белый");
        Cat cat2 = new Cat("Барсик", 3, "Черный");
        Cat cat3 = new Cat("Мурзик", 2, "Белый");
        Cat cat4 = new Cat("Сема", 4, "Черно-белый");
        Cat cat5 = new Cat("Рыжик", 1, "Рыжий");
        Cat cat6 = new Cat("Мурзик", 2, "Белый");

        HashSet <Cat> hs = new HashSet<>();

        hs.add(cat1);
        hs.add(cat2);
        hs.add(cat3);
        hs.add(cat4);
        hs.add(cat5);
        hs.add(cat6);

        System.out.println(hs);
    }
}
