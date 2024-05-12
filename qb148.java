/*  QB 148:
Write an application that creates and starts three threads. Each thread is instantiated from 
the
same class. It executes a loop with 10 iterations. Each iteration displays string "HELLO",
sleeps for 300 milliseconds. The application waits for all the threads to complete & displays 
the message "Good Bye..."
 */

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Hello ");

            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }
        }
    }
}

class QB148 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        t1.join();
        MyThread t2 = new MyThread();
        t2.join();
        MyThread t3 = new MyThread();
        t3.join();
        System.out.println("Good Bye..");
    }
}
