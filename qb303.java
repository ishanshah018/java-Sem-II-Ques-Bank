import java.io.*;

class QB303 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Enter File name in CMD");
            return;
        }

        String cmd = args[0];

        File f = new File(cmd);

        if (f.isFile()) {
            System.out.println("The given path is a File");

            System.out.println("File Path" + f.getPath());

        } else if (f.isDirectory()) {
            System.out.println("The given path is a Directory");

            File[] list = f.listFiles();

            for (File l : list) {
                System.out.println(l.length());
            }
        }
    }
}
