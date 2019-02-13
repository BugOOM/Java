package IO;
//windows记事本打不开的用字节流，字节流可复制任何文件
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 字节流 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("d:\\sjjg13.PNG");
		FileOutputStream fos=new FileOutputStream("d:\\sjjg.jpg");
		int len;
		byte[] bt=new byte[1024];
		while((len=fis.read(bt))!=-1)
			fos.write(bt,0,len);
		fos.close();
		
	}
}
