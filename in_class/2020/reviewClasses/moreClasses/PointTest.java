public class PointTest {
  public static void main(String[] args) {
    Point p1 = new Point(3, 5);
    Point p2 = new Point(3, -3);
    Point p3 = new Point(-2, .2);

    System.out.println(p1.toString());
    p1.setX(-2);
    System.out.println(p1.toString());
  }
}
