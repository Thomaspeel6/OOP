// Simple enum example

enum Day {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
  FRIDAY, SATURDAY, SUNDAY;

  @Override
  public String toString() {
    return name().substring(0, 1) + name().substring(1).toLowerCase();
  }
}
