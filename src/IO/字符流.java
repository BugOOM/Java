 package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ×Ö·ûÁ÷ {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("D:\\WorkspacesEclipse\\JavaEX\\src\\GUI\\GuiClass.java"));
		Writer w=new OutputStreamWriter(System.out);
		String line;
		while((line=br.readLine())!=null) {
			w.write(line);
			w.write("\r\n");
		}
		w.close();
	}
}
