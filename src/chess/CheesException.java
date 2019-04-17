package chess;

import boardgame.BoardException;

public class CheesException extends BoardException {
	private static final long serialVersionUID = 1L;
	
	public CheesException(String msg) {
		super(msg);
	}

}
