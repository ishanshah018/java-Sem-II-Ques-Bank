/*  QB 156:
Write a multithreaded program to print all odd positive numbers in ascending order up to n, 
where n is a positive integer number given as a command line argument. Instantiate 
requited number of threads, where each thread except the last, examines next 50 numbers 
and the last thread examines remaining numbers up to n
 */

class oddprinter extends Thread {
    int start;
    int end;

    public oddprinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i += 2) {
            System.out.println(i);
        }
    }
}

class QB156 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Enter in CML");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int numThreads = (n + 49) / 50; // CALCULATES THE NO.OF THREADS .

        int start = 1;

        for (int i = 0; i < numThreads - 1; i++) {
            int end = start + 99;
            oddprinter t1 = new oddprinter(start, end);
            t1.start();
            start = end + 1;
        }
        int end = n;
        oddprinter t2 = new oddprinter(start, end);
        t2.start();
    }
}
