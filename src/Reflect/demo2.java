package Reflect;

public class demo2 {
	static {
		System.out.println("��̬�����");
	}
	public static void main(String[] args) {
		Class c=null;
		try {
			c=Class.forName("Reflect.demo2");
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println(c.getName());
	}
}
