public class InsertSort{
	// 带步长的插入排序（对某一个逻辑分组进行排序）
	// 参数cap表示增量  start表示逻辑分组的开始索引
	public static void insertSortNew(int[] array,int cap,int start){
		// 遍历无序组
		for(int i = start + cap ; i < array.length ; i += cap){
			// 取出无序组当前值，避免数组移动覆盖
			int curValue = array[i];
			
			// 定义变量来存放待插入的索引
			int j = 0 ; 
			
			// 从后向前遍历有序组
			for(j = i - cap; j >= start ; j -= cap){
				if(array[j] > curValue){
					// 移动元素
					array[j + cap] = array[j] ;
				}else{
					break;
				}
			}
			// 插入元素
			array[j + cap] = curValue;
		}
	}
}