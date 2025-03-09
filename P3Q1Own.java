import java.util.Scanner;

public class P3Q1Own{

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of quiz score to process:");
		int No_quiz = scan.nextInt();
		
		int sum = 0;
		int QuizScore [] = new int[No_quiz];  // Create an array to store number of quiz score from input
		
		for (int i=0; i < No_quiz; i++){
			System.out.print("Score " + (i + 1) + " : ");
			QuizScore[i] = scan.nextInt();
			sum += QuizScore[i];
		}
		
		double average = (double) sum/No_quiz;
		int aboveAverage = 0; 
		int belowAverage = 0;
			
		for (int eachScore : QuizScore){
		
			if (eachScore >= average){
				aboveAverage++;
				
			}else{
				belowAverage++; 
			}
		}
		
		System.out.println("\n========");
		System.out.println("Results");
		System.out.println("========");
		System.out.println("Average is " + average);
		System.out.println("Number of score above or equal to the average is " + aboveAverage);
		System.out.println("NUmber of score below the average is " + belowAverage);

		
		
	}
}