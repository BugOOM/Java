package IO;

import java.io.Serializable;

public class student implements Serializable {
	String name;
	int age;
	student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+"  "+age;
	}
}
