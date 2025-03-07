/**
 * author Artem Svidinskiy
 * teacher Archil Sikharulidze
 * academy TeachMeSkills
 */

package Lesson2;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        /*
        Этапы выполнения:
        (1) Приглашение пользователя
        (2) Ввод данных
        (3) Обработка данных
        (4) Вывод результатов
         */
            provideBMICalculator();
        }
        // информирует
    public static void provideBMICalculator(){
        System.out.println("Приветствую тебя, мой дорогой пользователь!");
        System.out.println("Ты открыл BMICalculator и тебе потребуется ввести свой вес и рост.");
        getData();
    }
    // запрос данных
    public static void getData(){
        System.out.print("Пожалуйста, введи свой рост в см: ");
        int height = inputData().nextInt();
        System.out.print("Пожалуйста, введи свой вес в кг: ");
        double weight = inputData().nextDouble();
    }
    // прием данных
    public static Scanner inputData(){
        return new Scanner(System.in);

    }
}

