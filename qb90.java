// // By using try..catch..finally

//class ex17 {
//     public static void main(String[] args) {
//         int s[] = { 1, 2, 3 };

//         try {
//             System.out.println(s[5]);
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Not Found");
//         } finally {
//             System.out.println("This is finally block..");
//         }

//     }
// }

//By using throw 

class ex17 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };
        int index = 5;

        try {
            if (index >= numbers.length) {
                throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds for the array");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is finally block");
        }
    }
}
