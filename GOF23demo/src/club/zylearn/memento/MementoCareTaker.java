package club.zylearn.memento;

import java.util.ArrayList;
import java.util.List;

// 备忘录的责任者，只是跟备忘录相关联，不跟源发器关联
public class MementoCareTaker {
	private List<ChessMemento> mementos;
	private int index;
	public MementoCareTaker() {
		mementos = new ArrayList<ChessMemento>();
		// 初始化索引为起始索引
		index = -1;
	}
	// 保存内部状态
	public void save(Chess chess) {
		this.mementos.add(chess.create());
		// 索引调整到最新保存的索引处
		index = this.mementos.size() - 1;
	}
	// 回退
	public void back(Chess chess) {
		if(index != -1) {
			ChessMemento memento = mementos.get(index--);
			chess.setX(memento.getX());
			chess.setY(memento.getY());
		}
	}
	// 回退到某个足迹
	public void backTo(Chess chess,int index) {
		if(index > - 1 && index < this.mementos.size()) {
			ChessMemento memento = mementos.get(index);
			chess.setX(memento.getX());
			chess.setY(memento.getY());
		}
	}
}
