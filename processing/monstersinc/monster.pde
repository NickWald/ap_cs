public class monster{
  protected int x, y;
  protected PImage pic;
  protected int vx, vy;

  public monster(int loc_x, int loc_y){
    x  = loc_x;
    y = loc_y;
    vx = vy = 0;
    if(random(0,1)<0.5)
    pic = loadImage("cookie.jpg");
    else pic loadImage("dog.jpg")
  }
  //these methods belong to the superclass monster
  public void show(){
    image(pic, x, y, pic.width, pic.height);
  }
  public void move(){
    x += vx;
    y += vy;
  }
  //default sound for a monster:
  public void emitSound(){
    println("Growl");
  }
}
