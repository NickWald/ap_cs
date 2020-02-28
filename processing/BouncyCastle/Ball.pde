public class Ball{
  private float radius;
  private float rate = random(0, 0.9);
  private float x;
  private float y;
  private float vx, vy; //velocity in x and y
  private float a; //acceleration in the y
  private float red;
  private float green;
  private float blue;
  
  
  public Ball(float r){
    radius = r;
    x = random(radius, width-radius);
    y = random(radius, height-radius);
    vx = 5;
    vy = 0;
    a = random(0, 3);
  }
  public void show(){
    red = random(150, 250);
    green = random(200, 255);
    blue = random(250, 255);
    fill(red, green, blue);
    ellipse(x, y, radius*2, radius*2);
  }
  public void move(){
    x += vx;
    y += vy;
    vy += a;
    if (x > width || x < 0) vx = -vx*.95; //immediately switch numbers to push them other way
    if (y > height || y < 0) vy = -vy*.95; //every time you bounce, you lose energy to friciton (.95 resultts in 0.05 decrease in speed each time, like friciton)
  }
  
  public void grow(){
    radius += rate;
    if(radius < 0){
      rate =- rate;
    }
    
    if(x + radius > width || x-radius < 0){
      rate =- rate;
    }
    if(y + radius > height || y - radius < 0){
      rate =- rate;
    }
  }
  
}
