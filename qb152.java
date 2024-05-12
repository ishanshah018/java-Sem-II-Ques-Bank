/* QB 152: 
Write an application that executes two threads. One thread displays "Good Morning" every 
1000 milliseconds & another thread displays "Good Afternoon" every 3000 milliseconds. 
Create the threads by implementing the Runnable interface.

 */
class MyRunnable implements Runnable {

    public void run() {
        while (true) {

            if (Thread.currentThread().getName().equals("MorningThread")) {
                try {
                    System.out.println("Good Morning");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            } else if (Thread.currentThread().getName().equals("AfternoonThread")) {
                try {
                    System.out.println("Good Afternoon");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

        }
    }
}

class QB152 {

    public static void main(String[] args) throws InterruptedException {
        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread(r);
        t1.setName("MorningThread");
        t1.start();
        Thread t2 = new Thread(r);
        t2.setName("AfternoonThread");
        t2.start();
    }
}
