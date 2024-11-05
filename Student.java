package activities;
import java.util.Scanner;

public class Student {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of five subjects:/n");
		
		// To store the values of five subjects
		float sub_1 = sc.nextFloat();
		float sub_2 = sc.nextFloat();
		float sub_3 = sc.nextFloat();
		float sub_4 = sc.nextFloat();
		float sub_5 = sc.nextFloat();
		
		// take avg total,percentage,grade variables
		float total;
		float average;
		float percentage;
		char  grade;
		
		// calculate the total,avg,percentage
		total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
		average = (float) (total/5.0);
		percentage = (float) ((total / 500.0)*100);
		
		// calculate the grade
		if(average >= 90)
			grade = 'A';
		else if(average >=80 && average < 90)
			grade  = 'B';
		else if(average >=70 && average < 80)
			grade = 'C';
		else if(average >=60 && average < 70)
			grade = 'D';
		else 
			grade = 'E';
		
		// print the calculation
		System.out.println("\nTotal marks ="+ total + "/500.0");
		System.out.println("\nThe average ="+ average);
		System.out.println("\nThe percentage ="+ percentage + "%");
		System.out.println("\nThe grade="+ grade + "''");
		
	}
	

}
