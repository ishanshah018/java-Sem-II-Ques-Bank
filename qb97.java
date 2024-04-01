//QB-97

class qb97 {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new NumberFormatException("Length should not be Zero Enter any element. ");
            } else if (args[0].equals("0")) {
                throw new IllegalArgumentException("First Command should not be Zero. ");
            } else {
                System.out.println("Command line argument executed..");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
