import java.util.*;
import java.io.*;

class QB300 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("tax.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter Salary of Employee " + i);
            Double salary = sc.nextDouble();

            Double tax = taxcounter(salary);

            bw.write("Employee" + i + ":" + tax + "/- ₹ Tax.");
            bw.newLine();
        }
        bw.close();

    }

    static Double taxcounter(double salary) {
        Double taxrate = 0.10;
        return salary * taxrate;
    }
}
