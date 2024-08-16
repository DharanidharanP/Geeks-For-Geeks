package BasicAND_MathAlgorithm;

import java.util.Scanner;

public class Add_String {
	public static void main(String[] args) {
		System.out.println("Enter Number :");
		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		
		String ans = addStrings(num1,num2);
		System.out.println(ans);
	}

	private static String addStrings(String num1, String num2) {
		
		   int n1=Integer.parseInt(num1);
	        int n2=Integer.parseInt(num2);
	        int rev=0;
	        
	        System.out.println("rev... ="+rev);
	        int sum=0;
	        sum=rev+n2;
	      return Integer.toString(sum);
	    
	}
}
