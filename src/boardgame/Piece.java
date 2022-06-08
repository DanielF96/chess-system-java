package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board borad) {
		this.board = borad;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

}
