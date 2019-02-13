package Reflect;

public class demo6 extends demo5 implements jiekou{

	@Override
	public void tell() {
		// TODO 自动生成的方法存根
		System.out.println("我继承自demo5，实现jiekou接口");
	}
	public static void main(String[] args) {
		Class c[]=null;
		Class c2=null;
		c2=demo6.class;
		c=demo6.class.getInterfaces();
		for(Class c1:c) {
			System.out.println("实现的接口"+c1.getName());
		}
		System.out.println("继承的父类"+c2.getSuperclass().getName());
	}

}
