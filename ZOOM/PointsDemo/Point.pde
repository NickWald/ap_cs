public class Point {
  private int x;
  private int y;
  
  public Point (int x, int y){
    this.x = x;
    this.y = y;
  }
  public double calculateDistance(Point other){
    return Math.sqrt(
            Math.pow((this.x - other.x),2) + Math.pow((this.y - other.y),2)
            );
  }
  public String toString(){
    //to be implemented by you, return a String in the format (x,y)
    return "(" + x + "," + y + ")";
  }
  public void show(){
    stroke(0);
    strokeWeight(1);
    fill(255, 0, 200);
    ellipse(x, y, 10, 10);
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
 
}
