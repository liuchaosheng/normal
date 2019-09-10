public class BubbleSort{
	// 进行冒泡排序的方法
	public static void bubbleSort(int[] array){
		// 计算冒泡培训的次数
		int bubbleCount = array.length;
		// 循环执行bubbleCount次冒泡
		for(int i = 0 ; i < bubbleCount ; i++){
			// 每一次冒泡过程都一样
			for(int j = 0 ; j < array.length - 1; j++){
				// 比较当前索引对应的值跟下一索引对应的值判断是否需要冒泡
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}