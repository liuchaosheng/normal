public class ShellSort{
	// 希尔排序
	public static void shellSort(int[] array){
		ConsoleLog.info("进行希尔排序");
		// 希尔排序需要借助于插入排序
		// 计算增量的初始值
		int cap = array.length / 2;
		while(cap >= 1){
			// 进行分组 求每一组的初始索引
			ConsoleLog.info("增量 = " + cap + "的各个分组：");
			for(int start = 0 ; start < cap ; start++){
				// 排序该分组
				InsertSort.insertSortNew(array,cap,start);
				SortDemo.print(array);
			}
			// 改变增量
			cap = cap / 2;
		}
		ConsoleLog.info("希尔排序结束");
	}
}