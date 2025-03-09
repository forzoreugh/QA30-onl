package Homework3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        taskLoops6();
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static void TaskOperators1() {
        System.out.print("Введите номер месяца в году - ");
        int numMonth = input().nextInt();

        switch (numMonth) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Вы ввели какую-то чушь..");
        }
    }

    public static void TaskOperators2() {
        System.out.print("Введите номер месяца в году - ");
        int numMonth = input().nextInt();

        if (numMonth == 1 || numMonth == 2 || numMonth == 12) {
            System.out.println("Зима");
        } else if (numMonth >= 3 && numMonth <= 5) {
            System.out.println("Весна");
        } else if (numMonth >= 6 && numMonth <= 8) {
            System.out.println("Лето");
        } else if (numMonth >= 9 && numMonth <= 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Ты ввел какую-то чушь..");
        }
    }

    public static void TaskOperators3() {
        System.out.print("Введите число, а я определю четное оно или нет: ");
        int getNumber = input().nextInt();
        if (getNumber % 2 == 0) {
            System.out.print("Данное число является кратным.");
        } else {
            System.out.print("Данное число не является кратным.");
        }
    }

    public static void TaskOperators4() {
        System.out.print("Введите число t (Температура на улице) для определения восприятия температуры: ");
        int getTemp = input().nextInt();

        if (getTemp > -5) {
            System.out.print("Тепло");
        } else if (getTemp <= -5 && getTemp > -20) {
            System.out.print("Нормально");
        } else if (getTemp <= -20) {
            System.out.print("Холодно");
        }
    }

    public static void TaskOperators5() {
        System.out.print("Введи порядковое число цвета радуги, а я скажу тебе цвет: ");
        int getTemp = input().nextInt();

        switch (getTemp) {
            case 1:
                System.out.print("Красный");
                break;
            case 2:
                System.out.print("Оранжевый");
                break;
            case 3:
                System.out.print("Желтый");
                break;
            case 4:
                System.out.print("Зеленый");
                break;
            case 5:
                System.out.print("Голубой");
                break;
            case 6:
                System.out.print("Синий");
                break;
            case 7:
                System.out.print("Фиолетовый");
                break;
            default:
                System.out.print("Цветов радуги всего 7! Введи еще раз..");
        }
    }

    public static void taskLoops1() {
        for (int number = 1; number < 100; number++) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    public static void taskLoops2() {
        int number = 5;
        do {
            System.out.println(number);
            number--;
        } while (number > 0);
    }

    public static void taskLoops3() {
        int numb = 1;
        int summ = 0;
        System.out.print("Введите число и я выведу все числа до него: ");
        int number = input().nextInt();

        do {
            summ += numb;
            numb++;
        } while (numb <= number);
        {
            System.out.print(summ);
        }
    }

    public static void taskLoops4() {
        int number1 = 7;
        int number2 = 0;
        while (number2 < 98) {
            number2 += number1;
            System.out.println(number2);
        }
    }

    public static void taskLoops5() {
        int number1 = -5;
        int number2 = 0;
        while (number2 > -45) {
            number2 += number1;
            System.out.println(number2);
        }
    }

    public static void taskLoops6() {
        int number1 = 1;
        int number2 = 9;
        int number3 = 0;
        while (number2 <= 19) {
            number2 += number1;
            number3 = number2 * number2;
            System.out.println(number3);
        }
    }
}