import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Enter the sphere's radius: ");
    double r = s.nextDouble();

    double v = (4.0/3.0)*Mat.PI*(r*r*r);//Math.pow(r,3);
    System.out.println("Volume is: " + v);
	}
}
