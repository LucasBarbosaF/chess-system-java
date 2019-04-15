package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.position = null;
		this.board = board;
	}
	
	public Board getBoard()
	{
		return this.board;
	}
	
}
