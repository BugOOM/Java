package THREAD;

public class SetFood implements Runnable{
	private Food Food;
	public SetFood(Food Food) {
		this.Food=Food;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int number=1;number<5;number++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			Food.setFood(number);
		}
		
	}

}
