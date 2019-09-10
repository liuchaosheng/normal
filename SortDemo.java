
import java.util.Random;

public class SortDemo{
	private static final String TABLE = "\t";
	private static int count = 0;
	public static void main(String args[]){
		// �������30������
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
		System.out.println("��ʱ��" + useTime + "ms");
	}
	
	// ���������ӡ�ķ���
	public static void print(int[] array){
		for(int i = 0 ; i < array.length ; i++){
			System.out.print(array[i] + TABLE);
		}
		System.out.println();
	}
	
	
	// ��������(��ǰ��ʵ��)
	public static void insertSort(int[] array){
		// ����������β������
		int sortedEndIndex = 0;
		// ѭ������������
		for(int i = 1 ; i < array.length ; i++){
			// �洢��ǰֵ �����ƶ�ʱ����
			int curValue = array[i];
			// ��������洢�������е�һ���ȴ�����Ԫ�ش��Ԫ������
			int insertPos = -1;
			// �ҵ��������������
			for(int j = 0 ; j <= sortedEndIndex ; j++){
				if(array[j] > curValue){
					insertPos = j;
					break;
				}
			}
			// �ж��Ƿ��ҵ�
			if(insertPos != -1){
				// ����ҵ����������ƶ�������Ԫ��
				for(int k = sortedEndIndex; k >= insertPos ; k--){
					array[k+1] = array[k];
				}
				//�ƶ������󽫵�ǰԪ�ز���
				array[insertPos] = curValue;
			}
			sortedEndIndex++; //������β����������
		}
	}
	
}