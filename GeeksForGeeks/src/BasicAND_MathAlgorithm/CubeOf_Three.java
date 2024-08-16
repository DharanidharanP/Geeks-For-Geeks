package BasicAND_MathAlgorithm;

import java.util.Scanner;

public class CubeOf_Three {

	public static void main(String[] args) {
		System.out.println("Enter Number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ans = isPowerOfThree(n);
		System.out.println(ans);
		if (n <= 0) {

		}

	}

	private static boolean isPowerOfThree(int n) {
		if (n <= 0) {
			return false;
		}
		while (n > 0) {
			if (n == 1) {
				return true;

			}
			if (n % 3 != 0) {
				break;
				
			}
			n = n / 3;
		}
		return false;
	}

}
