/* QB 221:
Write a Java program to append the specified element to the end of a linked list & 
Write a Java program to iterate through all elements in a linked list.
 */

import java.util.*;

class QB221 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        System.out.println("List: " + l1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to append at the end of list: ");
        int end = sc.nextInt();

        if (!l1.isEmpty()) {
            l1.addLast(end);
        }

        System.out.println("New List: " + l1);

        System.out.println("List through iterator: ");

        Iterator itr = l1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
