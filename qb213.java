/* QB 213:
Merge two sorted ArrayLists
Write a Java program to merge two sorted ArrayLists into a single sorted ArrayList. You need 
to implement a function that takes two sorted ArrayLists as input and returns a single sorted 
ArrayList containing all the elements.
 */

import java.util.*;
class QB213 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(50);
        a2.add(60);
        a2.add(30);
        a2.add(40);
        a1.add(80);
        a2.add(90);

        a1.sort(Comparator.naturalOrder());
        a2.sort(Comparator.naturalOrder());

        ArrayList urg = mt(a1, a2);
        System.out.println("Merged List is: " + urg);

    }

    static ArrayList mt(ArrayList a1, ArrayList a2) {
        ArrayList mlist = new ArrayList();

        mlist.addAll(a1);
        mlist.addAll(a2);

        System.out.println(mlist);
        mlist.sort(Comparator.naturalOrder());

        return mlist;

    }
}
