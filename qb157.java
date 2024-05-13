
/* QB-157:
 Write an application that read limit from user and executes two
 threads. One thread displays total of first n even numbers & another thread displays 
total of first n odd numbers. Create the threads by implementing the Runnable interface*/
import java.util.*;

class MyRunnable1 implements Runnable {
    int limit;

    public MyRunnable1(int limit) {
        this.limit = limit;
    }

    public void run() {
        int sum = 0;
        for (int i = 2; i <= limit * 2; i += 2) {
            sum += i;
        }
        System.out.println("Sum of first " + limit + " even numbers: " + sum);
    }
}

class MyRunnable2 implements Runnable {
    int limit;

    public MyRunnable2(int limit) {
        this.limit = limit;
    }

    public void run() {
        int sum = 0;
        for (int i = 1; i <= limit * 2 - 1; i += 2) {
            sum += i;
        }
        System.out.println("Sum of first " + limit + " odd numbers: " + sum);
    }
}

class QB157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        MyRunnable1 a = new MyRunnable1(limit);
        MyRunnable2 b = new MyRunnable2(limit);

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}
