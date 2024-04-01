//QB-98
//THIS IS COMMAND LINE ARGUMENT APPLICABLE CODE SO PASS COMMAND LINE ARGUMENT 


class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

class qb98 {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new NumberFormatException("Length should not be Zero Enter any element. ");
            } else if (Integer.parseInt(args[0]) + Integer.parseInt(args[1]) == 10) {
                throw new MyException("Addition of first two elements should not be 10 !!");
            } else {
                int ans = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
                System.out.println("Addition of first two elements is: " + ans);
                System.out.println("Command line argument executed..");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }
}

//   java qb98 5 5
