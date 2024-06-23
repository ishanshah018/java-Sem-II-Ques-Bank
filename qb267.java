/*  QB-267:
Write a java program that reads in a list of integers from the user and stores them in a 
HashSet. The program should then compute the sum of all unique integers in the HashSet 
and output the result to the user. If the user enters the same integer multiple times, it 
should only be counted once in the sum.
*/

import java.util.*;

class QB267 {
    public static void main(String[] args) {
        HashSet<Integer> unum = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Number to add: ");
            int no = sc.nextInt();
            unum.add(no);

            System.out.println("Do You Want to Add Continue ? (YES/NO)");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("No")) {
                break;
            }

        }

        int sum = 0;
        for (Integer i : unum) {
            sum = sum + i;
        }

        System.out.println("Sum =" + sum);
        
    }
}
