package ui;

public class SudokuSolverApp {

	private static final int GRID_SIZE = 9;

	public static void main(String[] args) {
		// Code with John -> SudokuSolver

		int[][] board = { { 7, 0, 2, 0, 5, 0, 6, 0, 0 }, { 0, 0, 0, 0, 0, 3, 0, 0, 0 }, { 1, 0, 0, 0, 0, 9, 5, 0, 0 },
				{ 8, 0, 0, 0, 0, 0, 0, 9, 0 }, { 0, 4, 3, 0, 0, 0, 7, 5, 0 }, { 0, 9, 0, 0, 0, 0, 0, 0, 8 },
				{ 0, 0, 9, 7, 0, 0, 0, 0, 5 }, { 0, 0, 0, 2, 0, 0, 0, 0, 0 }, { 0, 0, 7, 0, 4, 0, 2, 0, 3 } };

		System.out.println("Orignal starting Sudoku board:\n");
		printBoard(board);

		if (solveBoard(board)) {
			System.out.println("\nSolved successfully!");
		} else {
			System.out.println("Unsolvable board :( ");
		}

		System.out.println("Final Sudoku board:\n");
		printBoard(board);

	}// end of main method

	private static void printBoard(int[][] board) {
		for (int row = 0; row < GRID_SIZE; row++) {
			if (row % 3 == 0 && row != 0) {
				System.out.println("------------");
			}
			for (int column = 0; column < GRID_SIZE; column++) {
				if (column % 3 == 0 && column != 0) {
					System.out.print("|");
				}
				System.out.print(board[row][column]);
			}
			System.out.println();
		}

	}

	private static boolean isNumberInRow(int[][] board, int number, int row) {
		for (int i = 0; i < GRID_SIZE; i++) {
			if (board[row][i] == number) {
				return true;
			} // end if
		} // end for
		return false;
	}// end of isNumberInRow method

	private static boolean isNumberInColumn(int[][] board, int number, int column) {
		for (int i = 0; i < GRID_SIZE; i++) {
			if (board[i][column] == number) {
				return true;
			} // end if
		} // end for
		return false;
	}// end of isNumberInColumn method

	private static boolean isNumberInBox(int[][] board, int number, int row, int column) {
		int localBoxRow = row - row % 3;
		int localBoxColumn = column - column % 3;

		for (int i = localBoxRow; i < localBoxRow; i++) {
			for (int j = localBoxColumn; j < localBoxColumn; j++) {
				if (board[i][j] == number) {
					return true;
				}
			}
		}
		return false;
	}// end of isNumberInBox method

	private static boolean isValidPlacement(int[][] board, int number, int row, int column) {
		return !isNumberInRow(board, number, row) && !isNumberInColumn(board, number, column)
				&& !isNumberInBox(board, number, row, column);
	}// end of method

	private static boolean solveBoard(int[][] board) {
		for (int row = 0; row < GRID_SIZE; row++) {
			for (int column = 0; column < GRID_SIZE; column++) {
				if (board[row][column] == 0) {
					for (int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) {
						if (isValidPlacement(board, numberToTry, row, column)) {
							board[row][column] = numberToTry;

							if (solveBoard(board)) {
								return true;
							} else {
								board[row][column] = 0;
							}

						}
					}
					return false;
				}
			}
		}
		return true;
	}// end of method

}// end of class
