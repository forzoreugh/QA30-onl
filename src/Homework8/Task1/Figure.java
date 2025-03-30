package Homework8.Task1;

public abstract class Figure {
    protected static String nameFigure;
    double perimeter;
    double square;

    public Figure(String nameFigure){
    this.nameFigure = nameFigure;


    }
    int y = 0;
    public void summ(){
    }

    public abstract double getSquare();

    public abstract double getPerimeter();

    public void getInformation() {
        System.out.println("Фигура: " + nameFigure + "\nПериметр фигуры составляет: " + perimeter +
                "\nПлощадь фигуры составляет: " + square);
        System.out.println("-----------------------------------------------------------------------");
    }

}
