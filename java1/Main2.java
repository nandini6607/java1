abstract class Shape {
    protected int dim1;
    protected int dim2;
    public Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public abstract void printArea();
}
class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width); 
    }
    public void printArea() {
        int area = dim1 * dim2;
        System.out.println("Rectangle Area: " + area);
    }
}
class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height); 
    }
    public void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Triangle Area: " + area);
    }
}
class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0);
    }
    public void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Circle Area: " + area);
    }
}
class Main2 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        Shape triangle = new Triangle(10, 15);
        Shape circle = new Circle(7);
        rectangle.printArea();
        triangle.printArea();   
        circle.printArea();   
    }
}
