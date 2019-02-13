package Reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class demo9 {
	 public void staticMethod() {
		 System.out.println("hello world");
	 }
	 public int publicMethod(int i) throws
		 NumberFormatException{
			 return 2*i;
		 }
	 protected float protectedMethod(float f,int i) {
		 return f+i;
	 }
	 private String privateMethod(String...str) {
		 return str[0];
	 }
	 public static void main(String[] args) {
		Class c=null;
		c=demo9.class;
		Method method[]=c.getDeclaredMethods();
		for(int i=0;i<method.length;i++) {
			System.out.println("方法名称"+method[i].getName());
			int mod=method[i].getModifiers();
			System.out.println("访问修饰符"+Modifier.toString(mod));
			Class returntype=method[i].getReturnType();
			System.out.println("返回至类型"+returntype.getName());
			System.out.println("方法是否为可变参数"+method[i].isVarArgs());
			System.out.println("方法参数类型：");
			Class<?>[] cParaments=method[i].getParameterTypes();
			for(int k=0;k<cParaments.length;k++)
				System.out.print(cParaments[i].getName()+"  ");
			System.out.println("抛出的异常类型");
			Class cException[]=method[i].getExceptionTypes();
			for(int k=0;k<cException.length;k++)
				System.out.print(cException[k].getTypeName()+"  ");
			System.out.println("----------");
		}
	}
}
