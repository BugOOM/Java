package IO;
//windows���±��򲻿������ֽ������ֽ����ɸ����κ��ļ�
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class �ֽ��� {
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
