package Homework8and9.Task1HM8;

public class Triangle extends Figure{
    protected int r;


    public Triangle(String nameFigure, int r){
        super("Круг");
        this.r = r;
        getPerimeter();
        getSquare();
        getInformation();
    }


    @Override
    public double getSquare() {
        square = 3.14 * (r * r);
        return square;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * 3.14 * r;
        return perimeter;
    }

    @Override
    public void getInformation() {
        super.getInformation();
    }
}
