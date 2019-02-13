package Class;

public class demo1 {
	public void show() {
		System.out.println("父类显示方法");
	}
	class demo2 extends demo1
	{
		public void show() {
			System.out.println("子类输出");
		}
	}
}
