//QB-101

class exec {
    public static void main(String[] args) {
        int sum = 0;
        if (args.length == 0) {
            throw new NumberFormatException("Enter any number in COMMAND-LINE !!!");
        }

        for (int i = 0; i < args.length; i++) {
            try {
                int num = Integer.parseInt(args[i]);

                if (num < 0) {
                    throw new IllegalArgumentException("Number should not be negative !!");
                }
                if (num % 10 == 0) {
                    throw new Exception(" Divisible by 10");
                }
                if (num > 1000 && num < 2000) {
                    throw new Exception("Number is between 1000-2000");
                }
                if (num > 7000) {
                    throw new Exception("Number is more than 7000");
                }
                sum += num;
            }

            catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage() + " - Skipping number " + args[i]);
            }
        }
        System.out.println("Total sum is:" + sum);
    }

}
