package Homework10.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getInfo();
    }
    public static void getInfo(){
        System.out.println("Введите произвольный текст и я определю максимальные и минимальные по длине слова: ");
        String info = new Scanner(System.in).nextLine();
        String [] sc = info.split(" ");
        int maxLenght = 0;
        int minLenght = 0;

        for (String s : sc){
            if(s.length() > maxLenght) {
                maxLenght = s.length();
            }
        }

        for (String s : sc){
            if(s.length() == maxLenght) {
                System.out.println(s);
            }
        }
    }
}
