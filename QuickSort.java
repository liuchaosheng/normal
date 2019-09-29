// 快速排序的实现
public class QuickSort{
	// 对数组array的start到end索引的数据进行排序
	public static void quickSort(int[] array,int start,int end){
		if(start >= end){
			return ;  // 如果start==end表明当前组已经排序结束，递归也结束了
		}
		// 取出array[start]作为基础值
		int baseValue = array[start];
		// 定义两个变量来分别存储前后扫描的索引
		int low = start;
		int high = end;
		// 进行循环找到baseValue的索引
		while(low < high){
			// 从后向前扫描
			while(low < high){
				// 找第一个比baseValue小的数替换low所在位置
				if(array[high] < baseValue){
					array[low] = array[high]; // 将high--是为了下一次循环
					break;
				}
				high--;
			}
			//判断high是否指向了low
			if(high == low){ // 说明已经找到了baseValue应该放置的索引
				break;
			}
			low++; // low所在位置已经被替换所以需要从下一个索引开始扫描
			// 判断其实扫描位置是否就是high所在位置
			while(low < high){
				if(array[low] > baseValue){
					array[high--]=array[low];
					break;
				}
				low++;
			}
		}
		// 循环结束则low==high 找到了baseValue的索引位置
		array[low] = baseValue;
		ConsoleLog.info("low = " + low + "，high = " + high + "，start = " + start + "，end = " + end + " ");
		SortDemo.print(array);
		
		//递归执行前后两组 哪怕low-1<0或者low+1大于0该方法也会直接返回
		quickSort(array,start,low-1);
		quickSort(array,low+1,end);
	}
}