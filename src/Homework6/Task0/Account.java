package Homework6.Task0;

public class Account {
    public static void main(String[] args) {
getAccount();
    }

    public static void getAccount() {

        CreditCard class1 = new CreditCard();
        class1.amountOnAccount = 500_000;
        class1.accountNumber = 1;
        System.out.println("---------------------------------------------------");
        System.out.println("Номер лицевого счета = " + class1.accountNumber);
        System.out.println("Текущая сумма на счету = " + class1.amountOnAccount);
        System.out.println("---------------------------------------------------");

        CreditCard class2 = new CreditCard();
        class2.amountOnAccount = 10_000;
        class2.accountNumber = 2;
        System.out.println("Номер лицевого счета = " + class2.accountNumber);
        System.out.println("Текущая сумма на счету = " + class2.amountOnAccount);
        System.out.println("---------------------------------------------------");

        CreditCard class3 = new CreditCard();
        class3.amountOnAccount = 2_000;
        class3.accountNumber = 3;
        System.out.println("Номер лицевого счета = " + class3.accountNumber);
        System.out.println("Текущая сумма на счету = " + class3.amountOnAccount);
        System.out.println("---------------------------------------------------");


        class1.getGreetings();
        class1.getSumm();

        System.out.println("Выполнен переход на Ваш следующий счет.");
        class2.getSumm();

        System.out.println("Выполнен переход на Ваш следующий счет.");
        class3.getSubtration();
    }
}
