public class Ball{
  private float radius;
  private float x;
  private float y;
  private int vx, vy; //velocity in x and y
  private int a; //acceleration in the y
  
  public Ball(float r){
    radius = r;
    x=random(radius, width-radius);
    y=random(radius, height-radius);
    vx=5;
    vy=0;
    a=0;
  }
  public void show(){
    fill(240,0,0);
    ellipse(x, y, radius*2, radius*2);
  }
  public void move(){
    x+=vx;
    y+=vy;
  }
}
