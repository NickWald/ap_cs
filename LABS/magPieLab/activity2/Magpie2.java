/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "tell me more about your family.";
		}

		//pets
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0)
		{
			response = "Tell me more about your pets.";
		}

		//MS
		else if (statement.indexOf("Mr.") >= 0
				|| statement.indexOf("MS") >= 0
				|| statement.indexOf("mr.") >= 0
				|| statement.indexOf("ms") >= 0)
		{
			response = "He sounds like he knows what he's talking about.";
		}
		//more keywords
		else if (statement.indexOf("democrat") >= 0
				|| statement.indexOf("republican") >= 0)
		{
			response = "Tell me about your political views.";
		}

		//otherwise...
		else
		{
			response = getRandomResponse();
		}
		return response;
	}


	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		{
			response = "Now that's hot.";
		}
		{
			response = "That is fascinating, go on...";
		}
		return response;
	}
}
