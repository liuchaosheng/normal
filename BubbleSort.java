public class BubbleSort{
	// 进行冒泡排序的方法
	public static void bubbleSort(int[] array){
		ConsoleLog.info("开始冒泡排序");
		// 计算冒泡的的轮数
		int bubbleCount = array.length - 1;
		// 循环执行bubbleCount轮冒泡
		for(int i = 0 ; i < bubbleCount ; i++){
			ConsoleLog.info("进行第" + (i + 1) + "轮冒泡：");
			// 每一轮冒泡过程最后一次对比的起始索引都不一样，先计算该起始索引
			int lastStartIndex = array.length - i - 1;
			for(int j = 0 ; j < lastStartIndex ; j++){
				// 比较当前索引对应的值跟下一索引对应的值判断是否需要冒泡
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			SortDemo.print(array);
		}
		ConsoleLog.info("结束冒泡排序");
	}
}