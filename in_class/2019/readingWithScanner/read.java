import java.io.File;
import java.util.Scanner;

public class read {
  public static void main(String[] args) throws Exception {
    File file = new File("./genome.txt");
    // Pass the path to the file as a parameter
    Scanner sc = new Scanner(file);
    String information = "";
    int numLines = 0;
    while (numLines < 3) {
      information += sc.nextLine() + "\n"; // add .contains("ATGC") after nextLine() to check true or false if any of
                                           // top 3 lines contains ATGC
      numLines++;
    }
    int x = numG(information);
    System.out.println("The sample has " + x + " Guanines");
    System.out.println(information);
    sc.close();
  }

  public static int numG(String sample) {
    // write a loop to count the number of G's in the sample.
    // where do i start?, where do i end?, how do i get there?
    // use an if statement
    int counter = 0;
    int index = 0;

    /*
     * WHILE LOOP VERSION (will do the same thing): while (inde x<sample.length()){
     * if (sample.charAt(index) == 'G') counter++; index++; } return counter;
     */

    // FOR LOOP VERSION
    for (int i = 0; i < sample.length(); i++) {
      if (sample.charAt(i) == 'G') {
        counter++;
      }
    }
    return counter;

  }
}
