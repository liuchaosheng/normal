/*
copyright 
*/

package club.zylearn.view;

import java.util.Map;

// ������ͼ�Ľӿ�
public interface View{
	public static final String DET = "**********************";
	// ʹ�ô��������ģ�ͽ�����Ⱦ
	public void render(Map<String,Object> model);
}