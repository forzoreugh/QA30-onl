package Homework4;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Homework4 {
    public static void main(String[] args) {
        getTask1();
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static void getTask0() {

        int[] numbers = new int[]{1, 2, 3};
        boolean isTrue = false;

        System.out.print("Введи число и узнай есть ли оно у меня в массиве: ");
        int numb = new Scanner(System.in).nextInt();

        for (int index = 0; index < numbers.length - 1; index++) {
            if (numb == numbers[index]) {
                isTrue = true;
                break;
            }
        }
        System.out.println(isTrue ? "Данное число находится в массиве" : "Данное число не находится в массиве");
    }

    public static void getTask1() {

        int massive[] = new int [] {1, 3, 5, 7, 9, 11};
        boolean isTrue = false;

        System.out.println("Введи число и я удалю его из массива: ");
        int number = new Scanner(System.in).nextInt();

        for (int index = 0; index < massive.length; index++) {
            if (number == massive[index]) {
                isTrue = true;
                continue;
            }
            System.out.print(massive[index] + "\t");
        }
        if (isTrue == false) {
            System.out.println("\nТакого числа нет в массиве.. Глянь числа из массива выше!");
        }
    }




    public static void getTask2() {

        Random randomValues = new Random();

        System.out.print("Введите размер массива! Размер массива составит: ");
        int getSize = new Scanner(System.in).nextInt();

        int massive[] = new int[getSize];
        for (int index = 0; index < massive.length; index++) {
            massive[index] = randomValues.nextInt(1, 100);
            System.out.print(massive[index] + "\t");
        }
        int min = massive[0];
        int max = massive[0];
        double sum = 0;
        for (int index = 0; index < massive.length; index++) {
            if (min > massive[index]) {
                min = massive[index];
            }
            if (max < massive[index]) {
                max = massive[index];
            }
            sum += (double) massive[index] / massive.length;
        }
        System.out.println("\n\nВывод минимального значения: " + min);
        System.out.println("Вывод максимального значения: " + max);
        System.out.println("Вывод среднего числа: " + sum);
    }

    public static void getTask3() {

        int[] massive1 = new int[]{1, 3, 5, 7, 9};
        int[] massive2 = new int[]{2, 4, 6, 8, 10};

        double sum1 = 0;
        for (int index = 0; index < massive1.length; index++) {
            sum1 += (double) massive1[index] / massive1.length;
            System.out.print(massive1[index] + "\t");
        }
        System.out.println();
        double sum2 = 0;
        for (int index = 0; index < massive2.length; index++) {
            sum2 += (double) massive2[index] / massive2.length;
            System.out.print("");
            System.out.print(massive2[index] + "\t");
        }
        System.out.println();

        if (sum1 > sum2) {
            System.out.println("У первого массива среднее число больше, чем у второго.");
        } else if (sum1 < sum2) {
            System.out.println("У второго массива среднее число больше, чем у первого.");
        } else if (sum1 == sum2) {
            System.out.println("Средние числа двух массивов равны!");
        } else {
            System.out.println("Бред какой-то..");
        }
    }
}

