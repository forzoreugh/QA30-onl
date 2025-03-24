package Homework6.Task2;

public class InfoATM {
    public static void main(String[] args) {
        atmInfo();
    }

    public static void atmInfo() {
        ATM atm2 = new ATM(20, 20, 20);
        atm2.getInfo();
        atm2.getSumm();
        atm2.getMoney();
    }
}
