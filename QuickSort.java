// ���������ʵ��
public class QuickSort{
	// ������array��start��end���������ݽ�������
	public static void quickSort(int[] array,int start,int end){
		if(start >= end){
			return ;  // ���start==end������ǰ���Ѿ�����������ݹ�Ҳ������
		}
		// ȡ��array[start]��Ϊ����ֵ
		int baseValue = array[start];
		// ���������������ֱ�洢ǰ��ɨ�������
		int low = start;
		int high = end;
		// ����ѭ���ҵ�baseValue������
		while(low < high){
			// �Ӻ���ǰɨ��
			while(low < high){
				// �ҵ�һ����baseValueС�����滻low����λ��
				if(array[high] < baseValue){
					array[low] = array[high]; // ��high--��Ϊ����һ��ѭ��
					break;
				}
				high--;
			}
			//�ж�high�Ƿ�ָ����low
			if(high == low){ // ˵���Ѿ��ҵ���baseValueӦ�÷��õ�����
				break;
			}
			low++; // low����λ���Ѿ����滻������Ҫ����һ��������ʼɨ��
			// �ж���ʵɨ��λ���Ƿ����high����λ��
			while(low < high){
				if(array[low] > baseValue){
					array[high--]=array[low];
					break;
				}
				low++;
			}
		}
		// ѭ��������low==high �ҵ���baseValue������λ��
		array[low] = baseValue;
		ConsoleLog.info("low = " + low + "��high = " + high + "��start = " + start + "��end = " + end + " ");
		SortDemo.print(array);
		
		//�ݹ�ִ��ǰ������ ����low-1<0����low+1����0�÷���Ҳ��ֱ�ӷ���
		quickSort(array,start,low-1);
		quickSort(array,low+1,end);
	}
}