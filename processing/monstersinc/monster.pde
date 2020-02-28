public class monster{
  protected int x, y;
  protected PImage pic;
  protected int vx, vy;

  public monster(int loc_x, int loc_y){
    x  = loc_x;
    y = loc_y;
    vx = vy = 0;
    pic = loadImage("dog.png");
  }
  public void show(){
    image(pic, x, y, pic.width, pic.height);
  }
}
