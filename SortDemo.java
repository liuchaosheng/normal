
import java.util.Random;

public class SortDemo{
	private static final String TABLE = "\t";
	private static int count = 0;
	public static void main(String args[]){
		// 随机产生30个整数
		int[] array = new int[2];
		Random random = new Random();
		for(int i = 0 ; i < array.length ; i++){
			array[i] = random.nextInt(100);
		}
		long start = System.currentTimeMillis();
		
		//InsertSort.insertSortNew(array,1,0);
		//BubbleSort.bubbleSort(array);
		//SelectSort.selectSort(array);
		//ShellSort.shellSort(array);
		print(array);
		QuickSort.quickSort(array,0,array.length - 1);
		print(array);
		
		long useTime = System.currentTimeMillis() - start;
		System.out.println("用时：" + useTime + "ms");
	}
	
	// 进行数组打印的方法
	public static void print(int[] array){
		for(int i = 0 ; i < array.length ; i++){
			System.out.print(array[i] + TABLE);
		}
		System.out.println();
	}
	
	
	// 插入排序(以前的实现)
	public static void insertSort(int[] array){
		// 定义有序组尾部索引
		int sortedEndIndex = 0;
		// 循环遍历无序组
		for(int i = 1 ; i < array.length ; i++){
			// 存储当前值 避免移动时覆盖
			int curValue = array[i];
			// 定义变量存储有序组中第一个比待插入元素大的元素索引
			int insertPos = -1;
			// 找到上述定义的索引
			for(int j = 0 ; j <= sortedEndIndex ; j++){
				if(array[j] > curValue){
					insertPos = j;
					break;
				}
			}
			// 判断是否找到
			if(insertPos != -1){
				// 如果找到该索引则移动有序组元素
				for(int k = sortedEndIndex; k >= insertPos ; k--){
					array[k+1] = array[k];
				}
				//移动结束后将当前元素插入
				array[insertPos] = curValue;
			}
			sortedEndIndex++; //有序组尾部索引增加
		}
	}
	
}