package BasicAND_MathAlgorithm;

public class CountDigits {

	public static void main(String[] args) {
		int n=3080;
		int ans=evenlyDivides(n);
		System.out.println(ans);
	}

	private static int evenlyDivides(int n) {
		int count =0;
		int num=n;
		while(n>0) {
			int rem=n%10;
			System.out.println("rem..."+rem);
			if (rem != 0 && num % rem == 0) {
                count++;
            }
			n=n/10;
		}
		return count;
	}

}
