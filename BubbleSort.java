public class BubbleSort{
	// ����ð������ķ���
	public static void bubbleSort(int[] array){
		// ����ð����ѵ�Ĵ���
		int bubbleCount = array.length;
		// ѭ��ִ��bubbleCount��ð��
		for(int i = 0 ; i < bubbleCount ; i++){
			// ÿһ��ð�ݹ��̶�һ��
			for(int j = 0 ; j < array.length - 1; j++){
				// �Ƚϵ�ǰ������Ӧ��ֵ����һ������Ӧ��ֵ�ж��Ƿ���Ҫð��
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}