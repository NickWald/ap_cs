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

/*
Nick Wald
Due 10/11/19 at 11:45pm
AP CS
*/

public class Magpie2
{
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting(){
		return "Lets chat, say anything!";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement){
		String response = "";
		int trimmedChars = statement.trim().length();

		//if statements (responses)
		if (statement.indexOf("no") >= 0 || (statement.indexOf("No")) >= 0)  {
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "tell me more about your family.";
		}

		//pets
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0) {
			response = "Tell me more about your pets.";
		}

		//trim for empty inputs
		else if (trimmedChars == 0) {
			response = "Please type something I am so alone and desperately need soemoene to talk to.";
		}

		//Mr. MS
		else if (statement.indexOf("Mr.") >= 0
				|| statement.indexOf("MS") >= 0
				|| statement.indexOf("mr.") >= 0
				|| statement.indexOf("ms") >= 0) {
			response = "He sounds like he knows what he's talking about.";
		}

		//more keywords
		//classes
		else if (statement.indexOf("school") >= 0
				|| statement.indexOf("class") >= 0
				|| statement.indexOf("grade") >= 0) {
			response = "Tell me about your classes.";
		}
		//interests
		else if (statement.indexOf("java") >= 0
				|| statement.indexOf("computer science") >= 0
				|| statement.indexOf("coding") >= 0) {
			response = "You must be interested in computer science.";
		}

		//otherwise...
		else {
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
		final int NUMBER_OF_RESPONSES = 6 ;
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
		else if (whichResponse == 4)
		{
			response = "Now that's hot.";
		}
		else if (whichResponse == 5){
			response = "That is fascinating, go on...";
		}
		return response;
	}
}
