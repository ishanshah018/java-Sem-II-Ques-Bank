/* QB 150:
Write a program to create two threads, one thread will check whether given number is 
prime or not and second thread will print prime numbers between 0 to 100
 */

class MyThread1 extends Thread {
    int n;

    MyThread1(int n) {
        this.n = n;
    }

    public void run() {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(Thread.currentThread().getName() + " Entered number " + n + " is Prime number");
        } else {
            System.out.println(Thread.currentThread().getName() + " Entered number " + n + "is not Prime number");

        }

    }
}

class MyThread2 extends Thread {
    int n;

    MyThread2(int n) {
        this.n = n;
    }

    public void run() {

        System.out.println(Thread.currentThread().getName() + " Prime numbers between 0 to " + n + " are: ");
        int count = 0;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }

        }

    }
}

class QB150 {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1(61);
        t1.start();
        t1.join();
        MyThread2 t2 = new MyThread2(100);
        t2.start();
    }
}
