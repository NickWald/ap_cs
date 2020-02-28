/**
** @return true if all rows in arr2D have different row sums;
**  false otherwise
*/
public static boolean isDiverse(int[][] arr2D){
  int[] sums = rowSums(arr2D);
  for (int i = 0; i < sums.length; i++) {
    for (int j = i+1; j < sums.length; j++) {
      if(sums[i] == sums[j]) return false;
    }
  }
  reuturn true;
}
