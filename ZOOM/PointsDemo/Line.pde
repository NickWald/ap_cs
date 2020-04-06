public class Line{
  private Point a, b;
  public Line(Point p1, Point p2){
    a = p1;
    b = p2;
  }
  public Line(int x1, int y1, int x2, int y2){
    a = new Point(x1, y1);
    b = new Point(x2, y2);
  }
  public void show(){
    fill(255);
    stroke(255);
    strokeWeight(2);
    line(a.getX(), a.getY(), b.getX(), b.getY());
  }
}
