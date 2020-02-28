public class tile{
  private boolean[][] current;
  private boolean[][] next;
  private int rows;
  private int cols;

  public tile(int r, int c){
    rows = r;
    cols = c;
    current = new boolean[rows][cols];
    next = new boolean[rows][cols];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        next[i][j] = random(0, 1) < .5; //fills w/ true or flase - see if its less than half (true), then true gets stored - array is a boolean
        //random generation of true or false
      }
    }
    current = next; //overwriting last gen, need to make new array each time; which is why there is 2 arrays in the first place
  }
  public void show(){
    for(int i = 0; i < current.length; i++){
      for(int j = 0; j < current[i].length; j++){
        if(current[i][j] == true) fill(0,0,255);
        else if(current[i][j] != true){
          fill(0,0, 0);
        }
      }
    }
  }

  public void copyToNextGen(){
    for(int i = 0; i < current.length; i++){
      for(int j = 0; j < current[i].length; j++){
        current[i][j] = next[i][j];
      }
    }
  }

  public void generate(){
    for(int i = 0; i < current.length; i++){
      for(int j = 0; j < current[i].length; j++){
        int num = 1; //getLivingNeighbors(i, j);
        if(current[i][j]){
          if(num < 2){
            next[i][j] = false;
          }
          else if(num > 3){
            next[i][j] = false;
          }
          else if(num== 3){
            next[i][j] = true;
          }
          else{
            next[i][j] = false;
          }
        }
      }
    }
    copyToNextGen();
  }
/*
  public int getLivingNeighbors(int x, int y){
    
  }
  */
}
