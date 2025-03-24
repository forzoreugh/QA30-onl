package Homework6.Task0;

import java.util.Scanner;

public class CreditCard {
    public int accountNumber;
    public int amountOnAccount;

    public void getGreetings() {
        System.out.println("Здравствуйте! Вас приветствует MTBank!");

    }

    public void getSumm() {
        System.out.print("Введите сумму, которую хотите внести на Ваш лицевой счет №" + accountNumber + ": ");
        int summ = new Scanner(System.in).nextInt();
        amountOnAccount += summ;
        System.out.println("Ваш баланс равен = " + amountOnAccount);
    }

    public void getSubtration() {
        System.out.print("Введите сумму, которую хотите снять с Вашего лицевого счета №" + accountNumber + ": ");
        int substraction = new Scanner(System.in).nextInt();
        amountOnAccount -= substraction;
        if (amountOnAccount < 0) {
            System.out.println("К сожалению у Вас нет такой суммы. До свидания.");
        } else {
            System.out.println("Ваш баланс равен = " + amountOnAccount);
            System.out.println("До скорых встреч!");
        }
    }
}
