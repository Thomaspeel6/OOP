// Test program for Student class

import java.time.LocalDate;
import java.time.YearMonth;

import static java.lang.System.out;

public class StudentTest {
  public static void main(String[] args) {

    // Create a Student

    LocalDate birthDate = LocalDate.of(2001, 4, 15);
    YearMonth start = YearMonth.of(2020, 9);

    Student student = new Student(
      "Sarah", "Davies", birthDate, "Computer Science", start);

    // Test inherited methods

    out.printf("Given name    : %s\n", student.getGivenName());
    out.printf("Family name   : %s\n", student.getFamilyName());
    out.printf("Initials      : %s\n", student.initials());
    out.printf("Date of birth : %s\n", student.getDateOfBirth());
    out.printf("Age (years)   : %d\n", student.age());
    out.printf("Birthday?     : %s\n", student.isBirthday());

    // Test other methods added in Student

    out.printf("Degree        : %s\n", student.getDegree());
    out.printf("Started       : %s\n", student.getStart());
    out.printf("Year of study : %d\n", student.yearOfStudy());

    // Test overridden toString method

    out.printf("As a string   : %s\n", student);
  }
}
