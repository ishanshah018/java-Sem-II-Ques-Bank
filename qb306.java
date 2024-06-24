import java.io.*;

class QB306 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Number.txt");
        BufferedReader br = new BufferedReader(fr);

        int sum = 0;
        String line = br.readLine();

        while (line != null) {
            int number = Integer.parseInt(line);
            sum = sum + number;
        }

        System.out.println("Sum of Numbers is: " + sum);

    }
}
