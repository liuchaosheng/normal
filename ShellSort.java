public class ShellSort{
	// ϣ������
	public static void shellSort(int[] array){
		// ϣ��������Ҫ�����ڲ�������
		// ���������ĳ�ʼֵ
		int cap = array.length / 2;
		while(cap >= 1){
			// ���з��� ��ÿһ��ĳ�ʼ����
			for(int start = 0 ; start < cap ; start++){
				// ����÷���
				InsertSort.insertSortNew(array,cap,start);
			}
			// �ı�����
			cap = cap / 2;
		}
	}
}