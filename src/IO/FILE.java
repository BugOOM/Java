package IO;
//�鿴��һ��Ŀ¼��������***��β���ļ�
import java.io.File;
import java.io.IOException;

public class FILE {

	public static void main(String[] args) throws IOException {
		File f=new File("E:\\JAVAWEB");
		
		method(f);
		
	}
	private static void method(File file) {
		// TODO �Զ����ɵķ������
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
