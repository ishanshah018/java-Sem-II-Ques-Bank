import java.util.*;

class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

class qb99 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter Marks out of 100: ");
            a[i] = sc.nextInt();
        }

        try {
            for (int mark : a) {
                if (mark < 35) {
                    throw new MyException("Found: Marks less than 35 !!");
                }
            }
            System.out.println("All Marks Are Valid..");
        } catch (MyException e) {
            System.out.println("Exception " + e.getMessage());
        }

    }
}
