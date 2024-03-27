// QB 92

//Pass Command ine argument for x & y.
class qb92 {
    public static void power(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result = result * x;
        }
        System.out.println(y + " power of " + x + " is " + result);
    }

    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            if (y < 0) {
                throw new IllegalArgumentException("Negative value for y is invalid");
            } else {
                power(x, y);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Must Enter Two Argument ");
        } catch (NumberFormatException e) {
            System.out.println("Number must be Integer");
        } catch (IllegalArgumentException e) {
            System.out.println("Value of y is negative ");
        }
    }
}
