//QB-16

abstract class Shape {
    abstract double area(double i, double j);
}

class Triangle extends Shape {
    double area(double base, double height) {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double area(double length, double width) {
        return length * width;
    }
}

class Circle extends Shape {
    double area(double radius, double temp) {
        return 3.14 * radius * radius;
    }
}

class Main {
    public static void main(String[] args) {
        Shape c1 = new Triangle();
        System.out.println("Area of triangle is: " + c1.area(10, 5));

        Shape c2 = new Rectangle();
        System.out.println("Area of rectangle is: " + c2.area(15, 10));

        Shape c3 = new Circle();
        System.out.println("Area of circle is: " + c3.area(2, 0));
    }
}
