package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//readline()方法不读换行符
public class Demo {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw=new BufferedWriter(new FileWriter("d:\\Demo1.txt"));
		BufferedReader br=new BufferedReader(new FileReader("d:\\Demo.txt"));
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
		}
		
}
