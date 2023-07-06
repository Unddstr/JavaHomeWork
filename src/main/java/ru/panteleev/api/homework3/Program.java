package ru.panteleev.api.homework3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = random.nextInt(5, 11);

        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(0, 50));
        }

        System.out.println("Исходный список: ");
        System.out.println(arrayList);
        System.out.println();

        System.out.println("Укажите номер задачи: ");
        System.out.println("1 - Задача 1 (Удалить четные числа)");
        System.out.println("2 - Задача 2 (Найти минимальное значение)");
        System.out.println("3 - Задача 3 (Найти максимальное значение)");
        System.out.println("4 - Задача 4 (Найти среднее значение)");
        System.out.println("0 - Завершение работы приложения");

        int no;

        do {
            no = Integer.parseInt(scanner.nextLine());

            switch (no) {
                case 1 -> task1(arrayList);
                case 2 -> task2(arrayList);
                case 3 -> task3(arrayList);
                case 4 -> task4(arrayList);
                case 0 -> System.out.println("Завершение работы приложения.");
                default -> System.out.println("Некорректно введен номер, повторите попытку ввода.");
            }
        } while (no != 0);
    }

    static void task1(ArrayList<Integer> arrayList) {
        System.out.println("=================");
        System.out.println("Удалить четные числа");
        System.out.println("=================");

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            if (arrayList.get(i) % 2 == 0) {
                arrayList.remove(i);
            }
        }

        System.out.print("Cписок без четных чисел: ");
        System.out.println(arrayList);

        System.out.println();
        System.out.println("Введите номер задачи (0 - 4): ");
    }

    static void task2(ArrayList<Integer> arrayList) {
        System.out.println("=================");
        System.out.println("Найти минимальное значение");
        System.out.println("=================");

        int min = arrayList.get(0);

        for (Integer integer : arrayList) {
            if (integer < min) {
                min = integer;
            }
        }

        System.out.println("Минимальное значение: " + min);

        System.out.println("Введите номер задачи (0 - 4): ");
    }

    static void task3(ArrayList<Integer> arrayList) {
        System.out.println("=================");
        System.out.println("Найти максимальное значение");
        System.out.println("=================");

        int max = arrayList.get(0);

        for (Integer integer : arrayList) {
            if (integer > max) {
                max = integer;
            }
        }

        System.out.println("Максимальное значение: " + max);

        System.out.println("Введите номер задачи (0 - 4): ");
    }

    static void task4(ArrayList<Integer> arrayList) {
        System.out.println("=================");
        System.out.println("Найти среднее значение");
        System.out.println("=================");

        int mean = 0;

        for (Integer integer : arrayList) {
            mean += integer;
        }

        mean /= arrayList.size();

        System.out.println("Среднее значение: " + mean);

        System.out.println("Введите номер задачи (0 - 4): ");
    }
}
