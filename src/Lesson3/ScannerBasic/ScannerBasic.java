package Lesson3.ScannerBasic;

import java.util.Scanner;

public class ScannerBasic {

public static void main(String[] args) {
getInformation();
}

    public static void getInformation() {
    Scanner input = new Scanner(System.in);
        System.out.print("Название марки Вашего автомобиля - ");
        String mass = input.nextLine();
        System.out.print("Введите порядковый номер парковочного места автомобиля - ");
        int num = input.nextInt();
        System.out.print("Введите количество превышений за год - ");
        int quantity = input.nextInt();
        textIO(mass, num, quantity);
    }

    public static void textIO(String mass, int num, int quantity) {
        System.out.println("Названия марки Вашего автомобиля - " + mass);
        System.out.println("Порядковый номер Вашего парковочного места - " + num);
        System.out.println("Количество Ваших превышений за год - " + quantity);

    }
}
