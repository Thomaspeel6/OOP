// Example of using Scanner to parse standard input

import java.util.Scanner;

class Input {
  public static void main(String[] args) {
    boolean anotherRound = true;
    while (anotherRound) {
      
    
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Another round? (y/n): ");
    String response = scanner.nextLine().toLowerCase();
    if (response.equals("n")) {
        anotherRound = false;
    }
  }
  }
}
