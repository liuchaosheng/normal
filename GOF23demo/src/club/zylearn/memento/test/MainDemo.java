package club.zylearn.memento.test;

import club.zylearn.memento.Chess;
import club.zylearn.memento.ChessColor;

public class MainDemo {

	public static void main(String[] args) {
		Chess chess = new Chess();
		chess.setChessColor(ChessColor.BLACK_CHESS);
		chess.setId(10);
		chess.setX(1);
		chess.setY(5);
		
	}

}
