package Reflect;

import java.lang.reflect.Field;

public class demo8 {
	private int num=100;
	public long l=123L;
	protected boolean b=true;
	String str="JAVA";
	public String toString() {
		return "num="+num+"  l="+l+"  b="+b+"  str="+str;
	}
	public static void main(String[] args) {
		Class c=null;
		demo8 d=null;
		c=demo8.class;
		try {
			d=(demo8)c.newInstance();
		} catch (InstantiationException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		Field field[]=c.getDeclaredFields();
		for(int i=0;i<field.length;i++) {
			field[i].setAccessible(true);
			Class fieldType=field[i].getType();
			System.out.println("成员属性名称"+field[i].getName());
			System.out.println("成员属性类型"+fieldType);
			try {
				System.out.println("成员属性的值"+field[i].get(d));
				if(fieldType.equals(int.class)) {
					System.out.println("修改后属性内容:");
					field[i].set(d, 500);
					System.out.println("修改后"+field[i].get(d));
				}
				if(fieldType.equals(boolean.class)) {
					System.out.println("修改后属性内容:");
					field[i].set(d, false);
					System.out.println("修改后"+field[i].get(d));
				}
				if(fieldType.equals(long.class)) {
					System.out.println("修改后属性内容:");
					field[i].set(d, 321L);
					System.out.println("修改后"+field[i].get(d));
				}
				if(fieldType.equals(String.class)) {
					System.out.println("修改后属性内容:");
					field[i].set(d, "JAVA学习笔记");
					System.out.println("修改后"+field[i].get(d));
				}
			} catch (IllegalArgumentException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
