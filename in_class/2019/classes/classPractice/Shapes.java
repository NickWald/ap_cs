public class Shapes{
  public static void main(String[] args){
    rectangle r1 = new rectangle(2,3);
    System.out.println(r1.getArea());
    System.out.println(r1.getPerimeter());
    System.out.println(r1.isSquare());

    circle c1  = new circle(1,5);
    System.out.println(c1.getArea());
    System.out.println(c1.getCircumference());

  }
}
