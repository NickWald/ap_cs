public class javaSorted2D(){
  public static void main(String[] args){
    int[][] nums ={
      {3. 2. 3. 4},
      {3, 3, 4, 5},
      {4, 2, 2, 5}
    };

    System.out.println(isSorted(nums))
  }

  /**method, checks 2D array
  ** @return is 2D array sorted?
  **/
  public static boolean isSorted(int[][] arr){
    for (int i = 0; i < arr.length; i++) {
      if(!isSorted(arr[i]) == false) return false;
    }
    return true;
  }
/**same method, checks 1D array
** @return is 1D array sorted?
**/
  public static boolean isSorted(int[] arr){
    for (int i = 0; i < arr.length - 1; i++) {
      if(arr[i] > arr[i+1]) return false;
    }
    return true;
  }
}
