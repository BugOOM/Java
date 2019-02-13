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
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		number=n;
		System.out.println("����"+this.food+"��"+this.number+"����");
		notify();
	}
	public synchronized void getFood() {
		if(this.number==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		System.out.println("ȡ��"+this.food+"��"+this.number+"����");
		number=0;
		notify();
	}
	public static void main(String[] args) {
		Food f=new Food("����",0);
		new Thread(new SetFood(f)).start();
		new Thread(new GetFood(f)).start();
	}
}
