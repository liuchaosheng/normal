public class Demo1{
	public static void main(String args[]){
		//System.out.println("Hello World!") ;
		/*
			�����������ͣ�
			byte/short/int/long  -> 0
			float/double -> 0.0
			char   '\u0000'
			boolean  false
			�����������ͣ�Ĭ��ֵ null
		*/
		int data1 = 100 ; // 100
		int data2 = 012;  // 10
		int data3 = 0xf ; // 15
		System.out.println(data1) ;
		System.out.println(data2) ;
		System.out.println(data3) ;
		
		int data4 = Integer.MAX_VALUE ;
		// ��������һ��
		System.out.println("new line") ;
		
	}
}