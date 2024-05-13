/* QB 214
Write a Java program to copy one array list into another. & sort the second arraylist & 
search an element in a array list
 */

import java.util.*;

class QB214 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(5);
        a1.add(2);
        a1.add(8);
        a1.add(1);
        a1.add(9);

        ArrayList<Integer> b1 = new ArrayList<>(a1);

        Collections.sort(b1);

        System.out.println("Sorted ArrayList: " + b1);

        // Search for an element in the ArrayList
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        if (b1.contains(search)) {
            System.out.println("Element " + search + " found in the destination ArrayList.");
        } else {
            System.out.println("Element " + search + " not found in the destination ArrayList.");
        }
    }
}
