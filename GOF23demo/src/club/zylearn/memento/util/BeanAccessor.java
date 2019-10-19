package club.zylearn.memento.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class BeanAccessor {
	/**
	 * 工具方法，使用obj中的属性内容替换formatStr中的{field}字符串
	 * @param obj
	 * @param formatStr
	 * @return
	 */
	public static final String LEFT_WRAP = "{";
	public static final String RIGHT_WRAP = "}";
	public static final String LEFT_REG_WRAP = "\\{";
	public static final String RIGHT_REG_WRAP = "\\}";
	public static <T> String replaceAll(T obj,String formatStr) throws Exception {
		Field[] fields = obj.getClass().getDeclaredFields();
		String retStr = formatStr;
		for(Field field : fields) {
			String fieldName = field.getName();
			if(formatStr.contains(wrapStr(fieldName))) {
				PropertyDescriptor pd = new PropertyDescriptor(fieldName, obj.getClass());
				Object value = pd.getReadMethod().invoke(obj);
				retStr = retStr.replaceAll(wrapRegStr(fieldName), value.toString());
			}
		}
		return retStr;
	}
	public static String wrapStr(String origin){
		return LEFT_WRAP + origin + RIGHT_WRAP;
	}
	public static String wrapRegStr(String origin){
		return LEFT_REG_WRAP + origin + RIGHT_REG_WRAP;
	}
}
