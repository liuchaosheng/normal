package club.zylearn.memento.test;

import club.zylearn.memento.Chess;
import club.zylearn.memento.ChessColor;
import club.zylearn.memento.util.BeanAccessor;

public class TestBeanAccessor {

	public static void main(String[] args) throws Exception{
		Chess chess = new Chess();
		chess.setChessColor(ChessColor.BLACK_CHESS);
		chess.setId(1);
		chess.setX(1);
		chess.setY(5);
		String ret = BeanAccessor.replaceAll(chess, Chess.INFO_STRING);
		System.out.println(ret);
	}

}
