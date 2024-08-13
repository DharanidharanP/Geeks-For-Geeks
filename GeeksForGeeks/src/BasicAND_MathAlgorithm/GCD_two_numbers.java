package BasicAND_MathAlgorithm;

public class GCD_two_numbers {

	public static void main(String[] args) {
		
		
		int a=24;
		int b=4;
		int ans =GCDtwonumberMethod(a,b);
		System.out.println(ans);
	}

	private static int GCDtwonumberMethod(int a, int b) {
		while(a!=b) {
			if(a>b) {
				System.out.println("if ...");
				a=a-b;
				System.out.println("a....= "+a);
			}else {
				b=b-a;
				System.out.println("b...= "+b);
			}
		}
		return a;
	}

}
