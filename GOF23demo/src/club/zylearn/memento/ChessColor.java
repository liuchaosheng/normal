package club.zylearn.memento;

// 该类用来表示棋子的颜色 枚举实现多例模式
public enum ChessColor {
	BLACK_CHESS("黑色"),WHITE_CHESS("白色");
	private String color;
	private ChessColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return this.color;
	}
}
