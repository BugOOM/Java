package IO;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class objectoutputstream {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		/*ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d:\\l.txt"));
		student s=new student("ptq",20);
		student s1=new student("dzy",20);
		oos.writeObject(s);
		oos.writeObject(s1);*/
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:\\l.txt"));
		try {
			while(true) {
			Object o=ois.readObject();
			System.out.println(o);
			}
		}
		catch(EOFException e) {
			System.out.println("∂¡»°ÕÍ±œ");
		}
	}
}
