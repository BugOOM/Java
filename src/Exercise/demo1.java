package Exercise;

public class demo1 {
	public void tell() {
		System.out.println("父类tell方法");
	}
	private int i=1;
	public void print() {
		tell();
		System.out.println(i);
	}
	public static void main(String[] args) {
		new demo2().print();
	}
}
class demo2 extends demo1{
	private int i=2;
	public void tell() {
		System.out.println("子类tell方法");
	}
	
}
