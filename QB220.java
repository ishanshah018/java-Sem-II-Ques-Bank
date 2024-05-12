/*  QB 220:
Write a Java program to clone an linked list to another linked list. 
 */

import java.util.*;

class QB220 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(60);
        l1.add(20);
        l1.add(60);

        System.out.println("List of Elements is: " + l1);

        Vector<Integer> v1 = new Vector<>(l1);

        Vector<Integer> v2 = (Vector) v1.clone();

        System.out.println("Clone: " + v2);

    }
}
