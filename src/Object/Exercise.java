package Object;

public class Exercise {
	private String name;
	private int age;
		Exercise(String name,int age){
			this.name=name;
			this.age=age;
		}
	public boolean equals(Object o) {
		Exercise other=(Exercise)o;
		if((this.name.equals(other.name))&&this.age==other.age)
			return true;
		else
			return false;
	}
}
