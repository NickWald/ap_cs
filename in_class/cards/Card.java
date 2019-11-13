
/**
 * The purpose of this code is to represent a card in a standard playing-card
 * form.
 *
 * @author Mr. March-Steinman
 * @version 1.0
 */
public class Card {

  /**
   * represents the rank of a Card.
   */
  private int rank;

  /**
   * represents the suit of a Card.
   */
  private int suit;

  private String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
  private String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

  /**
   * Basic Card Constructor; No defined behavior yet.
   */
  Card() {
    rank = 5;
    suit = 0;
  }

  /**
   * This is the basic card constructor, which sets a suit and a rank for the
   * card.
   *
   * @param suit the suit of a card. 0: Clubs; 1: Diamonds; 2: Hearts; 3: Spades;
   * @param rank the rank of a card. 0: Ace; 1: Two; 2: Three; 3: Four; 4: Five;
   *             5: Six; 6: Seven; 7: Eight; 8: Nine; 9: Ten; 10: Jack; 11: Queen;
   *             12: King;
   */
  Card(int suit, int rank) {
    this.rank = rank;
    this.suit = suit;
  }

  /**
   * This function is used to access the rank variable.
   *
   * @return an integer representing rank.
   */
  public int getRank() {
    return rank;
  }

  /**
   * @return an integer representing suit.
   */
  public int getSuit() {
    return suit;
  }

  public String toString() {
    return ranks[rank] + " of " + suits[suit];
  }
}
