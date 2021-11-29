
public class Chapter12 {
	public static  int sum (int target) {		
		if (target <= 0) //base case
			return 0;
		else 
			return target + sum(target-1); // recursive code
	}
	public static void main(String[] args) {
		int n = 10;
		int result  =  sum(n);
		System.out.println(result);
	}
	// Write a recursive method that calculates the product of all numbers from 1 to target number
	// Write a recursive method for subtracting
}
