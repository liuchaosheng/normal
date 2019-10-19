package club.zylearn.memento;

import club.zylearn.memento.util.BeanAccessor;

// 该类是原发器角色 表示棋子
public class Chess {
	public static final String INFO_STRING = "{id}号{chessColor}棋子，当前处在[{x},{y}]";
	// 表示棋子的颜色
	private ChessColor chessColor;
	
	// 持有备忘录责任者引用
	MementoCareTaker tacker = new MementoCareTaker();
	
	// 表示棋子的id
	private int id;
	
	// 表示棋子的坐标x，可能会改变
	private int x;
	
	// 表示棋子的坐标y，可能会改变
	private int y;

	public ChessColor getChessColor() {
		return chessColor;
	}

	public void setChessColor(ChessColor chessColor) {
		this.chessColor = chessColor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// 表示下棋，该方法会促使Chess改变内部属性
	public void move(int x,int y) {
		// 备忘录存储
		this.tacker.save(this);
		// 下棋
		this.x = x;
		this.y = y;
	}
	// 悔棋
	public void moveBack() {
		this.tacker.back(this);
	}
	// 创建记录
	public ChessMemento create() {
		ChessMemento chessMemento = new ChessMemento();
		chessMemento.setX(this.x);
		chessMemento.setY(this.y);
		return chessMemento;
	}
	public void restore() {
		this.tacker.back(this);
	}
	public void restore(int index) {
		this.tacker.backTo(this,index);
	}
	@Override
	public String toString() {
		try {
			return BeanAccessor.replaceAll(this, Chess.INFO_STRING);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
