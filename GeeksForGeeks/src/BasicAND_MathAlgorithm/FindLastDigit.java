package BasicAND_MathAlgorithm;

public class FindLastDigit {

	public static void main(String[] args) {
	
		int a =2;
		int b=5;
		int sum=1;
		for(int i=0;i<=b;i++) {
			sum=sum*a;
		}
		int rem=sum%10;
		System.out.println(rem);
	}
}
