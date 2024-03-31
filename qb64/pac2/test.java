package pac2;

import java.util.Scanner;

import pac1.circle;

public class test extends circle {

    public test(double r) {
        super(r);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r: ");
        double r = sc.nextInt();
        test c = new test(r);
        double ans = c.calc();

        System.out.println("Area of Circle is: " + ans);
    }
}
