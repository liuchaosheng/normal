public class BubbleSort{
	// ����ð������ķ���
	public static void bubbleSort(int[] array){
		ConsoleLog.info("��ʼð������");
		// ����ð�ݵĵ�����
		int bubbleCount = array.length - 1;
		// ѭ��ִ��bubbleCount��ð��
		for(int i = 0 ; i < bubbleCount ; i++){
			ConsoleLog.info("���е�" + (i + 1) + "��ð�ݣ�");
			// ÿһ��ð�ݹ������һ�ζԱȵ���ʼ��������һ�����ȼ������ʼ����
			int lastStartIndex = array.length - i - 1;
			for(int j = 0 ; j < lastStartIndex ; j++){
				// �Ƚϵ�ǰ������Ӧ��ֵ����һ������Ӧ��ֵ�ж��Ƿ���Ҫð��
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			SortDemo.print(array);
		}
		ConsoleLog.info("����ð������");
	}
}