public class InsertSort{
	// �������Ĳ������򣨶�ĳһ���߼������������
	// ����cap��ʾ����  start��ʾ�߼�����Ŀ�ʼ����
	public static void insertSortNew(int[] array,int cap,int start){
		// ����������
		for(int i = start + cap ; i < array.length ; i += cap){
			// ȡ�������鵱ǰֵ�����������ƶ�����
			int curValue = array[i];
			
			// �����������Ŵ����������
			int j = 0 ; 
			
			// �Ӻ���ǰ����������
			for(j = i - cap; j >= start ; j -= cap){
				if(array[j] > curValue){
					// �ƶ�Ԫ��
					array[j + cap] = array[j] ;
				}else{
					break;
				}
			}
			// ����Ԫ��
			array[j + cap] = curValue;
		}
	}
}