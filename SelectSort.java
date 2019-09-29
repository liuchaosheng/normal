public class SelectSort{
	// 进行选择排序
	public static void selectSort(int[] array){
		// 定义每次选择的索引
		int start = 0;
		while(start < array.length - 1){
			// 跟当前选择索引后面的所有进行比较找到合适的值
			for(int i = start + 1 ; i < array.length ; i++){
				// 如果后面的其他值小于当前选择的值则进行交换
				if(array[i] < array[start]){
					int temp = array[i];
					array[i] = array[start];
					array[start] = temp;
				}
			}
			ConsoleLog.info("第" + (start + 1) + "轮选择的结果");
			SortDemo.print(array);
			start++;
		}
	}
}