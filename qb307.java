import java.io.*;
import java.util.*;
import java.util.Collections;

class QB307 {
    public static void main(String[] args) throws IOException {
        File f = new File("qb.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        ArrayList<Integer> al = new ArrayList<>();

        bw.write("1");
        bw.newLine();
        bw.write("55");
        bw.newLine();
        bw.write("12");
        bw.newLine();
        bw.write("33");
        bw.newLine();
        bw.write("80");

        bw.close();

        FileReader fr = new FileReader("qb.txt");
        BufferedReader br = new BufferedReader(fr);

        String read = br.readLine();

        while (read != null) {
            int number = Integer.parseInt(read);
            al.add(number);
            read = br.readLine();
        }
        br.close();

        // Sorting

        Collections.sort(al);

        File f2 = new File("newQb.txt");
        FileWriter fr2 = new FileWriter(f2);
        BufferedWriter bww = new BufferedWriter(fr2);

        for (Integer i : al) {
            bww.write(Integer.toString(i));
            bww.newLine();
        }

        bww.close();
        System.out.println("File Sorted..");

    }
}
