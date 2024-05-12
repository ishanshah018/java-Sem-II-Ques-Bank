/* QB 211: Write a Java program to create a new array list, add some colors (string) and print out the 
collection */

import java.util.ArrayList;

class QB211 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Orange");
        a1.add("White");
        a1.add("Blue");
        a1.add("Black");
        a1.add("Brown");
        System.out.println("Colors: " + a1);

    }
}
