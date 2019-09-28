package club.zylearn.generic.clazz;

/**
 * 定义一个泛型类
 * @author chaos
 *
 * @param <T>  通过<T extends Number>来限定泛型的上限
 */
public class AwireData<T extends Number> {
	private T data;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "data = " + data.toString();
	}
}
