package Homework8and9.Task1HM8;

public class Rectangle extends Figure{
    protected double a;
    protected double b;

    public Rectangle(String nameFigure, double a, double b){
        super("Прямоугольник");
        this.a = a;
        this.b = b;
        getPerimeter();
        getSquare();
        getInformation();
    }


    @Override
    public double getSquare() {
        square = a * b;
        return square;
    }

    @Override
    public double getPerimeter() {
        perimeter = (a + b) * 2;
        return perimeter;
    }

    @Override
    public void getInformation() {
        super.getInformation();
    }
}
