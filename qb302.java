import java.io.*;

class QB302 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Enter File name in CMD");
            return;
        }

        String cmd = args[0];
        File f = new File(cmd);

        if (f.isFile()) {
            System.out.println("The given path is a file.");
            System.out.println("Size of file: " + f.length());
        }

        else if (f.isDirectory()) {
            System.out.println("The given path is a Directory.");

            System.out.println("Files in Directory are: ");

            File[] list = f.listFiles();
            for (File ff : list) {
                System.out.println(list);
            }

        }
    }
}
