public class ComplexTest {
  public static void main(String[] args) {
    Complex aidan = new Complex(2, 3);
    System.out.println(aidan);
    System.out.println("real = " + aidan.getReal());
    System.out.println("imaginary = " + aidan.getImaginary());

    System.out.println("- - - - - - - - ");

    Complex nick = new Complex(3, 9);
    System.out.println(nick);
    System.out.println("real = " + nick.getReal());
    System.out.println("imaginary = " + nick.getImaginary());
  }
}
