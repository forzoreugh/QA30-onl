package Homework6.Task2;

import java.util.Scanner;

public class ATM {
    private int nominale20;
    private int nominale50;
    private int nominale100;

    public ATM(int n20, int n50, int n100) {
        nominale20 = n20;
        nominale50 = n50;
        nominale100 = n100;

    }

    public void getInfo() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Здравствуйте! Вас приветствует банкомат MTBank!");
        System.out.println("Ниже указана информация о количестве купюр в банкомате.");
        System.out.println("Количество купюр номиналом 20 рублей составляет: " + nominale20);
        System.out.println("Количество купюр номиналом 50 рублей составляет: " + nominale50);
        System.out.println("Количество купюр номиналом 100 рублей составляет: " + nominale100);
    }

    public void getSumm() {
        System.out.print("Укажите номинал вносимых купюр (20, 50 или 100): ");
        int nominale = new Scanner(System.in).nextInt();
        if (nominale != 20 && nominale != 50 && nominale != 100) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Таких купюр нет, добавление купюр в банкомат заблокировано.");
            System.out.println("-------------------------------------------------------------");
            return;
        }
        System.out.println("Укажите количество вносимых купюр");
        int count = new Scanner(System.in).nextInt();
        switch (nominale) {
            case 100:
                nominale100 += count;
                System.out.println("Количество купюр номиналом 100 рублей составляет: " + nominale100);
                break;
            case 50:
                nominale50 += count;
                System.out.println("Количество купюр номиналом 50 рублей составляет: " + nominale50);
                break;
            case 20:
                nominale20 += count;
                System.out.println("Количество купюр номиналом 20 рублей составляет: " + nominale20);
                break;
        }
    }

    public void getMoney() {
        System.out.println("Укажите сумму, которую Вам нужно вывести с Вашего счета.");
        System.out.println("Банкомат выдает купюры только номиналом 20, 50 или 100 рублей.");
        int summ = new Scanner(System.in).nextInt();
        boolean isTrue = true;
        if (summ > 19) {
            System.out.println("Успешность выполнения операции: " + isTrue);
        } else {
            isTrue = false;
            System.out.println("Успешность выполнения операции: " + isTrue);
        }
        int count20 = 0;
        int count50 = 0;
        int count100 = 0;
        while (summ > 0 && summ % 10 != 1) {
            if (summ >= 100) {
                count100 = summ / 100;
                summ -= count100 * 100;
                System.out.println("Количество выданных купюр номиналом 100 рублей составило: " + count100);
            } else if (summ >= 50) {
                count50 = summ / 50;
                summ -= count50 * 50;
                System.out.println("Количество выданных купюр номиналом 50 рублей составило: " + count50);
            } else if (summ >= 20) {
                count20 = summ / 20;
                summ -= count20 * 20;
                System.out.println("Количество выданных купюр номиналом 20 рублей составило: " + count20);
            } else if (summ == 0) {
                return;
            } else {
                System.out.println("Для остальной суммы отсутствуют купюры.");
                break;
            }
        }
        int sumNominale = ((count20 * 20) + (count50 * 50) + (count100 * 100));
        if (sumNominale <= 0) {
            System.out.println("Банкомат деньги не выдавал.");
        } else {
            System.out.println("Выданная банкоматом Вам сумма = " + sumNominale);
        }
    }
}