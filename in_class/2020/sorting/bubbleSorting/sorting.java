/**
 * bubbleSorting
 */
public class sorting {
  public static void main(String[] args) {
    int[] arr = { 3, 2, 3, 4, 5 };
    bubbleSort(arr);
    printArr(arr);
  }

  /**
   * @author nick wald
   *
   * @param arr must contain at least 2 numbers sorts * a given array lowest to
   *            highest
   * @return sorted array with numbers in ascending order
   */
  public static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void printArr(int[] arr) {
    for (int i : arr) {
      System.out.println(i + ", ");
    }
  }
}
