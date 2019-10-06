import java.util.Scanner;
/**
* Nick Wald
* 9/13/19
* Purpose: To generate some random numbers
*/

public class SampleRandomGenerator {
	public static void main(String[] args) {
		int bennet = 10;
    int alexa = 0.2534;
    boolean achmed = false;
    achmed = bennet > alexa;

    double randomNum = Math.random()*6+1;

		Scanner input = new Scanner(System.in);
		double minVal = input.nextDouble();

		System.out.println(minVal);
		String s = input.nextLine();

		double randomVal = Math.random()+minVal;

    System.out.println("Strings and other words" + alexa + "-" + bennet);
	}
}
