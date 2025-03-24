/* package MyPackage;

import java.util.Scanner;

public class ATM {
    public int accountNumber;
    public int currentAccountAmount;
    public static void main(String[] args) {
        getGreetings();
    }

    public static void getGreetings() {
        System.out.println("Здравствуйте! Вас приветствует MTBank.");
        System.out.println("Выберите свой лицевой счет! У Вас их три (номера: 1, 2, 3). Выберите: ");
        int numAccount = new Scanner(System.in).nextInt();
        if (numAccount == 1) {
            getAccountNumber();
        } else if (numAccount == 2) {
            getAccountNumber1();
        } else if (numAccount == 3) {
            getAccountNumber2();
        } else {
            System.out.println("Данный лицевой счет не зарегестрирован на Вас. Вы мошенник???");
        }
    }

    public static void getChoosingAPath(int accountNumber, int currentAccountAmount) {
        System.out.println("Выберите какую операцию Вы хотите выполнить!");
        System.out.println("Для пополнения счета введите: 1");
        System.out.println("Для вывода суммы со счета введите: 2");
        System.out.println("Для уточнения суммы на счете введите: 3");
        System.out.println("Для уточнения суммы на всех балансах: 4");
        System.out.print("Укажите операцию: ");
        int getNumb = new Scanner(System.in).nextInt();
        if (getNumb == 1) {
            getAddingAmount(accountNumber, currentAccountAmount);
        } else if (getNumb == 2) {
            getWithdrawalMoney(accountNumber, currentAccountAmount);
        } else if (getNumb == 3) {
            getAmountOnAccount(accountNumber, currentAccountAmount);
        } else if (getNumb == 4) {
            amount(currentAccountAmount);
        }
        else {
            System.out.print("Данная операция заблокирована. Начните заново.");
        }

    }

    public static void getAddingAmount(int accountNumber, int currentAccountAmount) {
        System.out.print("Укажите сумму для пополнения дебетового счета: ");
        int replenishment = new Scanner(System.in).nextInt();
        currentAccountAmount += replenishment;
        getAmountOnAccount(accountNumber, currentAccountAmount);
    }

    public static void getWithdrawalMoney (int accountNumber, int currentAccountAmount) {
        System.out.print("Укажите сумму для снятия суммы с дебетового счета: ");
        int withdrawal = new Scanner (System.in).nextInt();
        currentAccountAmount -= withdrawal;
        if (currentAccountAmount < 0) {
            System.out.println("Недостаточно средств на счету. До свидания.");
            return;
        }
        getAmountOnAccount(accountNumber, currentAccountAmount);
    }

    public static void getAmountOnAccount(int accountNumber, int currentAccountAmount) {
        System.out.println("Сумма Вашего дебетового счета состовляет: " + currentAccountAmount + " рублей");
        System.out.println("Хотите ли Вы продолжить операцию? 1 - Да, 2 - Нет, 3 - Выйти в меню");
        int number = new Scanner(System.in).nextInt();
        if (number == 1) {
            getChoosingAPath(accountNumber, currentAccountAmount);
        } else if (number == 2) {
            System.out.println("Всего доброго! До свидания.");
        } else if (number == 3) {
            getChoosingAPath(accountNumber, currentAccountAmount);
        }
        else {
            System.out.println("Извините, всего доброго.");
        }
    }

    public static void getAccountNumber() {
        Homework6.Task0.CreditCard accountNumber1 = new Homework6.Task0.CreditCard();
        accountNumber1.accountNumber = 1;
        accountNumber1.currentAccountAmount = 550;
        accountNumber1.getChoosingAPath(accountNumber1.accountNumber, accountNumber1.currentAccountAmount);
    }

    public static void getAccountNumber1() {
        Homework6.Task0.CreditCard accountNumber2 = new Homework6.Task0.CreditCard();
        accountNumber2.accountNumber = 2;
        accountNumber2.currentAccountAmount = 0;
        accountNumber2.getChoosingAPath(accountNumber2.accountNumber, accountNumber2.currentAccountAmount);
    }

    public static void getAccountNumber2() {
        Homework6.Task0.CreditCard accountNumber3 = new Homework6.Task0.CreditCard();
        accountNumber3.accountNumber = 3;
        accountNumber3.currentAccountAmount = 100_000;
        accountNumber3.getChoosingAPath(accountNumber3.accountNumber, accountNumber3.currentAccountAmount);
    }

    public static void amount(int currentAccountAmount) {
        System.out.println("Балансы на счетах составляют: ");
        System.out.println("Баланс счета 1 = " + currentAccountAmount);
        System.out.println("Баланс счета 2 = " + currentAccountAmount);
        System.out.println("Баланс счета 3 = " + currentAccountAmount);
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }
}
*/



