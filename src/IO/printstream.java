package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class printstream {
	public static void main(String[] args) throws IOException {
		PrintWriter ps=new PrintWriter(new FileWriter("D:\\m.txt"),true);
		BufferedReader br=new BufferedReader(new FileReader("d:\\Stu.txt"));
		String line;
		while((line=br.readLine())!=null) {
			ps.println(line);
			
		}
		ps.close();
		br.close();
		
	}
}
