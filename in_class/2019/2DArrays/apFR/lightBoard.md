# LightBoard FR<div style="font-size: 20px; color: gray;">2019 Free Response</div>

**Part A: LightBoard constructor**

```java
public LightBoard(int numRows, int numCols){
  lights = new boolean[numRows][numCols];

  for(int r = 0; r < lights.length; r++){
    for(int c = 0; c < lights[0].length; c++){
      if(Math.random() <= 0.4){
        lights[r][c] = true;
      }
    }
  }
}
```

**Part A: LightBoard constructor**

```java
public boolean evaluateLight(int row, int col)
{
  int onInColumn = 0;

  for(int r = 0; r < lights.length; r++){
    if(lights[r][col]){
      onInColumn++;
    }
  }

  if(lights[row][col]){
    if(onInColumn % 2 == 0){
      return false;
    }
  }
  else if(onInColumn % 3 == 0){
      return true;
    }

  return lights[row][col];
}
```
