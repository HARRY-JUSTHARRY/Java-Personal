/*
DATE: 2023-09-12
Note: put input for number of coins then calculate the total value of it.
Not school assignment, for practice only.
*/


//import a function
import java.util.Scanner;

public class coinCounterSecond{
    public static void main(String[] args){

        //reading from system.in
        Scanner reader = new Scanner(System.in); 

        //get input for number of toonies
        System.out.print("Enter the number of toonies: ");
        int toonies = reader.nextInt(); //scans the next token of the input as int.

        //get input for number of loonies
        System.out.print("Enter the number of loonies: ");
        int loonies = reader.nextInt();

        //get input for number of quarters
        System.out.print("Enter the number of quarters: ");
        int quarters = reader.nextInt();

        //get input for number of dimes
        System.out.print("Enter the number of dimes: ");
        int dimes = reader.nextInt();

        //get input for number of nickels
        System.out.print("Enter the number of nickels: ");
        int nickels = reader.nextInt();

        //close the reader(seems fine w/o it???)
        reader.close();

        //calculate total value of coins
        int totalCoinValue = (toonies*200 + loonies*100 + quarters*25 + dimes*10 + nickels*5);

        //print out all the results
        System.out.println("--------------------PRINT STARTS--------------------");
        System.out.println("Number of toonies: " + toonies);
        System.out.println("Number of loonies: " + loonies);
        System.out.println("Number of quarters: " + quarters);
        System.out.println("Number of dimes: " + dimes);
        System.out.println("Number of nickels: " + nickels);
        System.out.println("The total coin value is " + totalCoinValue + " cents.");

        //print this out to make sure the entire program runs ok.
        System.out.println("Coin Counter v1 completed successfully.");
        System.out.println("---------------------PRINT ENDS---------------------");

    }
}