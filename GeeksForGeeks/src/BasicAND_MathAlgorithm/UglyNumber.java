package BasicAND_MathAlgorithm;

import java.util.Scanner;

public class UglyNumber {

	public static void main(String[] args) {
		System.out.println("Enter Number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ans = isUglyNumber(n);
		System.out.println(ans);
	}

	private static boolean isUglyNumber(int n) {
		if(n<=0) {
			return false;
		}
		int [] arr= {2,3,5};
		for(int i=0;i<arr.length;i++) {
		while(n%arr[i]==0) {
			n=n/arr[i];
			System.out.println("n..= "+n);
		}
		}
		return n==1;
	}

}
