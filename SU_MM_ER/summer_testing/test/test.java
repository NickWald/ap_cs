import java.util.Scanner; // import the Scanner class

class test {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String name;
    String age;
    String homeTown;
    String moveOn;

    // Enter name and press Enter
    System.out.println("* Please enter your first name:");
    //shows what name will do
    name = myObj.nextLine();
    //output:
    System.out.print("Welcome, " + name);

//begin next section

    System.out.println(". Let's begin with you.");
    System.out.println("I am going to ask you a few questions, then we will make a plan to meet again once your data has been assessed.");
    System.out.println("* Press enter to continue:");
    moveOn = myObj.nextLine();

//begin next section

    System.out.println("* Age:");
    age = myObj.nextLine();
    System.out.println("Got it, you're " + age);

    System.out.println("* Hometown:");
    homeTown = myObj.nextLine();
    System.out.println("Cool, you grew up in " + homeTown);

    System.out.println("We now have all the data we need and will contact you soon to set up a follow up appointment. This concludes the program. ");
    System.out.println("* Press enter to quit.");
    moveOn = myObj.nextLine();
  }
}
