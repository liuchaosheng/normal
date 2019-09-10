public class DataToBinaryChar{
	public static void main(String args[]){
		int data = -7333;
		char[] retCharBuf = toBinarryChar(data);
		String str = new String(retCharBuf);
		System.out.println(str);
	}
	// ��ʮ��������ת���ɶ��������ַ�������ʽ����
	public static char[] toBinarryChar(int data){
		boolean isSuchNumber = false; // ���ڱ�ʾ�Ƿ��Ǹ���
		if(data == 0){
			return new char[]{'0'};
		}
		if(data < 0){
			data = -data;
			isSuchNumber = true;
		}
		//���к��ļ���
		//����һ�������������ڴ洢ÿ�μ��������
		char[] charBuf = new char[32]; // �������ռ��32λ������λ
		int len = 0; // �ı������ڱ�Ǵ洢����
		int shang = data; // ���ÿ�μ������
		int yushu = 0; // ���ÿ�μ��������
		// ѭ������
		while(shang > 0){
			int temp = shang;
			shang = shang / 2;
			yushu = temp % 2;
			// ��������
			charBuf[len++] = (char)('0' + yushu);
		}
		//ѭ����������Ҫ��������
		char[] retCharBuf = null; 
		if(isSuchNumber){ // ������ӷ���
			retCharBuf = new char[len + 1];
			retCharBuf[0] = '-';  // �洢����λ
			for(int i = 0 ; i < len ; i++){
				//���������е��������������������
				retCharBuf[i + 1] = charBuf[len - i - 1];
			}
		}else{
			retCharBuf = new char[len];
			for(int i = 0 ; i < len ; i++){
				//���������е��������������������
				retCharBuf[i] = charBuf[len - i - 1];
			}
		}
		return retCharBuf;
	}
}