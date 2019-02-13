package Class;


public class demo2 {
	public static void main(String[] args) {
		demo1 d=new demo1();
		demo2 d1=new demo2();
		java.lang.Class<demo1> c1=demo1.class;
		System.out.println(c1.getName());
	}
}
