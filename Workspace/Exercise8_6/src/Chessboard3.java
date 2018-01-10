
/**
 * @author ZackB
 *
 */
public class Chessboard3 {

	private static int board[][];
	private int numQueens;

	public Chessboard3() {
		numQueens = 0;
		board = new int[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				board[i][j] = 0;
			}
		}
	}

	public int getNumQueens() {
		return numQueens;
	}

	public void start() {
		solve(0);
	}

	public boolean solve(int numQueens) {
		if (numQueens == 8) {
			this.printBoard();
			System.out.println("SOLVED");
			return true;
		} else {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (validMove(i, j) == 0) {
						this.placeQueen(i, j, 0);
						numQueens++;
						if (solve(numQueens)) {
							return true;
						} else {
							this.placeQueen(i, j, 1);
							numQueens--;
						}

					}
				}
			}
		}
		return false;
	}

	public static int validMove(int x, int y) {
		// files
		for (int i = 0; i < 8; i++) {
			if (get(x, i) == 1) {
				return -1;
			}
			if (get(i, y) == 1) {
				return -1;
			}
		}
		// diagonals
		for (int i = 0; i < 8; i++) {
			if (get(x - i, y - i) == 1) {
				return -1;
			}
			if (get(x - i, y + i) == 1) {
				return -1;
			}
			if (get(x + i, y - i) == 1) {
				return -1;
			}
			if (get(x + i, y + i) == 1) {
				return -1;
			}
		}
		return 0;
	}

	public int placeQueen(int x, int y, int type) {
		if (type == 0) {
			board[x][y] = 1;
			numQueens++;
			return 0;
		} else if (type == 1) {
			board[x][y] = 0;
			return 0;
		}
		System.out.println("Erroneous Type Declared");
		return -3;
	}

	public static int get(int x, int y) {
		if (x < 0 || y < 0 || y > 7 || x > 7) {
			// System.out.println("Error: Solution does not exist");
			return -1;
		}
		return board[x][y];
	}

	public void printBoard() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(Chessboard3.get(i, j) + " ");
			}
			System.out.println("");
		}
	}

}
