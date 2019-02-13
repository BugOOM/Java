package Reflect;

public class demo1 {
		public void show() {
			System.out.println("父类显示方法");
		}
		public static void main(String[] args) {
			demo1 d=new demo1();
			Demo d1=new Demo();
			Class c1=d.getClass();
			Class c2=d1.getClass();
			System.out.println(c1.getName());
			System.out.println(c2.getName());
		}
}
class Demo extends demo1
{
	public void show() {
		System.out.println("子类输出");
	}
}
