public class Point {
  private double x;
  private double y;

  public Point(double a, double b) {
    x = a;
    y = b;
  }

  public void setX(double a) {
    x = a;
  }

  public void setY(double b) {
    y = b;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public String toString() {
    return "(" + x + " , " + y + ")";
  }
}
