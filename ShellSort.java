public class ShellSort{
	// ϣ������
	public static void shellSort(int[] array){
		ConsoleLog.info("����ϣ������");
		// ϣ��������Ҫ�����ڲ�������
		// ���������ĳ�ʼֵ
		int cap = array.length / 2;
		while(cap >= 1){
			// ���з��� ��ÿһ��ĳ�ʼ����
			ConsoleLog.info("���� = " + cap + "�ĸ������飺");
			for(int start = 0 ; start < cap ; start++){
				// ����÷���
				InsertSort.insertSortNew(array,cap,start);
				SortDemo.print(array);
			}
			// �ı�����
			cap = cap / 2;
		}
		ConsoleLog.info("ϣ���������");
	}
}