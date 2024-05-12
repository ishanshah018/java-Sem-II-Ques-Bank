/* QB 212
Remove Duplicates from an ArrayList
Write a Java program to remove duplicates from an ArrayList. You need to implement a 
function that takes an ArrayList as input and returns an ArrayList with duplicates removed.
 */

import java.util.*;

class QB212 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(30);
        a1.add(30);
        a1.add(10);
        a1.add(20);
        a1.add(40);
        System.out.println(a1);

        ArrayList unum = mt(a1);
        System.out.println("Duplicates Remved List: " + unum);
    }

    static ArrayList mt(ArrayList a1) {
        ArrayList result = new ArrayList();

        for (Object ob : a1) {
            if (!result.contains(ob)) {
                result.add(ob);
            } else {
                continue;
            }
        }
        return result;
    }
}
