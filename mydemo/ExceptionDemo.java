/*
copyright 
*/

package club.zylearn.maindemo;

import club.zylearn.util.ConsoleLog;
import java.sql.SQLException;

public class ExceptionDemo{
	public static void main(String args[]){
		/*ConsoleLog.info("1�����㿪ʼ");
		try{
			ConsoleLog.info("2������ 10 / 0 = " + ( 10 / 0 ));
		}catch(Exception e){
			ConsoleLog.info("�����쳣�ˣ�");
		}finally{
			ConsoleLog.info("����զ���Ҷ���ִ�У�");
		}
		ConsoleLog.info("3���������");*/
		try{
			doFun();
		}catch(Exception e){
			ConsoleLog.info("�����쳣������....");
		}finally{
			ConsoleLog.info("���ǵڶ���finally����");
		}
		
	}
	public static int fun(String div,String by) throws NumberFormatException,ArithmeticException{
		int numDir = Integer.parseInt(div);
		int numBy = Integer.parseInt(by);
		return numDir / numBy;
	}
	public static void doFun(){
		int ret = 0;
		try{
			ret = fun("100","0");
			ConsoleLog.info("����try�����쳣����Ĵ��룡");
		}catch(Exception e){
			throw e;
		}finally{
			ConsoleLog.info("���ǵ�һ��finally����");
		}
		ConsoleLog.info(String.valueOf(ret));
	}
}