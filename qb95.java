//Write a program to handle NullPointerException.

class ex17 {
    public static void main(String[] args) {
        String s[] = new String[] { null, "PQR" };
        try {
            s[0].length();
        } catch (NullPointerException e) {
            System.out.println("No Element find !!");
        }
    }
}
