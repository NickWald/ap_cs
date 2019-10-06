//use math.random to generate a number between 5 and 15, store it in an integer

public class testing {
	public static void main(String[] args) {
		//int randomNumber = (int) (Math.random() * 10 + 5); //[0, 15 exclusive]
    //adding + 1 adds 1 to both numbers in the range

		int x = 4;
		int y = 6;
		x -= y;
		y += x;
		System.out.println(x);
		System.out.println(y);
	}
}
