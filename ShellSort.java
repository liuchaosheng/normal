public class ShellSort{
	// 希尔排序
	public static void shellSort(int[] array){
		// 希尔排序需要借助于插入排序
		// 计算增量的初始值
		int cap = array.length / 2;
		while(cap >= 1){
			// 进行分组 求每一组的初始索引
			for(int start = 0 ; start < cap ; start++){
				// 排序该分组
				InsertSort.insertSortNew(array,cap,start);
			}
			// 改变增量
			cap = cap / 2;
		}
	}
}