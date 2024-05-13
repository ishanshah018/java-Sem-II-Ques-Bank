/* QB 218:
Write a Java program to insert the specified element at the specified position in the linked 
list.
 */

import java.util.*;

class QB218 {
    public static void main(String[] args) {
        LinkedList<Integer> a1 = new LinkedList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);

        System.out.println("Original List" + a1);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Specific position(index) to insert new element: ");
        int pos = sc.nextInt();

        if (pos >= 0 && pos <= a1.size()) {
            System.out.println("Enter Element to insert: ");
            int ele = sc.nextInt();
            a1.add(pos, ele);
            System.out.println("Updated list: " + a1);
        } else {
            System.out.println("Invalid Index");
            System.out.println();
            System.out.println("List not Updated");
        }

    }
}
