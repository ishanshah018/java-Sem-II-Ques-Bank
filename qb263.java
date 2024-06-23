/*   QB-263:
Write a program that simulates a queue of customers at a coffee shop using an ArrayDeque. 
The program should allow the user to perform the following actions:
Add a new customer to the back of the queue
Serve the next customer in the queue (i.e. remove the customer from the front of the 
queue) View the current queue of customers
The program should continue to prompt the user for actions until they choose to quit.
  */


import java.util.*;

class CoffeeShop {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println(
                    "ENTER YOUR CHOICE\n 1)ADD NEW CUSTOMER: \n 2)SERVE NEXT CUSTOMER \n 3) VIEW CURRENT QUEUE \n 4)QUIT");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Customer Name: ");
                    String name = sc.nextLine();
                    queue.addLast(name);

                    System.out.println(name + ": has been added to the queue.");
                    break;

                case 2:
                    if (!queue.isEmpty()) {
                        String served = queue.pollFirst();
                        System.out.println("Now Serving: " + served);
                    } else {
                        System.out.println("Queue is Empty. No Customer to serve");
                    }
                    break;

                case 3:
                    if (!queue.isEmpty()) {
                        Iterator itr = queue.iterator();
                        while (itr.hasNext()) {
                            System.out.println(itr.next());
                        }
                    } else {
                        System.out.println("Queue is Empty.. No Customers");
                    }

                case 4:
                    System.out.println("Exiting !! COFFEE SHOP QUEUE SIMULATION..");
                    break;

                default:
                    System.out.println("INVALID CHOICE !!");
                    break;
            }
        } while (choice != 4);

    }
}
