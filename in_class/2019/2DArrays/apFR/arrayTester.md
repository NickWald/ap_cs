# ArrayTester FR<div style="font-size: 20px; color: gray;">2018 Free Response</div>

**Part A: getColumn method**

```java
public static int[] getColumn(int[][] arr2D, int c){
  int[] column = new int[arr2D.length];

  for(int i = 0; i < column.length; i++){
    column[i] = arr2D[i][c];
  }
  return column;
}
```

**Part B:  isLatin method**

```java
public static boolean isLatin(int[][] square){
  if(containsDuplicates(square[0])){
    return false;
  }
  for(int r = 1; r < square.length; r++){
    if(!hasAllValues(square[0], square[r])){
      return false;
    }
  }
  for(int c = 0; c < square[0].length; c++){
    if( ! hasAllValues(square[0], getColumn(square, c))){
      return false;
    }
  }
  return true;
}
```
