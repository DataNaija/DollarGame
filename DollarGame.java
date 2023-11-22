package dollargame;

/*
Change for a dollar game
* Requirement:Ask the user to provide:
* Number of pennies, * Number of nickels, * Number of dimes, * Number of quarters
// Calculate and Print:
* Count total value of the coins, * Print message informing them if they won or lost
* If they lost, let them know by how much they were over or under $1
 */

import java.util.Scanner;

public class DollarGame {

    public static void main(String[] args){

        // Initialize know value
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1");

        double pennies = 0.0;
        System.out.println("Enter the number of pennies: ");
        pennies = scanner.nextDouble();

        double nickels = 0.0;
        System.out.println("Enter the number of nickels: ");
        nickels = scanner.nextDouble();

        double dimes = 0.0;
        System.out.println("Enter the number of dimes: ");
        dimes = scanner.nextDouble();

        double quarters = 0;
        System.out.println("Enter the number of quarters: ");
        quarters = scanner.nextDouble();

        scanner.close();

        double count = nickels + pennies + dimes + quarters;
        // System.out.println("The total count is: " + count);

        if(count == dollar){
            System.out.println("You've won the game");

        }else if(count < dollar){
            double IncremtDollar = dollar - count;
            System.out.println("Your are short by " +IncremtDollar);
        } else if(count > dollar){
            double IncremtCount = count - dollar;
            System.out.println("You are over by " +IncremtCount);
        }


    }
}
