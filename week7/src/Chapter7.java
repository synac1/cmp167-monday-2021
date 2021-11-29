import java.util.Arrays;

/**
 * 
 * @author Yanilda
 *
 **/
public class Chapter7 {
	public static void main(String[] args) {
		//Defining arrays
		int [] numbers = new int [10]; 
		String []  words = {"Lina", "Pavol", "Peter", "Ester", "Jonh"};
		char [] letters = new char[] {'a', 'b', 'c', 'd'};
		
		//Insertimg the following follows to the first two  indexes of the array 
		numbers[0] = 134;
		numbers[1] = 258;
		System.out.println(Arrays.toString(numbers));
		
		//Concateniting String value Farakka to all element of array
		for (int i =0 ; i < words.length ; i++) {
			words[i] += " Farakka";
		}
		System.out.println(Arrays.toString(words));
		
		//Turning an array of characters into a String object
		String name = new String (letters);
		System.out.println(name);
		
		//Calling the sumAll method
		int result = sumAll(numbers);
		System.out.println("Sum of all numbers in array numbers is"+result);
	}
	
	//Calculate the sum of all numbers in an array
	public static int sumAll(int[] nums) {
		int sum =0;
		for(int i =0 ; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
}
