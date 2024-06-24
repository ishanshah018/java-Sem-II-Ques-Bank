/* QB-299
Write a java program which read numbers from number.txt file and store even number to 
even.txt and odd number into odd.txt file
*/

import java.io.*;

class QB299 {
    public static void main(String[] args) throws IOException {
        FileWriter fw1 = new FileWriter("number.txt");
        BufferedWriter bw1 = new BufferedWriter(fw1);

        bw1.write("1");
        bw1.newLine();
        bw1.write("2");
        bw1.newLine();
        bw1.write("3");
        bw1.newLine();
        bw1.write("4");
        bw1.newLine();
        bw1.write("5");
        bw1.newLine();
        bw1.close();

        FileReader fr1 = new FileReader("number.txt");
        BufferedReader br1 = new BufferedReader(fr1);

        FileWriter fw2 = new FileWriter("even.txt");
        BufferedWriter bw2 = new BufferedWriter(fw2);

        FileWriter fw3 = new FileWriter("odd.txt");
        BufferedWriter bw3 = new BufferedWriter(fw3);

        String i = br1.readLine();

        while (i != null) {
            int number = Integer.parseInt(i);
            if (number % 2 == 0) {
                bw2.write(Integer.toString(number));
                bw2.newLine();
                i = br1.readLine();

            } else if (number % 2 != 0) {
                bw3.write(Integer.toString(number));
                bw3.newLine();
                i = br1.readLine();
            }
        }

        bw2.close();
        bw3.close();
        br1.close();

    }
}
