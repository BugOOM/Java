package THREAD;

public class Food {
	private int number=0;
	private String food=null;
	public Food(String food,int number) {
		this.food=food;
		this.number=number;
	}
	public synchronized void setFood(int n) {
		if(this.number!=0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		number=n;
		System.out.println("放置"+this.food+"第"+this.number+"批次");
		notify();
	}
	public synchronized void getFood() {
		if(this.number==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		System.out.println("取走"+this.food+"第"+this.number+"批次");
		number=0;
		notify();
	}
	public static void main(String[] args) {
		Food f=new Food("火腿",0);
		new Thread(new SetFood(f)).start();
		new Thread(new GetFood(f)).start();
	}
}
