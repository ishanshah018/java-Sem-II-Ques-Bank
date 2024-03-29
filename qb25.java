//QB-25
//Multiple Inheritance using Interface 

import java.util.Scanner;

interface circle {
    void arcircle(int r);
}

interface square {
    void arsquare(int l);
}

class shape implements circle, square {
    public void arcircle(int r) {
        System.out.println("Area of Circle is: " + 3.14 * r * r);
    }

    public void arsquare(int l) {
        System.out.println("Area of Square is: " + l * l);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r for circle: ");
        int r = sc.nextInt();
        System.out.println("Enter l for square: ");
        int l = sc.nextInt();

        shape s = new shape();
        s.arcircle(r);
        s.arsquare(l);

    }
}
