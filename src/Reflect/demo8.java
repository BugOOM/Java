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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		Field field[]=c.getDeclaredFields();
		for(int i=0;i<field.length;i++) {
			field[i].setAccessible(true);
			Class fieldType=field[i].getType();
			System.out.println("��Ա��������"+field[i].getName());
			System.out.println("��Ա��������"+fieldType);
			try {
				System.out.println("��Ա���Ե�ֵ"+field[i].get(d));
				if(fieldType.equals(int.class)) {
					System.out.println("�޸ĺ���������:");
					field[i].set(d, 500);
					System.out.println("�޸ĺ�"+field[i].get(d));
				}
				if(fieldType.equals(boolean.class)) {
					System.out.println("�޸ĺ���������:");
					field[i].set(d, false);
					System.out.println("�޸ĺ�"+field[i].get(d));
				}
				if(fieldType.equals(long.class)) {
					System.out.println("�޸ĺ���������:");
					field[i].set(d, 321L);
					System.out.println("�޸ĺ�"+field[i].get(d));
				}
				if(fieldType.equals(String.class)) {
					System.out.println("�޸ĺ���������:");
					field[i].set(d, "JAVAѧϰ�ʼ�");
					System.out.println("�޸ĺ�"+field[i].get(d));
				}
			} catch (IllegalArgumentException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}
