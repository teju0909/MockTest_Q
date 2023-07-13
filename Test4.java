package JavaMockTest_1;
interface Drawable {

    public void draw();
}

class circle implements Drawable {

    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

class rectangle implements Drawable {

    private double width;
    private double height;

    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}

public class Test4 {

    public static void main(String[] args) {
        circle circle = new circle(10);
        rectangle rectangle = new rectangle(20, 30);

        circle.draw();
        rectangle.draw();
    }
}