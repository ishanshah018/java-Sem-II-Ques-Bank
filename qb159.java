// Producer-Consumer Problem using wait & notify

class procon {
    boolean status = false;
    int data;

    synchronized void produce(int n) {
        if (status) {
            System.out.println("Producer Waiting..");
            try {
                wait();
            } catch (Exception e) {

            }
        }
        data = n;
        System.out.println("Produces: " + data);
        status = true;
        notify();
    }

    synchronized void consume() {
        if (!status) {
            System.out.println("Consumer Waiting..");
            try {
                wait();
            } catch (Exception e) {

            }
        }
        System.out.println("Consume: " + data);
        status = false;
        notify();
    }
}

class Producer extends Thread {
    procon pc;

    public Producer(procon pc) {
        this.pc = pc;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            pc.produce(i);
        }
    }
}

class Consumer extends Thread {
    procon pc;

    public Consumer(procon pc) {
        this.pc = pc;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            pc.consume();
        }
    }

}

class solution {
    public static void main(String[] args) {
        procon pc = new procon();
        Producer p = new Producer(pc);
        Consumer c = new Consumer(pc);

        p.start();
        c.start();
    }
}
