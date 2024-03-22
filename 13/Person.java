// Small class to represent a Person

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;

public class Person {
  private String givenName;
  private String familyName;
  private LocalDate dateOfBirth;

  public Person(String given, String family, LocalDate birth) {
    givenName = given;
    familyName = family;
    dateOfBirth = birth;
  }

  public String getGivenName() {
    return givenName;
  }

  public String getFamilyName() {
    return familyName;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public String initials() {
    return givenName.substring(0, 1) + familyName.substring(0, 1);
  }

  public int age() {
    LocalDate today = LocalDate.now();
    return (int) YEARS.between(dateOfBirth, today);
  }

  public boolean isBirthday() {
    LocalDate today = LocalDate.now();
    return today.getMonth() == dateOfBirth.getMonth()
        && today.getDayOfMonth() == dateOfBirth.getDayOfMonth();
  }

  @Override
  public String toString() {
    return givenName + " " + familyName;
  }
}
