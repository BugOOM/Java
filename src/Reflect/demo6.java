package Reflect;

public class demo6 extends demo5 implements jiekou{

	@Override
	public void tell() {
		// TODO �Զ����ɵķ������
		System.out.println("�Ҽ̳���demo5��ʵ��jiekou�ӿ�");
	}
	public static void main(String[] args) {
		Class c[]=null;
		Class c2=null;
		c2=demo6.class;
		c=demo6.class.getInterfaces();
		for(Class c1:c) {
			System.out.println("ʵ�ֵĽӿ�"+c1.getName());
		}
		System.out.println("�̳еĸ���"+c2.getSuperclass().getName());
	}

}
