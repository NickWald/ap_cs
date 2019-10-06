public class methodPractice {
	public static void main(String[] args) {
		//when I use a method, I CALL it. By its name.
    doNothing();
    doNothing();
    doNothing();
      //called the method 3 times (used)

    give3();
    int x = give3();
    System.out.println(give3());

    System.out.println(calcSphereVolume(50.0));
	}
  public static void doNothing(){

  }

  public static int give3(){ //<—— method header
    return 3; //<—— body, "return" does not simply output 3. turns give3 into 3, stored in x
  }

  public static double calcSphereVolume(double radius){ //public method with return type double, it is called calcSphereVolume
    //double goes in, double comes out
    return 4.0/3 * Math.PI * Math.pow(radius, 3);
  }
}
