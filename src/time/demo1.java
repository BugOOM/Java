package time;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;

public class demo1 {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("qwer");
		array.add("asdf");
		array.add("zxc");
		array.add("uiop");
		Iterator it=array.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		Collections.reverse(array);
		it=array.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		Collections.sort(array);
		System.out.println(Collections.binarySearch(array, "zxc"));
		
		
		
	}
}
