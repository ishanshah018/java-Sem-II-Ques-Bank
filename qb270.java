/*  QB-270
Write a program that reads in a list of stock prices for a company and stores them in a 
HashMap, where the key is the date and the value is the price. The program should then 
compute the average price for the entire period and output it to the user.
*/

import java.util.*;

class QB270 {
    public static void main(String[] args) {
        HashMap<String, Double> stockPrices = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Date in format(YYYY-MM-DD)");
            String date = sc.nextLine();

            System.out.println("Enter Stock price: ");
            Double price = sc.nextDouble();
            sc.nextLine();

            stockPrices.put(date, price);

            System.out.println("Do You want to Add Continue ?(YES/No)");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("No")) {
                break;
            }
        }

        // Calculate the average stock price for the entire period

        double total = 0.0;

        for (Double d : stockPrices.values()) {
            total = total + d;
        }
        double average = total / stockPrices.size();

        System.out.println("Average Stock Price for the entire period is: " + average);
    }
}
