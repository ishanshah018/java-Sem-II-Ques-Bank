import java.util.*;
import java.io.*;

public class QB271 {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("inputData.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hi Hello How are you Hi");
        bw.newLine();
        bw.write("Hello I am fine How are you");
        bw.write(12);
        bw.close();

        FileReader fr = new FileReader("inputData.txt");
        BufferedReader br = new BufferedReader(fr);
        HashMap<String, Integer> map = new HashMap<>();
        String line = "";
        while ((line = br.readLine()) != null) {
            String words[] = line.split(" ");
            for (String w : words) {
                if (map.get(w) == null) {
                    map.put(w, 1);
                } else {
                    map.put(w, (map.get(w) + 1));
                }

            }
        }

        for (Map.Entry e : map.entrySet()) {
            System.out.println("Count for: " + e.getKey() + " is = " + e.getValue());

        }
        br.close();
        fr.close();
    }

}
