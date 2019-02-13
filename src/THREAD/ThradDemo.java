package THREAD;

public class ThradDemo {
	public static void main(String[] args) {
		ThreaD t=new ThreaD();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		t1.setName("´°¿Ú1");
		t2.setName("´°¿Ú2");
		t3.setName("´°¿Ú3");
		t1.start();
		t2.start();
		t3.start();
	}
}
