//Retry Of First Attempt
import java.util.Random;

public class DoubleArray {

	public static void main(String[] args) {
		
		int average = 0;
		int minVal = 0;
		int maxVal = 100;
		int[][] students = new int[4][6]; // Making Variables
		
		Random random = new Random(); // Initializing Imports
		
		for(int count1 = 0; count1 < students.length; count1++) {
			for(int count2 = 0; count2 < students[count1].length; count2++) {
				students[count1][count2] = minVal + random.nextInt(maxVal - minVal) + 1;
			}
		}
		display(students);
		average = AvgCalc(students);
		System.out.println("The average of all the students is: " + average);
	}
	
	public static int AvgCalc(int students[][]) {
		
		int sum = 0;
		int total = 0;
		int average;
		
		for(int count1 = 0; count1 < students.length; count1++) {
			for(int count2 = 0; count2 < students[count1].length; count2++) {
				sum += students[count1][count2];
				total ++;
			}
	 }
		average = sum / total;
		return average;
	}
	
	public static void display(int students[][]) {
		
		for(int count1 = 0; count1 < students.length; count1++) {
			for(int count2 = 0; count2 < students[count1].length; count2++) {
				System.out.print(students[count1][count2] + "\t" );
			}
			System.out.println();
		}
	}

}
