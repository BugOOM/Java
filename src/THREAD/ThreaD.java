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
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			 System.out.println(Thread.currentThread().getName()+"---"+tickets--);
		 
		}
		}
		 
	}
	}
}
