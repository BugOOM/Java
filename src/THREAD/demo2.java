package THREAD;

import java.util.Date;

public class demo2 implements Runnable{
	private int ticket=100;
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(ticket>0) {
			synchronized(this) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"�����˵�"+ticket--+"��Ʊ"+"  ʱ��     "+new Date());
		}
		}
	}
	public static void main(String[] args) {
		demo2 d=new demo2();
		Thread t1=new Thread(d,"����1");
		Thread t2=new Thread(d,"����2");
		t1.start();
		t2.start();
	}

}
