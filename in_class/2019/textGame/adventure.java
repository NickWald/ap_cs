public class adventure {
	public static void main(String[] args) {
		grid(5, 5, 5, 5); // (rows, columns, point's x, point's y) (FROM UPPER LEFTT CORNER)
	}

	public static void grid(int r, int c, int y, int x) {
		for (int rows = 0; rows <= r; rows++) {
			for (int columns = 0; columns <= c; columns++) {
				if (rows == x && columns == y) {
					System.out.print("O ");
				} else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}
	}
}

// , int c, int x, int y
