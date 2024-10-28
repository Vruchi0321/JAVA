package variables;
import java.util.Scanner;
public class Calculate_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the side of the lenght:");
		float a=sc.nextFloat();
		float x= a*a;
		float y= 4*a;
		System.out.println("\nArea = " +x);
		System.out.println("\nPerimeter = " +y);
		

	}

}
