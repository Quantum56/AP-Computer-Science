import java.util.Scanner;

/**
 * @author ZackB
 * @version 1.7.0.2
 */
public class exercise8_6 {
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Chessboard board = new Chessboard();
		board.start();
	}

	public static class Chessboard {
		private static double startTime;
		private static double endTime;
		private static Scanner sc = new Scanner(System.in);
		private static int boardSide = 8;
		private static boolean hasRun = false;
		private static char board[][];
		private int numQueens;

		public Chessboard() throws Exception {
			System.out.println("Enter chessboard dimension (1 side length) (must be greater than 8): ");
			boardSide = sc.nextInt();
			if (boardSide < 8) {
				throw new Exception("Chessboard dimensions are incorrect.");
			}
			startTime = System.currentTimeMillis();
			numQueens = 0;
			board = new char[boardSide][boardSide]; // change
			for (int i = 0; i < boardSide; i++) { // change
				for (int j = 0; j < boardSide; j++) { // change
					board[i][j] = 'x';
				}
			}
		}

		public int getNumQueens() {
			return numQueens;
		}

		public void start() {
			if (solve(0) == true) {
				System.out.println("\nSolved in " + (endTime - startTime) / 1000 + " seconds.");
			};
		}

		public boolean solve(int numQueens) {
			if (numQueens == boardSide) { // change
				this.printBoard();
				endTime = System.currentTimeMillis();
				return true;
			} else {
				for (int i = 0; i < boardSide; i++) { // change
					for (int j = 0; j < boardSide; j++) { // change
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
			for (int i = 0; i < boardSide; i++) { // change
				if (get(x, i) == 'Q') {
					return -1;
				}
				if (get(i, y) == 'Q') {
					return -1;
				}
			}
			// diagonals
			for (int i = 0; i < boardSide; i++) { // change
				if (get(x - i, y - i) == 'Q' || get(x - i, y + i) == 'Q' || get(x + i, y - i) == 'Q' || get(x + i, y + i) == 'Q') {
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
			if (x < 0 || y < 0 || y > (boardSide - 1) || x > (boardSide - 1)) {
				if (hasRun == false) {
					System.out.println("Calculating...\n");
				}
				hasRun = true;
				return 'x';
			}
			return board[x][y];
		}

		public void printBoard() {
			for (int i = 0; i < boardSide; i++) { // change
				for (int j = 0; j < boardSide; j++) { // change
					System.out.print(Chessboard.get(i, j) + " ");
				}
				System.out.println("");
			}
		}

	}

}
