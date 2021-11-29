import java.util.Scanner;

/**
 * 
 * @author yanil_jjrab3j
 *
 */

public class Chapter6 {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Let's print numbers from start to end!");
		System.out.println("Please enter int number  for start and the int number for end");
		int x = input.nextInt();
		int y = input.nextInt();
		printAll(x, y);
		
		System.out.println("Let's add two numbers now!");
		System.out.println("Enter the two numbers");
		int a = input.nextInt();
		int b = input.nextInt();
		int result = sumTwo(a, b);
		System.out.println("Result "+ result);
		
		System.out.println("Good bye");
		input.close();
	}
	
	
	//sum of two numbers
	public static int  sumTwo(int a, int b) {
		return a+b;
	}
	
	//all numbers from start to end
	public static void  printAll(int start, int end) {
		while( start <= end ) {
			System.out.println(start);
			start++;
		}
	}
	
	
}
