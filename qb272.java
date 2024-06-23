/*  QB-272
Write a Java program that takes in a list of student names and their grades from the user 
and stores them in a HashTable. The program should then prompt the user for a student 
name and output their grade. If the student name is not found in the HashTable, the 
program should output an error message.

*/


import java.util.*;

class QB272 {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students. You want to enter. ");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println("Enter Name of student:");
            String name = sc.nextLine();

            System.out.println("Enter Grade of Student: ");
            String grade = sc.nextLine();

            table.put(name, grade);

        }
        System.out.println("Enter Student Name to see Grade: ");
        String getname = sc.nextLine();

        String getGrade = table.get(getname);

        if (getGrade != null) {
            System.out.println(getname + "->" + getGrade + " Grade.");
        } else {
            System.out.println("Student not found in List !!");
        }

    }
}
