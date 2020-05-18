//get change from a purchase

import java.util.Scanner;

public static void main(String[] args) {
    double subtotal;
    double cashGiven;

    Scanner s = new Scanner(System.in);
    System.out.print("Please enter order subtotal ($):  ");
    subtotal = s.nextDouble();

    System.out.print("Please enter cash given ($):  ");
    cashGiven = s.nextDouble();

    System.out.println("Your change shoud be ($): " + (cashGiven - subtotal));
}
