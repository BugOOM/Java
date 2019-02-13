package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw=new BufferedWriter(new FileWriter("d:\\bw.txt"));
		BufferedReader br=new BufferedReader(new FileReader("d:\\a.txt"));
			int ch;
			while((ch=br.read())!=-1)
				bw.write((char)ch);
			bw.close();
//		char[] chs=new char[1024];
//		int len;
//		while((len=br.read(chs))!=-1)
//			bw.write(chs,0,len);
//		bw.close();
//		br.close();
	}
}

