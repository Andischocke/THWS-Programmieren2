package exercise16.task4;

import exercise13.task1.Bishop;
import exercise13.task1.Board;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestBishop {
	Bishop bishop;
	Board board;

	@BeforeEach
	public void prepareTest() {
		bishop = null;
		board = null;
	}

	@Test
	public void testBishopNull() {
		assertEquals(null, bishop);
	}
	
	@Test
	public void testBishopPosition() {
		bishop = new Bishop(4, 5);
		assertEquals(4, bishop.getX());
		assertEquals(5, bishop.getY());
	}

	@Test
	public void testBishopBoard() {
		testBishopPosition();
		boolean[][] board = new boolean[8][8];
		board[0][1] = true;
		board[0][7] = true;
		board[1][2] = true;
		board[1][6] = true;
		board[2][3] = true;
		board[2][5] = true;
		board[3][4] = true;
		board[4][3] = true;
		board[4][5] = true;
		board[5][2] = true;
		board[5][6] = true;
		board[6][1] = true;
		board[6][7] = true;
		board[7][0] = true;
		assertArrayEquals(board, bishop.getMoveableSquares().board);
	}
}
