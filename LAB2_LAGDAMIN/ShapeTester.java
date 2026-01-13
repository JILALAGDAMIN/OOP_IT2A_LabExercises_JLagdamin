public class ShapeTester {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(10, 5);
        Shape square = new Square(4);
        Shape triangle = new Triangle(6, 3);
        Shape circle = new Circle(7);

        rectangle.calculateArea();
        square.calculateArea();
        triangle.calculateArea();
        circle.calculateArea();
    }
}