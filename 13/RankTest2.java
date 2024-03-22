// Test program for the Rank enum defined inside Card

class RankTest2 {
  public static void main(String[] args) {
    for (Card.Rank r: Card.Rank.values()) {
      System.out.printf("%c = %s\n", r.getSymbol(), r);
    }
  }
}
