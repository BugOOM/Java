package Reflect;

import java.lang.reflect.Field;

public class demo7 {
	private int num=100;
	public long l=123L;
	protected boolean b=true;
	String str="JAVA";
	public static void main(String[] args) {
		Class c=null;
		c=demo7.class;
		Field field[]=c.getDeclaredFields();
		for(int i=0;i<field.length;i++) {
			field[i].setAccessible(true);
			System.out.println("成员属性名称"+field[i].getName());
			System.out.println("成员属性类型"+field[i].getType());
			try {
				System.out.println("成员属性的值"+field[i].get(c.newInstance()));
			} catch (IllegalArgumentException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("_____________");
		}
	}
}
