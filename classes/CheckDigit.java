public class CheckDigit{

  public static int getCheck(int num){
    /* implementation not shown */
  }

  public static boolean isValid(int numWithCheckDigit){
  /* to be implemented in part (a) */
    return getCheck(numWithCheckDigit / 10) == numWithCheckDigit %
    10;
    //return true if first 3 digs of numWithCheckDigit is equal to the last dig of the numWithCheckDigit
  }
}

//part b (open ended):
/** private static int numInvalid, set to zero, inside isValid:
* increment numInvalid if the method would return false;
*
* Make a public static int getNumInvalid() method,
*/
