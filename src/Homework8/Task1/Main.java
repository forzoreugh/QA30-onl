package Homework8.Task1;


public class Main {
    public static void main(String[] args) {
        getGo();
    }

    public static void getGo() {
        Figure[] massive = new Figure[]{
                new Circle("Треугольник", 3, 3, 3, 5),
               new Rectangle("Прямогульник", 4, 2),
                new Triangle("Круг", 2),
                new Circle("Треугольник", 5, 0, 2, 3),
               new Rectangle("Прямоугольник", 5, 5)
        };


       double sum = 0;
        for (Figure fig : massive) {
            sum += fig.perimeter;
        }
        System.out.println("Сумма периметров составляет: " + sum);
    }
}