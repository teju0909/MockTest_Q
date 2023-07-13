package JavaMockTest2;

abstract class Shape {

    abstract public double calculateArea();
}

class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}

class Test2 {

    public static void printArea(Shape shape) {
        System.out.println("The area of the shape is " + shape.calculateArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(10, 20);

        Test2.printArea(rectangle);
        Test2.printArea(circle);
        Test2.printArea(triangle);
    }
}



