/*
Write a program that reads in a list of names and corresponding phone numbers from the 
user, and stores them in a HashMap. The program should then prompt the user for a name 
and output the corresponding phone number, or a message indicating that the name is not 
in the map.
*/

import java.util.*;

class QB269 {
    public static void main(String[] args) {
        HashMap<String, String> data = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Phone Number: ");
            String ph = sc.nextLine();
            data.put(name, ph);

            System.out.println("Do You want to Add Continue ?(YES/No)");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("No")) {
                break;
            }
        }

        System.out.println("Enter Name to Search Corresponding Phone Number");
        String searchName = sc.nextLine();

        String searchNumber = data.get(searchName);

        if (searchNumber != null) {
            System.out.println("Phone number of:" + searchName + " = " + searchNumber);
        } else {
            System.out.println("Name is not there in SearchBook");
        }
    }
}
