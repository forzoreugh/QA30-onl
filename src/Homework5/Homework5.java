package Homework5;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        getTask0();
        // getTask0 - 1, getDopTask2 - 5
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }


    public static void getTask0() {
        System.out.print("Введи число и я его добавлю к числам массива! Твое число: ");
        int numbers = new Scanner(System.in).nextInt();
        int massive[][][] = new int[][][]{
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }, {
                {0, 2, 4, 6},
                {111, 112, 113, 114}
        },
                {
                        {1, 1, 2},
                        {2, 2, 1}
                }
        };

        for (int outer = 0; outer < massive.length; outer++) {
            for (int inner = 0; inner < massive[outer].length; inner++) {
                for (int deep = 0; deep < massive[outer][inner].length; deep++) {
                    System.out.print(massive[outer][inner][deep] + numbers + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void getTask1() {
        String massive[][] = new String[8][8];
        for (int outer = 0; outer < massive.length; outer++) {
            for (int inner = 0; inner < massive[outer].length; inner++) {
                if ((outer + inner) % 2 == 0) {
                    massive[outer][inner] = "W";
                    System.out.print(massive[outer][inner] + " ");
                } else {
                    massive[outer][inner] = "B";
                    System.out.print(massive[outer][inner] + " ");
                }
            }
            System.out.println();
        }
    }


    public static void getDopTask2() {
        int massive1[][] = new int[][]{
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int massive2[][] = new int[][]{
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };
        int [][] matrix = new int [massive1.length][massive2[0].length];
        for (int outer = 0; outer < massive1.length; outer++) {
            for (int inner = 0; inner < massive2[0].length; inner++) {
                matrix[outer][inner] = 0;
                for (int deep = 0; deep < massive1[0].length; deep++) {
                    matrix[outer][inner] += massive1[outer][deep] * massive2[deep][inner];
                }
                System.out.print(matrix[outer][inner] + " ");
            }
            System.out.println();

        }
    }

        public static void getDopTask3 () {
            int massive[][] = new int[][]{
                    {100, 200, 300, 400},
                    {400, 300, 2, 1},
                    {3, 2, 1, 1}
            };
            int sum = 0;
            for (int outer = 0; outer < massive.length; outer++) {
                for (int inner = 0; inner < massive[outer].length; inner++) {
                    sum += massive[outer][inner];
                }
            }
            System.out.println("Сумма всех элементов массива равна = " + sum);
        }


        public static void getDopTask4 () {
            int massive[][] = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 9},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };
            System.out.print("Главная диагональ: ");
            for (int outer = 0; outer < massive.length; outer++) {
                System.out.print(massive[outer][outer] + "\t");
            }
            System.out.print("\nПобочная диагональ: ");
            for (int outer = 0; outer < massive.length; outer++) {
                System.out.print(massive[outer][massive.length - 1 - outer] + "\t");
            }
        }

        public static void getDopTask5 () {
            int massive[][] = new int[][]{
                    {1, 100, 5},
                    {155, 2, 3},
                    {7, 33, 566}
            };
            int swap;
            for (int outer = 0; outer < massive.length; outer++) {
                for (int inner = 0; inner < massive[outer].length; inner++) {
                    for (int deep = 0; deep < massive.length; deep++) {
                        for (int dop = 0; dop < massive[deep].length; dop++) {
                            if (massive[outer][inner] <= massive[deep][dop]) {
                                swap = massive[outer][inner];
                                massive[outer][inner] = massive[deep][dop];
                                massive[deep][dop] = swap;
                            }
                        }

                    }
                }
            }
            for (int outer = 0; outer < massive.length; outer++) {
                for (int inner = 0; inner < massive[outer].length; inner++) {
                    System.out.print(massive[outer][inner] + "\t");
                }
                System.out.println();
            }

        }
    }