// Test program for Day enum, demonstrating enum features

import java.util.Arrays;

import static java.lang.System.out;

class DayTest {
  public static void main(String[] args) {

    Day d1 = Day.THURSDAY;
    Day d2 = Day.FRIDAY;

    out.println();
    out.println("d1 name: " + d1.name());
    out.println("d2 name: " + d2.name());

    out.println();
    out.println("d1 ordinal: " + d1.ordinal());
    out.println("d2 ordinal: " + d2.ordinal());

    out.println();
    out.println("d1.equals(d1): " + d1.equals(d1));
    out.println("d1.equals(d2): " + d1.equals(d2));

    out.println();
    out.println("d1.compareTo(d1): " + d1.compareTo(d1));
    out.println("d1.compareTo(d2): " + d1.compareTo(d2));

    // But we can't do this:
    //   if (d1 < d2) {
    //     ...
    //   }

    out.println("\nValues as an array:");
    out.println(Arrays.toString(Day.values()));
  }
}
