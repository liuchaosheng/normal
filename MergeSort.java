// �鲢����
public class MergeSort{
	// ���巽��  ��start-end���������ݽ��й鲢 ����
	public static int[] mergeSort(int[] array,int start,int end){
		// �������ֻ��һ�������򷵻أ���Ҳ�ǵݹ�ĳ���
		if(start == end){
			return new int[]{array[start]}; // ���������鷵��
		}
		// ����ֽ��������Ȼ��ݹ�
		int midIndex = start + (end - start) / 2;
		
		// �������н��й鲢����
		int[] leftArr = mergeSort(array,start,midIndex);
		
		// �������н��й鲢����
		int[] rightArr = mergeSort(array,midIndex + 1,end);
		
		// �����������������е�������
		int[] newArr = new int[leftArr.length + rightArr.length];
		
		// ���������ֱ��ʾ�������еĵ�ǰ�����������еĵ�ǰ����
		int leftPos = 0;
		int rightPos = 0;
		int newArrPos = 0;
		// �������������е�ֵѭ��˳�������������
		while(leftPos < leftArr.length && rightPos < rightArr.length){
			newArr[newArrPos++] = leftArr[leftPos] < rightArr[rightPos] ? leftArr[leftPos++]
				: rightArr[rightPos++];
		}
		// ʣ�·ǿ�������ֱ�ӿ�������������
		while(leftPos < leftArr.length){
			newArr[newArrPos++] = leftArr[leftPos++];
		}
		while(rightPos < rightArr.length){
			newArr[newArrPos++] = rightArr[rightPos++];
		}
		return newArr;
	}
}