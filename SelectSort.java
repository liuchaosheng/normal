public class SelectSort{
	// ����ѡ������
	public static void selectSort(int[] array){
		// ����ÿ��ѡ�������
		int start = 0;
		while(start < array.length - 1){
			// ����ǰѡ��������������н��бȽ��ҵ����ʵ�ֵ
			for(int i = start + 1 ; i < array.length ; i++){
				// ������������ֵС�ڵ�ǰѡ���ֵ����н���
				if(array[i] < array[start]){
					int temp = array[i];
					array[i] = array[start];
					array[start] = temp;
				}
			}
			ConsoleLog.info("��" + (start + 1) + "��ѡ��Ľ��");
			SortDemo.print(array);
			start++;
		}
	}
}