// More complex enum example, demonstrating fields & methods

enum Rank {
  ACE('A'), TWO('2'), THREE('3'), FOUR('4'),
  FIVE('5'), SIX('6'), SEVEN('7'), EIGHT('8'),
  NINE('9'), TEN('T'), JACK('J'), QUEEN('Q'),
  KING('K');

  private char symbol;

  private Rank(char s) { symbol = s; }

  public char getSymbol() { return symbol; }

  @Override
  public String toString() {
    return name().substring(0, 1) + name().substring(1).toLowerCase();
  }
}
