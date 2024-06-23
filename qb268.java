/*  QB-268:
Write a program that reads in a list of words from the user and stores them in a HashSet. 
The program should then prompt the user for a prefix and output all the words in the set 
that start with that prefix.
*/

import java.util.*;

class QB268 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        // list of words from the user and stores them in a HashSet
        while (true) {
            System.out.println("Enter Word: ");
            String word = sc.nextLine();

            set.add(word);
            System.out.println("Do You want to Add Continue ? (YES/NO)");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("No")) {
                break;
            }
        }

        // prompt the user for a prefix and output all the words in the set that start
        // with that prefix.

        System.out.println("Enter Prefix for the word that you want to search");
        String prefix = sc.next();

        for (String ss : set) {
            if (ss.startsWith(prefix)) {
                System.out.println("--->" + ss);
            }
        }

    }
}
