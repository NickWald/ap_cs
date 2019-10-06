//1 - Print sum of all even t #s from 1-50
public class loops {
	public static void main(String[] args) {
		int rows = 50;
    int x = 0;
    int sum = 0;

    while(x < rows){
      sum += x;
      x += 2;
    }
    System.out.println(sum);
	}


//2 - Print product of all #s from 1-10
public static void two(String[] args) {
  int rows = 50;
  int x = 1;
  int product = 1;

    while(x < rows){
      product *= x;
      x++;
  }
    System.out.println(product);
  }
}
