//QB-103
//Give Command line argument 

class qb103 {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new NumberFormatException("Length should not be Zero Enter any element. ");
        }
        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                if (num < 0) {
                    throw new IllegalArgumentException("Number should not be Negative");
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
        System.out.println("All Argument are valid and non-negative ");
    }
}

//java qb103 1 -2
