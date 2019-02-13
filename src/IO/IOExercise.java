package IO;
import Stu.Student;
import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.IOException;
public class IOExercise {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("d:\\a.txt");
		FileWriter fw=new FileWriter("d:\\copy1.txt");
//		以数组方式读取
		char[] chs=new char[1024];
		int len;
		while((len=fr.read(chs))!=-1) 
			fw.write(chs,0,len);
		fw.close();
//以字符方式读取
//		int ch;
//		while((ch=fr.read())!=-1)
//			fw.write((char)ch);
//		fw.close();
	}
}


