// Example of using lambdas to display and sort a list of things

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSort {
  public static void main(String[] args) {

    // Create a list of Persons

    List<Person> people = new ArrayList<>();

    people.add(new Person("Nick", "Efford", LocalDate.of(1994, 2, 20)));
    people.add(new Person("Sarah", "Armstrong", LocalDate.of(1987, 10, 3)));
    people.add(new Person("Judith", "Thompson", LocalDate.of(2003, 7, 9)));
    people.add(new Person("Michael", "Jones", LocalDate.of(1999, 5, 13)));

    // Display list using a lambda

    System.out.println("Original list:");
    people.forEach(name -> System.out.println(name));
  
    // Note: can simplify this to
    //people.forEach(System.out::println);

    // Sort by family name using a comparator lambda

    Collections.sort(people, (p1, p2) -> p1.getFamilyName().compareTo(p2.getFamilyName()));

    // Display list again
  
    System.out.println("\nSorted list:");
    people.forEach(name -> System.out.println(name));
  }
}
