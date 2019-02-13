package THREAD;

public class SetFood implements Runnable{
	private Food Food;
	public SetFood(Food Food) {
		this.Food=Food;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int number=1;number<5;number++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			Food.setFood(number);
		}
		
	}

}
