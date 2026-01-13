public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}