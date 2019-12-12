import java.util.Scanner;
/**
* Nick Wald
* 9/16/19
* Purpose: To generate some random numbers
*/
public class stringsPractice{
	public static void main(String[] args) {
		String sample; //set aside space for a string labeled with 'sample', default value is set to null for this string

    sample = "potatoes and " + "pasta and " + "dog biscuits. " + (3 + 5 + 7); //a string literal, becasue it is enclosed in ""
        //instantiation
        //instatiate and a string and store it in sample
				//string concatination is when you add (+) two strings
					//smushing strings together
    //sample = new String("potatoes and");
        //keword NEW = instantiation
        //NEW makes the object real, string class is definition, whatever is stored in string is instantiated
    //System.out.println(sample.toUpperCase().toLowerCase().length());

		//.contains("") <-- checks to see if string contains something else like a certain word. Allows for instant response
		//.subString() <-- chop strings up and add them together\\

		//System.out.println(sample.contains(pasta));

		System.out.println(sample.substring(1, 5)); //returns letters after the 1st to and including the 5th
	}
}
