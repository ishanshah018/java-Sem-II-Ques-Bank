/*  QB 261:
Write a Java program that takes a list of integers as input from the user and stores them in a 
PriorityQueue. The program should then remove and display the top three highest integers 
from the PriorityQueue.
 */

import java.util.*;

class QB261 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Capacity: ");
        int cap = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cap; i++) {
            System.out.println("Enter " + (i + 1) + "th Element: ");
            int element = sc.nextInt();
            pq.add(element);
        }

        System.out.println("Top Three Highest Elements: ");

        for (int i = 0; i < 3; i++) {
            if (!pq.isEmpty()) {
                int highestelement = pq.poll();
                System.out.println(highestelement);
            } else {
                System.out.println("not Enough Elements");
                break;
            }
        }
    }
}
