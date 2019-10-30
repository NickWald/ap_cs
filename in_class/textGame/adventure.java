public class adventure {
	public static void main(String[] args) {
    grid(10, 10, 3, 4); //(rows, columns, point's x, point's  y) (FROM UPPER LEFTT CORNER)
	}

  public static void grid(int r, int c, int x, int y){
    for(int rows = 0; rows <= r; rows++){
      for(int columns = 0; columns <= c; columns++){
        if(rows == x && columns == y){
          System.out.print("O ");
        }
        else{
          System.out.print("X ");
        }
      }
    System.out.println();
    }
	}
}

//, int c, int x, int y
