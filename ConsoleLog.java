/*
copyright 
*/

import java.util.Date;
import java.text.SimpleDateFormat;
/**
用于做控制台输出信息的类
*/
public class ConsoleLog{
	private static final String LOG_START = "【";
	private static final String LOG_END = "】";
	private static final String XING = "****************";
	private static final String TIME_FORMAT_NORMAL = "yyyy-MM-dd HH:mm:ss";
	private static final String SPACE = " ";
	private static final String INFO = "INFO";
	public static void info(String message){
		String dateStr = new SimpleDateFormat(TIME_FORMAT_NORMAL).format(new Date());
		System.out.println(LOG_START + INFO + LOG_END + 
		dateStr + SPACE + message + XING);
	}
}