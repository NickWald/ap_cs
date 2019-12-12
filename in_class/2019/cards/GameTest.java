import java.util.*;

public class GameTest {
	public static void main(String[] args) {
		Card trickCard = new Card();
		Deck d = new Deck();
		Scanner s = new Scanner(System.in);
		d.shuffleDeck();

		System.out.println("Shuffling deck! \nPick a card from the top!");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		trickCard = d.drawCard();
		System.out.println("Look at your card, don't show me: " + trickCard.toString());
		System.out.println("Put your card back in the deck; I will shuffle!");
		try {
			Thread.sleep(5000); //basically pauses the whole thing for (ms)
		} catch (Exception e) { //gives back an exception; throws an exception. if not caught, it breaks
		}
		d.disCard(trickCard);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("I'll shuffle the deck and find your card!");
		d.shuffleDeck();
		try {
			Thread.sleep(10000);
		}
		catch (Exception e) {
		}
		System.out.println("Is this your card? " + trickCard.toString());
		if (s.nextLine().equalsIgnoreCase("no")) {
			System.out.println("You're a liar.  I know it's your card, because I cheated!");
		} else {
			System.out.println("I take donations in the hat.");
		}
	}
}
