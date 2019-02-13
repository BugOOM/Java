package Reflect;

public class demo2 {
	static {
		System.out.println("静态代码块");
	}
	public static void main(String[] args) {
		Class c=null;
		try {
			c=Class.forName("Reflect.demo2");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(c.getName());
	}
}
