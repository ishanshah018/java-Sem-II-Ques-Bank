/*  QB 219:
Write a Java program to get the first and last occurrence of the specified elements in a 
linked list
 */

import java.util.*;

class QB219 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(60);
        l1.add(20);
        l1.add(60);

        System.out.println("List of Elements is: " + l1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element you have to find its occurance: ");
        int find = sc.nextInt();

        int ab = l1.indexOf(find);
        int pq = l1.lastIndexOf(find);

        System.out.println("First Occurance of " + find + " is at index: " + ab);
        System.out.println("Last Occurance of " + find + " is at index: " + pq);

    }
}
