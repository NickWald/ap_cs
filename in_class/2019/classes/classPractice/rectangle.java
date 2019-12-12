public class rectangle{
  //fields
  private int width;
  private int length;

  //constructors
  public rectangle(int l, int w){ //l and w are vars for input values from user
    width = Math.abs(w);
    length = Math.abs(l);
  }

  //methods
  public int getArea(){
    return length*width;
  }
  public int getPerimeter(){
  return 2*length+2*width;
  }
  public boolean isSquare(){
    return length==width;
  }
}
