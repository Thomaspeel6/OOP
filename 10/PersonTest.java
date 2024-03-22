// Test program for Person class

import java.time.LocalDate;

import static java.lang.System.out;

public class PersonTest {
  public static void main(String[] args) {

    // Create a Person

    LocalDate birthDate = LocalDate.of(1994, 2, 20);

    Person person = new Person("Nick", "Efford", birthDate);

    // Test methods of Person class

    out.printf("Given name    : %s\n", person.getGivenName());
    out.printf("Family name   : %s\n", person.getFamilyName());
    out.printf("Initials      : %s\n", person.initials());
    out.printf("Date of birth : %s\n", person.getDateOfBirth());
    out.printf("Age (years)   : %d\n", person.age());
    out.printf("Birthday?     : %s\n", person.isBirthday());

    // Test overridden toString method

    out.printf("As a string   : %s\n", person);
  }
}
