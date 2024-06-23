/*  QB-265
Make the system as User interactive and give choices to user. 
Web browser history: Write a program that simulates a web browser history using an 
ArrayDeque. The program should allow the user to navigate back and forward through their 
history of visited web pages, similar to how a web browser works. The program should keep 
track of the URLs of visited web pages using an ArrayDeque, where each element in the 
deque represents a visited web page. When the user navigates to a new web page, you can 
push the URL onto the deque. When the user navigates back or forward, you can pop URLs 
off the front or back of the deque, respectively.
*/


import java.util.*;

class WebBrowser {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<String>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Enter your Choice");
            System.out.println(
                    "1)Visit a New WebPage. \n 2)Navigate Forward \n 3)Navigate Back \n 4)Display Search History \n 5)Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter URL: \\");
                    String url = sc.nextLine();

                    ad.add(url);
                    System.out.println("Navigated to:" + url);
                    break;

                case 2:
                    if (!ad.isEmpty()) {
                        String Forward = ad.pollFirst();
                        System.out.println("Navigating Forward to: " + Forward);
                        ad.addLast(Forward);
                    } else {
                        System.out.println("No History to Navigate Forward ");
                    }
                    break;

                case 3:
                    if (!ad.isEmpty()) {
                        String Back = ad.pollLast();
                        System.out.println("Navigating Back to: " + Back);
                        ad.addFirst(Back);
                    } else {
                        System.out.println("No History to Navigate Back ");
                    }
                    break;

                case 4:
                    if (ad.isEmpty()) {
                        System.out.println("Web History is Empty");
                    } else {
                        System.out.println("Web Browser History: ");
                        int index = 1;
                        Iterator itr = ad.iterator();
                        while (itr.hasNext()) {
                            System.out.println(index++ + "." + itr.next());
                        }

                    }
                    break;

                case 5:
                    System.out.println("Exiting the WEB BROWSER..");
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (choice != 5);

    }
}
