package THREAD;

public class GetFood implements Runnable{
	private Food Food;
	public GetFood(Food Food) {
		this.Food=Food;
	}
	public void run() {
		// TODO �Զ����ɵķ������
		for(int number=1;number<5;number++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			Food.getFood();
		}
		
	}
}
