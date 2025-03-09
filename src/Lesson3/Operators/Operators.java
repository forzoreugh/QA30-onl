package Lesson3.Operators;

import java.util.Scanner;

public class Operators {
    public static void main (String[] args) {
        getOperators();
    }
    public static void getOperators() {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите Ваш возраст - ");
        int myAge = input.nextInt();

        if (myAge <= 18 && myAge >= 12) {
            System.out.println("Вы являетесь подростком");
        }
        if (myAge < 12 && myAge > 0) {
            System.out.println("Вы являетесь ребенком");
        }
        if (myAge > 18 && myAge <= 80) {
            System.out.println("Вы совершеннолетний");
        }
        if ((myAge > 80 && myAge < 100) || myAge > 100) {
            System.out.println("Вы очень взрослый");
        }
        if (myAge <= 0) {
            System.out.println("Это полный бред..");
        }
        getOpersatorsIfElse();
    }


    public static void getOpersatorsIfElse() {
        Scanner input = new Scanner(System.in);
        System.out.print("Угадай число за одну попытку - ");
        int value = input.nextInt();

        if (value > 0 && value < 10) {
        System.out.println("Ха-ха! Не угадал, попробуй еще раз.");
    } else if (value >= 10) {
            System.out.println("Красавчик! Ты угадал");
        }
        else {
            System.out.println("Ты ввел какую-то чушь..");
        }
        getOperatorsSwitch();
    }

    public static void getOperatorsSwitch() {
        Scanner input = new Scanner(System.in);
        System.out.print("Угадай мое имя ");
String words = input.nextLine();

switch (words) {
    case "Артем":
        System.out.println("Твое имя Артем!");
        break;
    case "Илья":
        System.out.println("Ты не Артем..");
        break;
    default:
        System.out.println("Ты ввел какую-то чушь..");
}

    }
    }