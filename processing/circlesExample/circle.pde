//define the class in this file
public class circle{
  private int radius; //instance variable
  private int x; //instance variable
  private int y; //instance variable
  private int red, green, blue;

  public circle(int a, int b, int r){ //dont say x y and radius because that would overwrite them. PARAMETERS CAN NOT HAVE SAME NAME AS INSTANCE VALUE
    x = a;
    y = b;
    radius = r;
    red = (int) random(0, 255);
    green = (int) random(0, 255);
    blue = (int) random(0, 255);
  }

  public double getArea(){
    return radius*radius*Math.PI;
  }

  public void show(){
    fill(red, green, blue);
    ellipse(x, y, radius*2, radius*2);
  }

//GETTERS:
  public int getX(){
    return x;
  }

  public int getY(){
    return x;
  }

//movement
  public void moveY(int value){
    y+=value;
  }

  public void moveX(int value){
    x+=value;
  }

  public void move(){
    x++;
    y++;
    if(x > width) x = 0;
    if(y > height) y = 0;
  }
}
