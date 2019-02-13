package ClassExercise;

import java.util.Date;
import java.util.Scanner;

public class Ex {
		public static void main(String[] args) {
			new Person().printInfo();
			new Students().printInfo();
		}
}
class Person{
	private String getInfo() {
		return "Person";
	}
	public void printInfo() {
		System.out.println(getInfo());
	}
}
class Students extends Person{
	private String getInfo() {
		return "Student";
	}
	
	
}
