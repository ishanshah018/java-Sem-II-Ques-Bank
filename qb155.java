/*
Create PaymentThread class by extending Thread and Make a program to count payments 
of 10 tickets each of 100 rs. Display total using main thread.
 */

class PaymentThread extends Thread {
    static int ticket_price = 100;
    static int total_payment = 0;

    public void run() {
        for (int i = 0; i < 10; i++) {
            makePayment();
        }
    }

    public synchronized void makePayment() {
        total_payment += ticket_price;
        System.out.println("Payment made for ticket: RS: " + ticket_price);
    }

    public static synchronized int getTotalPayment() {
        return total_payment;
    }
}

class QB155 {
    public static void main(String[] args) {
        PaymentThread pt = new PaymentThread();
        pt.start();
        try {
            pt.join();
        } catch (Exception e) {

        }
        System.out.println("Total payment for 10 Tickets: RS:  " + PaymentThread.getTotalPayment());
    }
}
