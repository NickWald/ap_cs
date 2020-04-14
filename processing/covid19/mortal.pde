public class mortal{
  protected float vx, vy;
  protected float x, y;
  protected boolean dead;
  
  public mortal(){
    this.x = random(0, width);
    this.y = random(0, height - 300);
    this.vx = random(-5, 5);
    this.vy = random(-5, 5);
    this.dead = false;
    
    public void setVelocity(){
      this.vx = vx;
      this.vy = vy;
    }
    public void resetVelocity(){
      this.vx = random(-10, 4);
      this.vy = random(-10, 4);
    }
    public void move(){
      
    }
  }
}
