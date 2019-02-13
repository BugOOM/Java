package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class demo4 {
	private String name;
	private int age;
	public demo4() {
	}
	public demo4(String name) {
		this.name=name;
	}
	public demo4(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "姓名"+getName()+"年龄"+getAge();
	}
	public static void main(String[] args) {
		Class<?> c=null;
		demo4 d1=null;
		demo4 d=null;
		demo4 d2=null;
		String str=null;
		Constructor<?> c1[]=null;
		c=demo4.class;
		c1=c.getConstructors();
		for(int i=0;i<c1.length;i++) {
			Class cparaments[]=c1[i].getParameterTypes();
			for(int k=0;k<cparaments.length;k++)
				System.out.println(cparaments[k].getName()+"  ");
			System.out.println("-----------");
		}
		System.out.println(c1[0].getParameterTypes());
		System.out.println(c1[1].getParameterTypes());	
		System.out.println(c1[2].getParameterTypes());		
		try {
			d1=(demo4)c1[0].newInstance("小刚",19);
			d=(demo4)c1[2].newInstance();
			d2=(demo4)c1[1].newInstance("小明");
		} catch (InstantiationException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
	}
}
