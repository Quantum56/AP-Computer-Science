
/**
 * @author ZackB
 *
 */

/*
public class Chessboard1 {

	private static char board[][];
	private int numQueens;

	public Chessboard1() {
		numQueens = 0;
		board = new char[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				board[i][j] = 'x';
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
			if (get(x, i) == 'Q') {
				return -1;
			}
			if (get(i, y) == 'Q') {
				return -1;
			}
		}
		// diagonals
		for (int i = 0; i < 8; i++) {
			if (get(x - i, y - i) == 'Q') {
				return -1;
			}
			if (get(x - i, y + i) == 'Q') {
				return -1;
			}
			if (get(x + i, y - i) == 'Q') {
				return -1;
			}
			if (get(x + i, y + i) == 'Q') {
				return -1;
			}
		}
		return 0;
	}

	public int placeQueen(int x, int y, int type) {
		if (type == 0) {
			board[x][y] = 'Q';
			numQueens++;
			return 0;
		} else if (type == 1) {
			board[x][y] = 'x';
			return 0;
		}
		System.out.println("Erroneous Type Declared");
		return -3;
	}

	public static char get(int x, int y) {
		if (x < 0 || y < 0 || y > 7 || x > 7) {
			// System.out.println("Error: Solution does not exist");
			return 'x';
		}
		return board[x][y];
	}

	public void printBoard() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(Chessboard1.get(i, j) + " ");
			}
			System.out.println("");
		}
	}

}
*/