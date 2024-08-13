package BasicAND_MathAlgorithm;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		int n = 153;
		int sum = 0;
		int noOfDigit = String.valueOf(n).length();
		System.out.println(noOfDigit);
		while (n != 0) {
			int pow = 1;
			int rem = n % 10;
			for (int i = 0; i < noOfDigit; i++) {
				pow = pow * rem;
				System.out.println("i =  "+i+ "  pow ="+pow);
			}
			sum=sum+pow;
			n=n/10;
		}
		System.out.println(sum);
	}

}
