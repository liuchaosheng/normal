package club.zylearn.generic.clazz;

public class ArrayData<T> {
	private T[] datas;
	public void setDatas(T[] datas) {
		this.datas = datas;
	}
	public T[] getDatas() {
		return datas;
	}
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append("[");
		for(int i = 0 ; i < this.datas.length ; i++) {
			buf.append(this.datas[i].toString());
			buf.append(",");
		}
		buf.delete(buf.length() - 1, buf.length());
		buf.append("]");
		return buf.toString();
	}
}
