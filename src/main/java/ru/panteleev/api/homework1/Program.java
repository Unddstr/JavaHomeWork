package ru.panteleev.api.homework1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Укажите номер задачи: ");
        System.out.println("1 - Задача 1 (Треугольное число)");
        System.out.println("2 - Задача 2 (Простые числа)");
        System.out.println("3 - Задача 3 (Простой калькулятор)");
        System.out.println("0 - Завершение работы приложения");

        int no;

        do {
            no = Integer.parseInt(scanner.nextLine());

            switch (no) {
                case 1 -> task1();
                case 2 -> task2();
                case 3 -> task3();
                case 0 -> System.out.println("Завершение работы приложения.");
                default -> System.out.println("Некорректно введен номер, повторите попытку ввода.");
            }
        } while (no != 0);

    }

    static void task1() {
        System.out.println("=================");
        System.out.println("Треугольное число");
        System.out.println("=================");
        System.out.println();
        System.out.println("Введите n-ое треугольное число: ");
        int n = Integer.parseInt(scanner.nextLine());
        int result = n;

        for (int i = 1; i < n; i++) {
            result += i;
        }

        System.out.printf("Ответ: %d\n", result);
        System.out.println("Введите номер задачи (0 - 3): ");
    }

    static void task2() {
        System.out.println("=============");
        System.out.println("Простые числа");
        System.out.println("=============");
        System.out.println();
        System.out.print("Простые числа от 1 до 1000: ");

        for (int i = 2; i < 1000; i++) {
            boolean simple = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                System.out.print(i + " ");
            }
        }
        System.out.println("Введите номер задачи (0 - 3): ");
    }

    static void task3() {
        try {
            File logFile = new File("logCalculator.txt");
            FileWriter fileWriter = new FileWriter(logFile, true);

            System.out.println("===================");
            System.out.println("Простой калькулятор");
            System.out.println("===================");
            System.out.println();
            System.out.println("Введите число: ");
            System.out.println("1 - операция \"+\"");
            System.out.println("2 - операция \"-\"");
            System.out.println("3 - операция \"*\"");
            System.out.println("4 - операция \"/\"");
            System.out.println("0 - Завершение работы калькулятора");
            int no;

            do {
                no = Integer.parseInt(scanner.nextLine());

                switch (no) {
                    case 1 -> calk1(fileWriter);
                    case 2 -> calk2(fileWriter);
                    case 3 -> calk3(fileWriter);
                    case 4 -> calk4(fileWriter);
                    case 0 -> {
                        System.out.println("Завершение работы калькулятора.");
                        fileWriter.close();
                    }
                    default -> System.out.println("Некорректно введен номер, повторите попытку ввода.");
                }
            } while (no != 0);
            System.out.println("Введите номер задачи (0 - 3): ");
        } catch (IOException ex) {
            System.out.println("ERROR");
        }

    }

    static void calk1(FileWriter fileWriter) throws IOException {
        System.out.print("Введите первое число: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите второе число: ");
        int y = Integer.parseInt(scanner.nextLine());
        int result = x + y;
        System.out.printf("%d + %d = %d\n", x, y, result);
        fileWriter.write(x + " + " + y + " = " + result + "\n");
        System.out.println("\nВведите новое число определяющее операцию на калькуляторе (0 - 4): ");
    }

    static void calk2(FileWriter fileWriter) throws IOException {
        System.out.print("Введите первое число: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите второе число: ");
        int y = Integer.parseInt(scanner.nextLine());
        int result = x - y;
        System.out.printf("%d - %d = %d\n", x, y, result);
        fileWriter.write(x + " - " + y + " = " + result + "\n");
        System.out.println("\nВведите новое число определяющее операцию на калькуляторе (0 - 4): ");
    }

    static void calk3(FileWriter fileWriter) throws IOException {
        System.out.print("Введите первое число: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите второе число: ");
        int y = Integer.parseInt(scanner.nextLine());
        int result = x * y;
        System.out.printf("%d * %d = %d\n", x, y, result);
        fileWriter.write(x + " * " + y + " = " + result + "\n");
        System.out.println("\nВведите новое число определяющее операцию на калькуляторе (0 - 4): ");
    }

    static void calk4(FileWriter fileWriter) throws IOException {
        System.out.print("Введите первое число: ");
        double x = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите второе число: ");
        double y = Integer.parseInt(scanner.nextLine());
        double result = x / y;
        System.out.printf("%.2f / %.2f = %.2f\n", x, y, result);
        fileWriter.write(x + " / " + y + " = " + result + "\n");
        System.out.println("\nВведите новое число определяющее операцию на калькуляторе (0 - 4): ");
    }
}
