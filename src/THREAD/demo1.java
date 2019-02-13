package THREAD;

public class demo1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("当前运行的是"+getName()+"   "+i);
			setPriority(10);
		}
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		demo1 d1=new demo1();
		d1.setName("线程1");
		d1.start();
		System.out.println(4);
	}

}
