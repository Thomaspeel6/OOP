/**
 * Class representing exceptions relating to card games.
 *
 * @author Nick Efford
 */
public class CardException extends RuntimeException {
  /**
   * Create a CardException with the given message.
   *
   * @param message Error message associated with this exception
   */
  public CardException(String message) {
    super(message);
  }
}
