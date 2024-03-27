//CUSTOM EXCEPTION PROGRAM

//QB 94

import java.util.*;

class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

class Exceptiondemo {
    void compute(int a) throws MyException {
        if (a > 10) {
            throw new MyException(a + " is greater than 10");
        } else {
            System.out.println(a + " is less than 10 ");
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
