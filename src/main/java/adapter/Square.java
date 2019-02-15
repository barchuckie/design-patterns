package adapter;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSquareArea() {
        return side*side;
    }

    public double getSquarePerimeter() {
        return 4*side;
    }
}
