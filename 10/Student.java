// Class to represent a student, inheriting from Person

import java.time.LocalDate;
import java.time.YearMonth;

import static java.time.temporal.ChronoUnit.YEARS;

public class Student extends Person {
  // Subclass inherits fields from Person, and only needs to
  // define the additional fields specific to students

  private String degree;
  private YearMonth start;

  // Constructor has parameters relating to inherited fields
  // as well as the fields added by Student

  public Student(String gname, String fname, LocalDate birth,
    String degree, YearMonth start) {

    super(gname, fname, birth);   // invoke superclass constructor

    // Have to call super, as above; the three lines below won't work,
    // because the fields are private to Person
    //givenName = gname;
    //familyName = fname;
    //dateOfBirth = birth;

    this.degree = degree;
    this.start = start;
  }

  // Don't need to reimplement inherited methods here, unless you
  // want to override them to change behaviour (see toString)

  public String getDegree() {
    return degree;
  }

  public YearMonth getStart() {
    return start;
  }

  public int yearOfStudy() {
    LocalDate today = LocalDate.now();
    return (int) YEARS.between(start, today) + 1;
  }

  @Override
  public String toString() {
    return String.format("%s, %s Year %d",
      super.toString(), getDegree(), yearOfStudy());
    //^^^^^^^^^^^^^^^^
    // Use string representation from superclass and
    // add some stuff to the end of it
  }
}
