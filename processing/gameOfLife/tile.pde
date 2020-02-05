public class tile{
  private boolean[][] current;
  private boolean[][] next;
  private int rows;
  private int columns;

  public tile(int row, int c){
    rows = r;
    columns = c;
    current = new boolean[rows][colums];
    next = new boolean[rows][colums];
    for(int i = 0; i < r; i++){
      for(int j; j < c; j++){
        next[i][j] = random(0, 1) < .5; //fills w/ true or flase - see if its less than half (true), then true gets stored - array is a boolean
        //random generation of true or false
      }
    }
    current = next; //overwriting last gen, need to make new array each time; which is why there is 2 arrays in the first place
  }
  public void show(){
    for(int i = 0; i < current.length; i++){
      for(int j = 0; j < current[i]; j++)
    }
  }

  public void generate(){
    for(int i = 0; i < current.length; i++){
      for(int j = 0; j < current[i]; j++){
        int num = getLivingNeighbors(i, j);
        if(current[i][j] = false){
          if(num < 2)
        }
      }
    }
  }

  public int getLivingNeighbors(int x)
}
