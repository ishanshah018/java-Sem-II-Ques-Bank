//QB-16

abstract class shape {
    public abstract double area();
}

class triangle extends shape {
    private double b;
    private double h;

    public triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double area() {
        return 0.5 * b * h;
    }

}

class rectangle extends shape {
    private double l;
    private double w;

    public rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public double area() {
        return l * w;
    }

}

class circle extends shape {
    private double r;

    public circle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }
}

class Main {
    public static void main(String[] args) {
        triangle t = new triangle(2, 4);
        rectangle r = new rectangle(4, 6);
        circle c = new circle(2);

        System.out.println("Area of Triangle is: " + t.area());
        System.out.println("Area of Rectangle is: " + r.area());
        System.out.println("Area of Circle is: " + c.area());
    }
}
