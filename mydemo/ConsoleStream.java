/*
copyright 
*/

package club.zylearn.util;

import java.util.Scanner;

/**
用于向控制台获取一行输入
*/
public class ConsoleStream{
	private static final String PAT = "：";
	private static final String ENTER = "\r\n";
	private static final String ENPTY = "";
	public static String getInputString(String comment){
		// 打印提示信息
		System.out.print(comment);
		// 实例化扫描流
		Scanner scan = new Scanner(System.in);
		// 设置分隔符
		scan.useDelimiter(ENTER);
		// 读取一行
		String newLine = null;
		while(scan.hasNext()){
			newLine = scan.next();
			if(!ENPTY.equals(newLine) && newLine != null){
				break;
			}
		}
		return newLine;
	}
}