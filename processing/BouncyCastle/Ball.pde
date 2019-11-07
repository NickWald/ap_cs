public class Ball{
  private float radius;
  private float x;
  private float y;
  private float vx, vy; //velocity in x and y
  private float a; //acceleration in the y
  
  public Ball(float r){
    radius = r;
    x = random(radius, width-radius);
    y = random(radius, height-radius);
    vx = 5;
    vy = 0;
    a = random(0, 3);
  }
  public void show(){
    fill(240, 0, 0);
    ellipse(x, y, radius*2, radius*2);
  }
  public void move(){
    x += vx;
    y += vy;
    vy += a;
    if (x > width || x < 0) vx = -vx*.95; //immediately switch numbers to push them other way
    if (y > height || y < 0) vy = -vy*.95; //every time you bounce, you lose energy to friciton (.95 resultts in 0.05 decrease in speed each time, like friciton)
  }
}
