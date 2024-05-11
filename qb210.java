/*  QB 210:
Write a program in which create two ArrayList. Add odd numbers between 1 to 10 in one 
arraylist and even numbers between 1 to 10 in another arraylist. Now merge these two 
ArrayList and sort them in descending order. At last print this sorted ArrayList.
*/

import java.util.*;

class QB210 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                a1.add(i);
            } else {
                a2.add(i);
            }
        }
        a1.addAll(a2);
        a1.sort(Comparator.reverseOrder());
        System.out.println(a1);
    }
}
