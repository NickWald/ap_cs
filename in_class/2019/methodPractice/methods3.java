public class methods3 {
	public static void main(String[] args) { //this is where the methods are run, printed (MAIN METHOD <b> MUST </b> BE STATIC)
    print("Hello World!"); //call the method print
    print(5); //print(5) wouldnt work without method#2 becuase #1 is asking for a string instead of an int
    double d = 5.0; //5.0 is assigned to double d in #3, and it carries out the rest of the program
    print(d);
    print(d+""); //d+"" is 5.0 becuase it is not the same as d (which equals 10)
	}
  public static void print(String s){ //(String s) = formal parameters //#1
    System.out.print(s);
  }
  public static void print(int x){ //#2
    System.out.println(x);
  }
  public static void print(double d){ //#3
    d += 5;
    System.out.println(d);
  }
  public static void print(Object o){ //#3
    System.out.println(o.toString());
  }

}
