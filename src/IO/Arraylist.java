package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) throws IOException {
		ArrayList<String> array=new ArrayList<String>();
		/*FileWriter fw=new FileWriter("d:\\fw.txt");
		array.add("qwerty");
		array.add("asdfgh");
		array.add("zxcvbn");
		for(int i=0;i<array.size();i++) {
			fw.write(array.get(i));
			fw.write("\r\n");
			fw.flush();
		}
		fw.close();*/
		BufferedReader br=new BufferedReader(new FileReader("d:\\fw.txt"));
		String line;
		while((line=br.readLine())!=null)
			array.add(line);
		for(int i=0;i<array.size();i++)
			System.out.println(array.get(i));
	}
}
