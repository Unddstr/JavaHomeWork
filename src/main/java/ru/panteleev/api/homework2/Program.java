package ru.panteleev.api.homework2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        int[] arr = {45, 5, 987, 12, 98, 46, 7, 92, 33, 55};
        sortBuble(arr);
    }

    static void sortBuble(int[] arr) {
        try {
            System.out.println("===================");
            System.out.println("Сортировка пузырьком");
            System.out.println("===================");
            System.out.println();

            File logFile = new File("logSortBuble.txt");
            FileWriter fileWriter = new FileWriter(logFile, true);

            System.out.println("Исходный массив: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();

            int temp;
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                    for (int x : arr) {
                        fileWriter.write(x + " ");
                    }
                    fileWriter.write("\n");
                }
            }

            fileWriter.close();

            System.out.println("Отсортированный массив: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
    }
}
