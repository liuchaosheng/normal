/*
copyright 
*/

package club.zylearn.view;

import java.util.Map;

// 关于视图的接口
public interface View{
	public static final String DET = "**********************";
	// 使用传入的数据模型进行渲染
	public void render(Map<String,Object> model);
}