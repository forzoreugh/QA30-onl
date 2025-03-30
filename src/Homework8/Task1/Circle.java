package Homework8.Task1;

public class Circle extends Figure {
    protected double a;
    protected double b;
    protected double c;
    protected double h;


    public Circle(String nameFigure, double a, double b, double c, double h) {
        super("Треугольник");
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        getPerimeter();
        getSquare();
        getInformation();
    }

    @Override
    public double getPerimeter() {
        perimeter = a + b + c;
        return perimeter;
    }

    @Override
    public double getSquare() {
        square = (0.5 * a) * h;
        return square;
    }

    @Override
    public void getInformation() {
        super.getInformation();
    }
}
