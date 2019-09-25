package club.zylearn.maindemo;


class Demo{
	private static int sum = 0;
	public static void func(int n){
		if(n == 1){
			sum += 1;
		}else{
			sum += n;
			func(n-1);
		}
	}
	public static int getSum() {
		return Demo.sum;
	}
}

public class Demo2 {
	public static void main(String[] args) {
		Demo.func(100);
		System.out.println(Demo.getSum());
	}
}
