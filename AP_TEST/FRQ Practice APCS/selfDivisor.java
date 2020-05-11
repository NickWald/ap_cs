//part a
public static boolean isSelfDivisor(int number){
  int n = number;
  while(n > 0){
    int n2 = n%10;
    if(n2 == 0 || number % n2 != 0){
      return false;
    }
    n /= 10;
  }
  return true;
}

//part b
public static int[] firstNumSelfDivisors(int start, int num){
  int[] selfDivisors = new int[num];
  int stored = 0;
  int next = start;
  while(stored < num){
    if(isSelfDivisor(next) == true){
      selfDivisors[stored] = next;
      stored++;
    }
    next++;
  }
  else return selfDivisors;
}
 
