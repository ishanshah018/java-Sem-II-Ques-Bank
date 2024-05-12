/*  QB 153:
Write a program to create two threads, one thread will print odd numbers and second 
thread will print even numbers between 1 to 100 numbers 
 */

class MyThread extends Thread {
    public void run() {
        if (Thread.currentThread().getName().equals("odd")) {
            System.out.println("Odd: ");
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + ",");
                }
            }
            System.out.println();
        } else if (Thread.currentThread().getName().equals("even")) {
            System.out.println("even");
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + ",");
                }
            }
        }
    }
}

class QB153 {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        t1.setName("odd");
        t1.start();
        t1.join();

        MyThread t2 = new MyThread();
        t2.setName("even");
        t2.start();

    }
}
