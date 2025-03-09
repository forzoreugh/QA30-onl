package Lesson3.BMICalculator;

import java.util.Scanner;

public class BMICalculator {
public static void main (String[] args) {
startBMI();
}

    public static void startBMI() {
    System.out.println("Приветствуем Вас, дорогой пользователь");
    System.out.println("Вы запустили калькулятор расчета индекса тела. Потребуется ввести данные");
    getData();
    }

    public static void getData() {

    Scanner input = new Scanner(System.in);

    System.out.print("Укажите свой рост в см: ");
    float height = input.nextInt();
    System.out.print("Укажите свой вес в кг: ");
    double weight = input.nextFloat();


    calculateBMI(height, weight);
    }


    public static void calculateBMI(float height, double weight) {
        height /= 100;
        float indexBMI = (float) weight / (height * height);
        textIndexBMI(indexBMI);
    }
    public static void textIndexBMI(float indexBMI) {
        System.out.print("Ваш индекс массы тела составляет " + indexBMI);
    }
}