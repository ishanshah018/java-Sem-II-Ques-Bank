// QB-15

import java.util.*;

abstract class person {
    String name, address, ph, email;

    public person(String name, String address, String ph, String email) {
        this.name = name;
        this.address = address;
        this.ph = ph;
        this.email = email;
    }

    abstract void display();

}

class student extends person {
    String enr_course;

    public student(String name, String address, String ph, String email, String enr_course) {
        super(name, address, ph, email);
        this.enr_course = enr_course;
    }

    void display() {
        System.out.println("Name is: " + super.name);
        System.out.println("Address is: " + super.address);
        System.out.println("Phone is: " + super.ph);
        System.out.println("Email is: " + super.email);
        System.out.println("Enrollment course is: " + enr_course);
        System.out.println();
    }

}

class employee extends person {
    String office, salary, designation;

    public employee(String name, String address, String ph, String email, String office, String salary,
            String designation) {
        super(name, address, ph, email);
        this.office = office;
        this.salary = salary;
        this.designation = designation;
    }

    void display() {
        System.out.println("Name is: " + super.name);
        System.out.println("Address is: " + super.address);
        System.out.println("Phone is: " + super.ph);
        System.out.println("Email is: " + super.email);
        System.out.println("Office is:" + office);
        System.out.println("Salary is:" + salary);
        System.out.println("Designation is:" + designation);
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<<<<<Enter Details of Student>>>>>");
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter Address");
        String address = sc.nextLine();
        System.out.println("Enter Phone");
        String ph = sc.nextLine();
        System.out.println("Enter Email");
        String email = sc.nextLine();
        System.out.println("Emter Enrollment Course");
        String enr_course = sc.nextLine();
        System.out.println();

        student s = new student(name, address, ph, email, enr_course);

        System.out.println("<<<<<Enter Details of Employee>>>>>");
        System.out.println("Enter name");
        String name1 = sc.nextLine();
        System.out.println("Enter Address");
        String address1 = sc.nextLine();
        System.out.println("Enter Phone");
        String ph1 = sc.nextLine();
        System.out.println("Enter Email");
        String email1 = sc.nextLine();
        System.out.println("Enter Office:");
        String office = sc.nextLine();
        System.out.println("Enter Salary:");
        String salary = sc.nextLine();
        System.out.println("Enter Designation:");
        String designation = sc.nextLine();
        System.out.println();

        employee e = new employee(name1, address1, ph1, email1, office, salary, designation);
        s.display();
        e.display();

    }
}
