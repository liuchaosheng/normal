/*
copyright 
*/

package club.zylearn.maindemo;

import club.zylearn.util.ConsoleLog;
import java.sql.SQLException;

public class ExceptionDemo{
	public static void main(String args[]){
		/*ConsoleLog.info("1、计算开始");
		try{
			ConsoleLog.info("2、计算 10 / 0 = " + ( 10 / 0 ));
		}catch(Exception e){
			ConsoleLog.info("产生异常了！");
		}finally{
			ConsoleLog.info("不管咋样我都会执行！");
		}
		ConsoleLog.info("3、计算结束");*/
		try{
			doFun();
		}catch(Exception e){
			ConsoleLog.info("其他异常产生了....");
		}finally{
			ConsoleLog.info("我是第二层finally代码");
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
			ConsoleLog.info("我是try块中异常后面的代码！");
		}catch(Exception e){
			throw e;
		}finally{
			ConsoleLog.info("我是第一层finally代码");
		}
		ConsoleLog.info(String.valueOf(ret));
	}
}