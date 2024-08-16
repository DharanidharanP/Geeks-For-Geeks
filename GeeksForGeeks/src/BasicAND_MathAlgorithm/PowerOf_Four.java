package BasicAND_MathAlgorithm;

import java.util.Scanner;

public class PowerOf_Four {

	public static void main(String[] args) {
		System.out.println("Please Enter Number :");
	Scanner sc=new Scanner(System.in); 
	int n=sc.nextInt();
	boolean ans =isPowerOfFour(n);
	System.out.println(ans);
	}

	private static boolean isPowerOfFour(int n) {
		if(n<=0) {
			return false;
		}
		while(n>0) {
			if(n==1) {
				return true;
			}
			if(n%4!=0) {
				break;
			}
			n=n/4;
		}
		return false;
	}

}
