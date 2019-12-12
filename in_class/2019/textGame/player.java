public class player{
  //fields
  private int x;
  private int y;
  private Sring name;
  private Sring symbol;

  //constructors
	public player(String n, String s) {
    x = 0;
    y = 0;
    name = n;
    symbol = s;
	}

  //methods
  public void move(int horiz, int vert){
    x+=horiz;
    y+=vert;
  }
  public Sring toString(){
    return name + " is at (" + x + ", " + y + ").";

  }
}
