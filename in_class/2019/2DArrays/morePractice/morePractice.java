public class morePractice {
  public static void main(String[] args) {
    // Part A:
    int[][] nums = { { 0, 1, 3, 6 }, { 2, 3, 4 }, { 1, 7, -3, -2 } };
    System.out.println(nums[1][1]);

    // Part B:
    int[][] arr = new int[4][3];
    int count = 0;
    for (int r = 0; r < arr.length; r++) { // rows
      for (int c = 0; c < arr[r].length; c++) { // columns
        arr[r][c] = count++;
        System.out.print(arr[r][c] + " ");
      }
      System.out.println();
    }
  }
}
