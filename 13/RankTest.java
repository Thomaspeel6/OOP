// Test program for Rank enum

class RankTest {
  public static void main(String[] args) {
    for (Rank r: Rank.values()) {
      System.out.printf("%c = %s\n", r.getSymbol(), r);
    }
  }
}
