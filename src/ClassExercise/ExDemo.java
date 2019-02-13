package ClassExercise;

public class ExDemo {
		public static void main(String[] args) {
			// TODO 自动生成的方法存根
			int[] arr= {1,3,5,7,9,2,4,6,8};
			int max=getMax(arr);
			System.out.println(max);
		}
		public static int getMax(int[] array) {
			int max=0;
			for(int i=0;i<array.length;i++) {
				if(array[i]>array[max])
					max=i;
			}
			return max;

		}
}
