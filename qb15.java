import java.util.Scanner;

abstract class person {
    String name;
    String address;
    String phone;
    String email;

    public person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    abstract void display();

    abstract void input();
}

abstract class student extends person {
    String enrollment_course;

    public student(String name, String address, String phone, String email, String enrollment_course) {
        super(name, address, phone, email);
        this.enrollment_course = enrollment_course;
    }

    void display() {
        System.out.println("Name is: " + name);
        System.out.println("Address is: " + address);
        System.out.println("Phone is: " + phone);
        System.out.println("Email is: " + email);
        System.out.println("Enrollment course is: " + enrollment_course);
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter Address");
        address = sc.nextLine();
        System.out.println("Enter Phone");
        phone = sc.nextLine();
        System.out.println("Enter Email");
        email = sc.nextLine();
        System.out.println("Emter Enrollment Course");
        enrollment_course = sc.nextLine();

    }

}

class employee extends person {
    String office;
    String salary;
    String destination;

    public employee(String name, String address, String phone, String email, String office, String salary,
            String destination) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.destination = destination;
    }

    void display() {
        System.out.println("Office is:" + office);
        System.out.println("Salary is:" + salary);
        System.out.println("Destination is:" + destination);
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Office");
        office = sc.nextLine();
        System.out.println("Enter Salary");
        salary = sc.nextLine();
        System.out.println("Enter Destination");
        destination = sc.nextLine();
    }

}

class Main {
    public static void main(String[] args) {
        person p1 = new employee(" ", " ", " ", " ", " ", " ", " ");
        p1.input();
        p1.display();

    }
}
