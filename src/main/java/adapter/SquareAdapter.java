package adapter;

public class SquareAdapter implements Shape {

    private Square square;

    SquareAdapter(double side) {
        square = new Square(side);
    }

    public double getArea() {
        return square.getSquareArea();
    }

    public double getPerimeter() {
        return square.getSquarePerimeter();
    }
}
