package Exercise;

import javax.swing.plaf.synth.SynthStyle;

public class ExDemo {
	public static void main(String[] args) {
		int[][] gradesArray= {{93,32,76},{76,84,37},
				{36,96,58},{57,85,64},{87,57,68},{56,76,59},
				{100,56,86},{46,76,58},{57,87,56},{57,86,55}};
		Ex mygradeBook=new Ex("java≥Ã–Ú…Ëº∆",gradesArray);
		mygradeBook.displayGrades();
		mygradeBook.processGrades();
//		for(int studentGrades[]:gradesArray) {
//			for(int grade:studentGrades) {
//				System.out.println(grade/10);;
//			}
//		}

		}

}
