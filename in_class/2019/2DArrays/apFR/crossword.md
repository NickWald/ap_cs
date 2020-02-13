# Crossword FR

<div style="font-size: 20px; color: gray;">2016 Free Response</div>

**Part A: toBeLabeled method**

```java
private boolean toBeLabeled(int r, int c, boolean[][] blackSquares){
  if(blackSquares[r][c]){
    return false;
  }
  if(r == 0 || blackSquares[r - 1][c]){
    return true;
  }
  if(c == 0 || blackSquares[r][c - 1]){
    return true;
  }
  return false;
}
```

**Part B: CrossWord constructor**

```java
public Crossword(boolean[][] blackSquares){
  puzzle = new Square[blackSquares.length][blackSquares[0].length];
  int num = 1;

  for(int r = 0; r < puzzle.length; r++){
    for(int c = 0; c < puzzle[0].length; c++){
      if(toBeLabeled(r, c, blackSquares)){
        puzzle[r][c] = new Square(false, num);
        num++;
      }
      else{
        puzzle[r][c] = new Square(blackSquares[r][c], 0);
      }
    }
  }
}
```
