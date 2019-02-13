package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class inputstream {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("d:\\a.txt"));
//		OutputStream ou=System.out;
//		String line;
//		while((line=br.readLine())!=null) {
//			ou.write(line.getBytes());
//			ou.write("\n".getBytes());
//		}
//		ou.close();
//		br.close();
		/*Writer w=new OutputStreamWriter(System.out);
		String line;
		while((line=br.readLine())!=null) {
			w.write(line);
			w.write("\r\n");
		}
		w.close();
		br.close();*/
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
		}
		bw.close();
		br.close();
	}
	
}
