
import java.util.*;

/**
 * The purpose of this class is to represent a standard deck of 52 playing
 * cards, without jokers.
 *
 * @author Mr. March-Steinman
 * @version 1.0
 */
public class Deck {

  /**
   * This ArrayList represents the main deck of cards
   */
  private ArrayList<Card> cards;

  /**
   * This ArrayList represents the discard pile.
   */
  private ArrayList<Card> discard;
  private ArrayList<Card> drawn;

  /**
   * This constructor creates a deck in "New Deck" order, from Ace of Clubs to
   * King of Spades.
   * <img src="https://www.topendsports.com/biomechanics/images/path.gif" alt=
   * "Girl in a jacket">
   */
  Deck() {
    cards = new ArrayList<Card>();
    discard = new ArrayList<Card>();
    drawn = new ArrayList<Card>();
    for (int s = 0; s < 4; s++) { // make 1 suit
      for (int r = 0; r < 13; r++) { // make all cards for one suit
        cards.add(new Card(s, r)); // re run loop
      }
    }
  }

  /**
   * Draws a card from the front of the Deck List. If there are no cards in the
   * deck, re-shuffle from the discard pile.
   *
   * @return a card from the top of the deck.
   */
  public Card drawCard() {
    Card c = new Card();
    try {
      c = cards.remove(0);
      drawn.add(c);
      return c;
    } catch (Exception e) {
      System.out.println("The deck reached 0!");
      System.out.println("Reshuffling from discard");
      while (discard.size() >= 1) {
        cards.add(discard.remove(0));
      }
      shuffleDeck();
      return drawCard();
    }
  }

  /**
   * Shuffles the deck, using Collections.shuffle. Will shuffle a random number of
   * times, from 1-52 to increase final randomness.
   */
  public void shuffleDeck() {
    Random rand = new Random();
    int i = rand.nextInt(52) + 1;
    for (int j = 0; j < i; j++) {
      Collections.shuffle(cards);
    }
  }

  /**
   * @return how many cards are remaining in the deck.
   */
  public int getCardsRemaining() {
    return cards.size();
  }

  /**
   * @param c a card to remove from the deck and drawn piles, to be placed in the
   *          discard pile.
   */
  public void disCard(Card c) {
    discard.add(c);
    drawn.remove(c);
    cards.remove(c);
  }
}
