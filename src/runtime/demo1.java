package runtime;

import java.io.IOException;

public class demo1 {
	public static void main(String[] args) {
		Runtime rt=Runtime.getRuntime();
		System.out.println("JVM处理器的数目"+rt.availableProcessors());
		Process pr=null;
		try {
			pr=rt.exec("calc.exe");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		pr.destroy();
	}
}
