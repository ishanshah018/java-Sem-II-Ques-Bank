import java.io.*;

class QB304 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Please provide the file name as a command line argument.");
            return;
        }

        String cmd = args[0];

        FileReader fr = new FileReader(cmd);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
    }
}
