public class circle{
  //fields
  private double radius;

  //constructors
  public circle(double r, double c){
    radius = r;
  }

  //methods
  public double getCircumference(){
    return 2*Math.PI*radius;
  }
  public double getArea(){
    return (Math.PI)*(Math.pow(radius,2));
  }
}
