package THREAD;

public class ThreaD implements Runnable{
	int tickets=100;
	Object obj=new Object();
	public void run() {
		while(true) {
			synchronized (obj) {
		 if(tickets>0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			 System.out.println(Thread.currentThread().getName()+"---"+tickets--);
		 
		}
		}
		 
	}
	}
}
