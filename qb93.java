class qb93 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter atleast one Arguments");
        }
        try {

            for (String arg : args) {
                if (!Character.isUpperCase(arg.charAt(0))) {
                    throw new IllegalArgumentException("Invalid argument: " + arg);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
