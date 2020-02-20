# **2D Array Intro**
**12/12/19**
**Nick Wald**

--------------------------------------------------------------------------------

Array with arrays inside, written as [][]

```java
[4][6] 4 rows, 6 columns

//standard format:
int [][] grid = new int[r][c]

//to print 8 by 5 grid use:
int [][] grid = new int[8][5];
//size 8 array, where each slot in the array has an array of length 5
```

Here is what is made:

┏ | 0 | 1 | 2 | 3 | 4
- | - | - | - | - | -
0 |   |   |   |   |
1 |   |   |   |   |
2 |   |   |   |   |
3 |   |   |   |   |
4 |   |   |   |   |
5 |   |   |   |   |
6 |   |   |   |   |
7 |   |   |   |

to make this:

┏ | 0 | 1 | 2 | 3 | 4
- | - | - | - | - | -
0 |   |   |   |   |
1 |   |   |   |   |
2 |   |   |   |   |
3 |   |   |   |   |
4 |   |   |   |   |
5 |   |   |   | x |
6 |   |   |   |   |
7 |   |   |   |

```java
//use
grid [4][3] = 6
```

```java
int [][] grid = new int[r][c];

for (int r = 0; r < grid.length; r++) {
  for (int c = 0; c < grid[r].length; c++) {
    grid[r][c] = 7;
  }
}
```

becomes this:

  | 0 | 1 | 2 | 3 | 4
- | - | - | - | - | -
0 | 7 | 7 | 7 | 7 | 7
1 | 7 | 7 | 7 | 7 | 7
2 | 7 | 7 | 7 | 7 | 7
3 | 7 | 7 | 7 | 7 | 7
4 | 7 | 7 | 7 | 7 | 7
5 | 7 | 7 | 7 | 7 | 7
6 | 7 | 7 | 7 | 7 | 7
7 | 7 | 7 | 7 | 7 | 7

(FILLS HORIZONTALLY)

--------------------------------------------------------------------------------

```java
int[][] arr = {{5, 2, 4}, {2, 1}, {6, 8, 9, 12}};
```

5 | 2 | 4
- | - | -
  |

2 | 1
- | -
  |

6 | 8 | 9 | 12
- | - | - | --
  |

--------------------------------------------------------------------------------

12/13 I have a 2D int array called nums. Write a method that returns the sum of all entries

```java
public int sumArr(int[][] nums){
  int total = 0;

for (int r = 0; r < nums.length; r++) {
  for (int c = 0; c < nums[r].length; c++) {
    total += nums[r][c];
  }
}
return total;
}
```

Return sum of all even #s

```java
public int sumEvens(int[][] nums){
  int sum = 0;
  for (int r = 0; r < nums.length; r++) {
    for (int c = 0; c < nums[r].length; c++) {
      if(nums[r][c] % 2 == 0){
        sum += nums[r][c];
      }
    }
  }
  return sum;
}
```

return average of each row

```java
public int sumArr(int[][] nums){
  int total = 0;

for (int r = 0; r < nums.length; r++) {
  for (int c = 0; c < nums[r].length; c++) {
    total += nums[r][c];
  }
}
return total/nums.length;
}
```

# TO PRINT A 2D ARRAY:

```java
int[][] arr = new int[4][3];
for (int r = 0; r < arr.length; r++) { // rows
  for (int c = 0; c < arr[r].length; c++) { // colums
    System.out.print(arr[r][c] + "");
  }
  systtem.out.println();
}
```
