public class Demo1{
	public static void main(String args[]){
		//System.out.println("Hello World!") ;
		/*
			基本数据类型：
			byte/short/int/long  -> 0
			float/double -> 0.0
			char   '\u0000'
			boolean  false
			引用数据类型：默认值 null
		*/
		int data1 = 100 ; // 100
		int data2 = 012;  // 10
		int data3 = 0xf ; // 15
		System.out.println(data1) ;
		System.out.println(data2) ;
		System.out.println(data3) ;
		
		int data4 = Integer.MAX_VALUE ;
		// 我新增了一行
		System.out.println("new line") ;
		
		
		//0000 0000 - 0111 1111
		//1000 0000 转成原码 1000 0000 原码和补码相等。表示 -128
		//-128 + 1 = 1000 0000 + 0000 0001 = 1000 0001 变成原码 0111 1111 ==> 127
		
	}
}