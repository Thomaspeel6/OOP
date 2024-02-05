
package Excerices;
import java.util.Scanner;

public class CheckPassword {
    public static boolean longEnough(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }
  
    public static boolean atLeastTwoDigits(String password) {
        if (password.matches(".*\\d{2,}.*")) {
            return true;
        } else {
            return false;
        }
    }
  
    public static void main(String[] args) {
        
        /*System.out.println("Enter the password: ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine(); */
        /*if (args.length < 3) {
            System.err.println("Usage: java CheckPassword <password>");
            System.exit(1);
        }
*/      
        if (args.length < 1) {
            System.err.println("Usage: java CheckPassword <password>");
            System.exit(1);
        }
        String password = args[0];

        
        
        if (longEnough(password) && atLeastTwoDigits(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
        
    
    }
  }