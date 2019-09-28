package club.zylearn.maindemo;

import club.zylearn.generic.clazz.ArrayData;

public class MainDemo {
	public static void main(String[] args) {
//		AwireData<Double> awireData = new AwireData<>();
//		awireData.setData(100.0);
//		System.out.println(awireData);
		
		ArrayData<Integer> arrayData1 = new ArrayData<>();
		Integer[] intDatas = new Integer[] {10,30,90,100,2000};
		arrayData1.setDatas(intDatas);
		System.out.println(arrayData1);
		
		ArrayData<Double> arrayData2 = new ArrayData<>();
		Double[] doubleDatas = new Double[] {10.0,30.1,90.3,100.5,2000.1};
		arrayData2.setDatas(doubleDatas);
		System.out.println(arrayData2);
		System.out.println(arrayData1.getClass() == arrayData2.getClass());
		
		
	}
}
