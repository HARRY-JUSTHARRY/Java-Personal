
/*
 * Palindrome 
 * Example: mom, hannah... 
 */

 import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        //get String
        System.out.print("Enter String: ");
        String orig = scnr.nextLine().toLowerCase();

        //creating a new String with reveres characters
        String reverse = "";
        for (int i = orig.length() - 1; i >= 0; i--) {
            reverse += orig.charAt(i);
        }

        //compare each char
        boolean palindrome = true;
        for (int i = 0; i < orig.length(); i++) {
            if (orig.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }

        //print
        if (palindrome == true) {
            System.out.println(orig + " is palindrome!");
        }
        else {
            System.out.println(orig + " is not palindrome!");
        }

    }//main ends

}//for class