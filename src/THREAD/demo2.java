package THREAD;

import java.util.Date;

public class demo2 implements Runnable{
	private int ticket=100;
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(ticket>0) {
			synchronized(this) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"卖出了第"+ticket--+"张票"+"  时间     "+new Date());
		}
		}
	}
	public static void main(String[] args) {
		demo2 d=new demo2();
		Thread t1=new Thread(d,"窗口1");
		Thread t2=new Thread(d,"窗口2");
		t1.start();
		t2.start();
	}

}
