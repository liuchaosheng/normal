// 归并排序
public class MergeSort{
	// 具体方法  对start-end索引处数据进行归并 排序
	public static int[] mergeSort(int[] array,int start,int end){
		// 如果该组只有一个数据则返回，这也是递归的出口
		if(start == end){
			return new int[]{array[start]}; // 生成新数组返回
		}
		// 计算分界点索引，然后递归
		int midIndex = start + (end - start) / 2;
		
		// 对左序列进行归并排序
		int[] leftArr = mergeSort(array,start,midIndex);
		
		// 对右序列进行归并排序
		int[] rightArr = mergeSort(array,midIndex + 1,end);
		
		// 申请能容纳左右序列的新数组
		int[] newArr = new int[leftArr.length + rightArr.length];
		
		// 定义索引分别表示左右序列的当前索引和新序列的当前索引
		int leftPos = 0;
		int rightPos = 0;
		int newArrPos = 0;
		// 将左右有序序列的值循序按顺序放入新数组中
		while(leftPos < leftArr.length && rightPos < rightArr.length){
			newArr[newArrPos++] = leftArr[leftPos] < rightArr[rightPos] ? leftArr[leftPos++]
				: rightArr[rightPos++];
		}
		// 剩下非空序列则直接拷贝到新数组中
		while(leftPos < leftArr.length){
			newArr[newArrPos++] = leftArr[leftPos++];
		}
		while(rightPos < rightArr.length){
			newArr[newArrPos++] = rightArr[rightPos++];
		}
		return newArr;
	}
}