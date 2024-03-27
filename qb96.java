//QB-96

import java.util.*;

class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

class Exceptiondemo {
    void compute(int a) throws MyException {
        if (a % 7 == 0 & a % 5 != 0) {
            throw new MyException(a + " is divisible by 7 and not divisible by 5");
        } else {
            System.out.println("Invalid");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        Exceptiondemo ed = new Exceptiondemo();
        try {
            ed.compute(a);
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
