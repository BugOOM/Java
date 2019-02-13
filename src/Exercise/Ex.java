package Exercise;
public class Ex {
	private String courseName;
	private int[][] grades;
	public Ex(String name,int[][] gradesArray) {
		courseName=name;
		grades=gradesArray;
	}
	public void setCoureseName(String name) {
		courseName=name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void displayGrades() {
		System.out.println("welcome to the grades book for"+getCourseName());
	}
	public void processGrades() {
		outputGrades();
		System.out.println("lowest grade is "+getMinimum()+"   the highest grade is  "+getMaxmum());
		outputBarChart();
	}
	private void outputBarChart() {
		// TODO 自动生成的方法存根
		System.out.println("overall grade distribution");
		int[] frequence=new int[11];
		for(int studentGrades[]:grades) {
			for(int grade:studentGrades) {
				++frequence[grade/10];
			}
		}
		for(int count=0;count<frequence.length;count++) {
			if(count==10)
				System.out.printf("%5d:",100);
			else
				System.out.printf("%02d-%02d",count * 10,count * 10+9);
			for(int stars=0;stars<frequence[count];stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private int getMaxmum() {
		// TODO 自动生成的方法存根
		int highGrade=grades[0][0];
		for(int studentGrades[]:grades) {
			for(int grade:studentGrades) {
				if(grade>highGrade)
					highGrade=grade;
			}
		}
		return highGrade;
	}
	private int getMinimum() {
		// TODO 自动生成的方法存根
		int lowGrade=grades[0][0];
		for(int studentGrades[]:grades) {
			for(int grade:studentGrades) {
				if(grade<lowGrade)
					lowGrade=grade;
			}
		}
		return lowGrade;
	}
	private void outputGrades() {
		// TODO 自动生成的方法存根
		System.out.println("the grades are");
		System.out.println("      ");
		for(int test=0;test<grades[0].length;test++) {
			System.out.printf("test  %d",test+1);
		}
		System.out.println("average");
		for(int student=0;student<grades.length;student++) {
			System.out.printf("student  %d",student+1);
			for(int test:grades[student])
				System.out.printf("%8d",test);
			double average=getAverage(grades[student]);
			System.out.printf("%9.2f\n",average);
		}
	}
	public double getAverage(int[] setOfGrades) {
		int total=0;
		for(int grade:setOfGrades) 
			total+=grade;
		return (double)total/setOfGrades.length;
	}
} 