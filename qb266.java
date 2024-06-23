/*  QB-266:
In my restaurant I used to manage it well as per the order. I never want to skip any order 
from the customer. So I prepare a rule: When I get the order I add it in the last of my cook 
queue. And when the order is ready I used to pick it up from the first of the cook queue. 
So, write a java program with class Restaurant. Create a queue cook which contains item 
names. Ask user weather he wants to Order or take food. If user press 1 then ask for the 
name of the item and it should be added in the cook queue. 
If user press 2 then The first item from the queue should be removed from the queue. 
If user press 3 then he can see the items of the queue. If user press 4 then he should move 
out from the Restaurant
*/




import java.util.*;

class Restaurant {
    public static void main(String[] args) {
        ArrayDeque<String> cook = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter Your Choice: ");
            System.out.println("1) To Order Food \n 2) To TakeAway Food \n 3) Display Your Ordered Items. \n 4) Exit ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Food Name you want to order : ");
                    String fname = sc.nextLine();
                    cook.addLast(fname);
                    System.out.println("Ordered Succesfully: " + fname);
                    System.out.println("Preparing your: " + fname);
                    break;

                case 2:
                    if (!cook.isEmpty()) {
                        String food = cook.pollFirst();
                        System.out.println("Your " + food + " is Prepared.");
                        System.out.println("TakeAway Successfully !!");
                    } else {
                        System.out.println("You have not Ordered Anything..");
                    }
                    break;

                case 3:
                    if (cook.isEmpty()) {
                        System.out.println("Order List is Empty..");
                    } else {
                        System.out.println("...Your Order List.. in Queue");
                        int Number = 1;

                        for (String ss : cook) {
                            System.out.println(Number++ + "." + ss);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank You For Choosing our Restaurant");
                    break;

                default:
                    System.out.println("Invalid Choice !!");
                    break;
            }
        } while (choice != 4);
    }
}
