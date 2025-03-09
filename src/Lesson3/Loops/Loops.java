package Lesson3.Loops;

import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        setFor();
    }

    public static void setDoWhile() {
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number < 10);
        setWhile();
    }

    public static void setWhile() {
        int numbers = 1;
        while (numbers < 10) {
            System.out.println(numbers);
            numbers++;
        }
        setFor();
    }

    public static void setFor() {
        for (int numb = 1; numb <= 10; numb++) {
            System.out.println(numb);
            if (numb == 3) {
                return;
            }
            System.out.println("+1");
        }
    }
}

