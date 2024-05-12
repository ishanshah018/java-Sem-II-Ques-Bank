/*QB 149; Write a program to create a child thread to print integer numbers 1 to 10  */

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class QB149 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
}
