/*
copyright 
*/

package club.zylearn.util;

import java.util.Scanner;

/**
���������̨��ȡһ������
*/
public class ConsoleStream{
	private static final String PAT = "��";
	private static final String ENTER = "\r\n";
	private static final String ENPTY = "";
	public static String getInputString(String comment){
		// ��ӡ��ʾ��Ϣ
		System.out.print(comment);
		// ʵ����ɨ����
		Scanner scan = new Scanner(System.in);
		// ���÷ָ���
		scan.useDelimiter(ENTER);
		// ��ȡһ��
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