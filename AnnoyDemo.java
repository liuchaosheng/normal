interface IMessage {
	void print();
}
public class AnnoyDemo{
	public static void main(String args[]){
		// �����ڲ��ֻ࣬���ڷ�������Ч����ÿ�η���ִ��ֻ��ʹ��һ��
		fun(new IMessage(){
			public void print(){
				System.out.println("���������ڲ��࣬���Ǿֲ��ڲ����������ʽ��");
			}
		});
	}
	public static void fun(IMessage msg){
		msg.print();
	}
}