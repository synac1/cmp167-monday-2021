
import java.util.Scanner;


public class Review {
	
	//Write a public static method name productAll that takes in 2 arguments int a, int b, and returns the product of all values between those two numbers inclusive.
	//Remember a can be less than b, b might be less than a, or they may be equal. They can also be positive or negative.
	public static int productAll(int a, int b) {
		int prod = 1;
		for(int i = a; i <=b; i++) {
			prod *= i ;
		}
		return prod;
	}
	public static int productAll1(int a, int b) {
		int prod = 1;
	
		int min = Math.min(a, b);
		int max = Math.max(a, b);
	
		for(int i = min; i <=max; i++) {
			prod *= i ;
		}
		return prod;
	}
	public static int productAll2(int a, int b) {
		int prod = 1;
		if (a < b ) {
			for( int i = a; i<=b; i++  ) {
				prod *=i;
			}
		}else {
			for( int i = b; i<=a; i++  ) {
				prod *=i;
			}
		}
		return prod;
	}
	
	//Write a method that replaces the last character of a string literal with a given character c
	public static String replaceLast(String a, char b) {
		char last = a.charAt(a.length()-1);
		String newWord = a.replace(last, b);
		return newWord;
	}
	public static String replace (String s, char c) {
		return s.substring(0, s.length()-1)+c;
	}
	public static void replaceLastChar(String s, char c) {
		s= s.substring(0, s.length()-1)+c;
		System.out.println(s);
	}
	
	
	//Write a method that will translate Abbreviations, where the parameter is a String  and do not return, just display the message
	// LOL is passed as argument, the method should display message "LOL means laughing out loud", if the abbv is unknown, display the message
	public static void translate( String abbv) {
		String meaning ;
		
		if(abbv.equalsIgnoreCase("LOL")) {
			meaning = " is Laughing Out Loud";
		}else if( abbv.equalsIgnoreCase("APT")) {
			meaning = " is Apartment";
		}else {
			meaning = " is an unknown abbv ";
		}
		
		System.out.println(abbv +" " + meaning);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//System.out.println("Enter an abbreviation: ");
		//String abbv = input.next();
		//translate(abbv);
		
		/*
		 * String word = "man"; String newWord = replaceLast(word, 'p');
		 * System.out.println(newWord); String word1 = replace(word, 't');
		 * System.out.println(word1); replaceLastChar(word, 'x');
		 * System.out.println(word);
		 */
		int result = productAll(5, 10);
		System.out.println("result 1: "+ result);
		result  = productAll1(5, 10);
		System.out.println("result 2: "+ result);
		result  = productAll2(5, 10);
		System.out.println("result 3: "+ result);
	}
	
}
