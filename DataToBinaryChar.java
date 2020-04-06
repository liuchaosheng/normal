public class DataToBinaryChar{
	public static void main(String args[]){
		int data = -7333;
		char[] retCharBuf = toBinarryChar(data);
		String str = new String(retCharBuf);
		System.out.println(str);
	}
	// 将十进制数据转换成二进制以字符数组形式返回
	public static char[] toBinarryChar(int data){
		boolean isSuchNumber = false; // 用于表示是否是负数
		if(data == 0){
			return new char[]{'0'};
		}
		if(data < 0){
			data = -data;
			isSuchNumber = true;
		}
		//进行核心计算
		//定义一个缓存数组用于存储每次计算的余数
		char[] charBuf = new char[32]; // 整形最多占有32位二进制位
		int len = 0; // 改变量用于标记存储索引
		int shang = data; // 标记每次计算的商
		int yushu = 0; // 标记每次计算的余数
		// 循环计算
		while(shang > 0){
			int temp = shang;
			shang = shang / 2;
			yushu = temp % 2;
			// 缓存余数
			charBuf[len++] = (char)('0' + yushu);
		}
		//循环结束后需要逆序排列
		char[] retCharBuf = null; 
		if(isSuchNumber){ // 负数则加符号
			retCharBuf = new char[len + 1];
			retCharBuf[0] = '-';  // 存储符号位
			for(int i = 0 ; i < len ; i++){
				//将计算结果中的数据逆序放入新数组中
				retCharBuf[i + 1] = charBuf[len - i - 1];
			}
		}else{
			retCharBuf = new char[len];
			for(int i = 0 ; i < len ; i++){
				//将计算结果中的数据逆序放入新数组中
				retCharBuf[i] = charBuf[len - i - 1];
			}
		}
		return retCharBuf;
	}
}