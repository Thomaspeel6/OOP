// Demonstration of string-to-enum conversion

import java.io.Console;

class StringToEnum {
  public static void main(String[] args) {
    // Obtain an uppercase day name from user

    Console console = System.console();
    String dayString = console.readLine("Enter a day: ").toUpperCase();

    // Convert to an enum

    Day day = Day.valueOf(dayString);

    System.out.printf("You entered %s, ", day.name());
    System.out.printf("which is day %d of the week\n", day.ordinal() + 1);
  }
}
