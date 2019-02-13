package IO;
//查看哪一个目录下所有以***结尾的文件
import java.io.File;
import java.io.IOException;

public class FILE {

	public static void main(String[] args) throws IOException {
		File f=new File("E:\\JAVAWEB");
		
		method(f);
		
	}
	private static void method(File file) {
		// TODO 自动生成的方法存根
		File[] files=file.listFiles();
		for(File f:files) {
			if(f.isFile()) {
				if(f.getName().endsWith(".avi"))
					System.out.println(f.getName());
			}
			else {
				method(f);
			}
		}
	}
	
}
