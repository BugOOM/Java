package runtime;

import java.io.IOException;

public class demo1 {
	public static void main(String[] args) {
		Runtime rt=Runtime.getRuntime();
		System.out.println("JVM����������Ŀ"+rt.availableProcessors());
		Process pr=null;
		try {
			pr=rt.exec("calc.exe");
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		pr.destroy();
	}
}
