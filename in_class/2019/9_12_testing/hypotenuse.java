import java.util.Scanner;

public class sepTwelth_testing {
	public static void main(String[] args) {
    double a;
    double b;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter value for 'a': ");
    a = s.nextDouble();

    System.out.print("Enter value for 'b': ");
    b = s.nextDouble();

    System.out.println("The hypotenuse (c) is " + (Math.sqrt((a*a)+(b*b))));
	}
}
