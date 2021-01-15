import java.util.Scanner;

/**
 * Nick Wald 9/17/19 Purpose: Making a primitive MadLibs
 */
public class madLibs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userName;

		System.out.print("Enter your first name: ");
		String name = input.nextLine();

		System.out.print("Enter your last name: ");
		String lastName = input.nextLine();

		System.out.print("Enter a friend's name: ");
		String friendName = input.nextLine();

		System.out.println("Enter a verb (ending in -ing): ");
		String verb = input.nextLine();

		System.out.print("Enter a street name: ");
		String streetName = input.nextLine();

		System.out.print("Enter another (different) street name: ");
		String streetName2 = input.nextLine();

		System.out.print("Enter a police officer's name (Officer ...): ");
		String officerName = input.nextLine();

		System.out.print("Enter a prison sentence (e.g. Double life sentence, etc...): ");
		String prisonSentence = input.nextLine();

		// changes to strings:
		lastName = lastName.substring(1, 3);
		userName = name.concat(lastName);
		userName = userName.toLowerCase();
		friendName = friendName.replaceAll("a", "e"); // changes any A's to E's
		friendName = friendName.replaceAll("e", "i"); // changes any E's to I's
		friendName = friendName.replaceAll("i", "o"); // changes any I's to O's
		friendName = friendName.replaceAll("o", "u"); // changes any O's to U's

		if (verb.contains("ing")) { // if verb doesnt contain "ing", add it to the end of input for verb
			System.out.println(verb);
		} else {
			verb = verb + "ing";
		}

		// output:
		System.out.println("One day, " + name + ", who's username has been set to " + userName + ", was " + verb + " down "
				+ streetName + " when he ran into " + friendName + ". He shot him in the face.");
		System.out.println("");
		System.out.println("The reason for this sudden agression was unknown, but it was clear that " + userName
				+ " was now on the run. He made his way down " + streetName2
				+ " as quickly as he could, and instantly ran into officer " + officerName
				+ ". Now in handcuffs with fingers stained blood-red, " + userName + " knew it was all over.");
		System.out.println("");
		System.out.println("Some time later, " + userName
				+ "'s time for a trial had come, and he was found guilty -  sentenced to " + prisonSentence);
		System.out.println("");
		System.out.println("THE END.");

	}
}
