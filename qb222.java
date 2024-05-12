

// THIS CODE IS INCOMPLETE SEARCH_BY_NAME AND SEARCH_BY_CONTACT METHODS ARE NOT IMPLEMENTED YET !!

/*
Problem Statement: Implement a Phone Book
Write a Java program to implement a phone book using an ArrayList and a LinkedList. The 
phone book should allow users to add, delete, and search for contacts by name or phone 
number.
To solve this problem, you can create a Contact class that stores the name and phone 
number of each contact. You can then use an ArrayList to store the contacts and a LinkedList 
to store the indices of the contacts sorted by name
 */

import java.util.*;

class contact {
    String name;
    String phone_no;

    public contact(String name, String phone_no) {
        this.name = name;
        this.phone_no = phone_no;
    }

    public String getName() {
        return name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

}

class QB222 {
    static Scanner sc = new Scanner(System.in);
    ArrayList<contact> a1 = new ArrayList<>();
    LinkedList<Integer> l1 = new LinkedList<>();

    void addContact() {
        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNo = sc.nextLine();

        a1.add(new contact(name, phoneNo));
        System.out.println("Contact added successfully.");
    }

    void deleteContact() {
        System.out.println("Enter the index of Contact you want to delete: ");
        int index = sc.nextInt();

        if (index >= 0 && index < a1.size()) {
            contact ct = a1.get(index);
            a1.remove(index);
            System.out.println("Contact removed is: " + ct.getName() + " -- " + ct.getPhone_no());

        } else {
            System.out.println("Index not found!!");
        }
    }


    

    public static void main(String[] args) {
        QB222 qb = new QB222();

        while (true) {
            System.out.println(
                    "Enter Your Choice \n 1)ADD Contact \n 2)DELETE Contact \n 3)SEARCH_BY_NAME  \n 4)SEARCH_BY_CONTACT \n 5)EXIT. ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    qb.addContact();
                    break;

                case 2:
                    qb.deleteContact();
                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter Valid Choice..");
                    break;

            }
        }
    }
}
