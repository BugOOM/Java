package Exercise;

public class demo1 {
	public void tell() {
		System.out.println("����tell����");
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
		System.out.println("����tell����");
	}
	
}
