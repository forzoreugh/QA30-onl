package Homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Homework4 {
    public static void main(String[] args) {
        getTask0();
        // getTask0 - 3, getDopTask4 - 7
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

        int massive[] = new int[]{1, 3, 1, 7, 9, 11};
        boolean isTrue = false;

        System.out.print("Введи число и я удалю его из массива: ");
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
            massive[index] = (int) (Math.random() * getSize);
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

    public static void getDopTask4() {

        for (int index = 0; ; index++) {
            System.out.print("Установи размер массива: ");
            int getSizeMassive = new Scanner(System.in).nextInt();
            int massive[] = new int[getSizeMassive];
            if (getSizeMassive > 5 && getSizeMassive <= 10) {
                for (int index1 = 0; index1 < massive.length; index1++) {
                    massive[index1] = (int) (Math.random() * getSizeMassive);
                    System.out.print(massive[index1] + "\t");
                }
                System.out.println();
                for (int x : massive) {
                    if (x % 2 == 0) {
                        System.out.print(x + "\t");
                    }
                }
                break;
            } else {
                System.out.println("Неверное условие для ввода. Повтори попытку еще раз.");
            }
        }
    }

    public static void getDopTask5() {
        int massive[] = new int[]{1, 3, 5, 7, 9};
        for (int index1 = 0; index1 < massive.length; index1++) {
            System.out.print(massive[index1] + "\t");
        }
        System.out.println();
        for (int index = 0; index < massive.length; index++) {
                if (index % 2 == 1 ) {
                    massive[index] = 0;
                }
                System.out.print(massive[index] + "\t");
            }
        }


    public static void getDopTask6() {
        String names [] = new String [] { "Artsiom", "Irina", "Yuriy", "Arina", "Vladislav", "Archil"};
for (int index = 0; index < names.length; index++) {
    Arrays.sort(names);
    System.out.println(names[index]);

}
    }

    public static void getDopTask7() {
        int numbers [] = new int [] {1, 55, 3, 22, 103, 122};

        for (int index = 0; index < numbers.length; index++) {
            for (int index1 = 0; index1 < numbers.length - 1 - index; index1++) {
                if (numbers[index1] > numbers[index1 + 1]) {
                    int num = numbers[index1];
                    numbers[index1] = numbers[index1 + 1];
                    numbers[index1 + 1] = num;

                }
            }
        } System.out.println(Arrays.toString(numbers));

    }
        }


