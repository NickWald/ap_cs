public class methods2 {
  public static void main(String [] args) { //return product of 2 ints
      System.out.println(manhattanDistance(5, 10, 7, 6));
      System.out.println(oranges(5, 5, 5));

  }
  public static int manhattanDistance(int x1, int x2, int y1, int y2) { //return product of 2 ints
      return (y2-y1)+(x2-x1);
  }
  public static double oranges(double l, double w, double h) { //return product of 2 ints
      double boxArea = l*w*h;
      double orangeR = 1.25; //radius of oranges (inches)
      double orangeArea = Math.PI*(orangeR*orangeR);
      return boxArea/orangeArea; hwehwioHEROIqhewriuwehriuoHW
  }
}
