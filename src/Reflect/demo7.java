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
			System.out.println("��Ա��������"+field[i].getName());
			System.out.println("��Ա��������"+field[i].getType());
			try {
				System.out.println("��Ա���Ե�ֵ"+field[i].get(c.newInstance()));
			} catch (IllegalArgumentException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println("_____________");
		}
	}
}
