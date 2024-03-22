// Test program for the Suit enum defined inside Card

class SuitTest {
  public static void main(String[] args) {
    for (Card.Suit s: Card.Suit.values()) {
      System.out.printf("%c = %s\n", s.getSymbol(), s);
    }
  }
}
