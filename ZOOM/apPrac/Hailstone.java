public class Hailstone{
  public static int hailstoneLength(int n){
    int count = 0;
    while(int n != 1){
      if(n%2 == 0){
        n = n/2;
      }
      else{
        n = n*3 + 1;
      }
      count++;
    }
    return count;
  }

  public static boolean isLongSeq(int n){
    int length = 0;
    if(hailstoneLength(n) > n){
      return true
    }
    else if(hailstoneLength(n) <= n) return false;
  }

  public static double propLong(int n){
    double isLong, notLong = 0;
    for(int i = 0; i < n; i++){
      if(isLongSeq(n) == true){
        isLong++;
      }
      else if(isLongSeq(n) == false){
        notLong++;
      }
    }
    return isLong/notLong;
  }

}
