package BasicAND_MathAlgorithm;

public class PowerOfNumber {

	public static void main(String[] args) {
	 int num=16;
	 
	 int ans =powerOfnum(num);
	System.out.println(ans);
	}

	private static int powerOfnum(int N) {
	     if (N == 1) {
	           return 1;
	       }
	       for (int i = 1; i < N; i++) {
	           int power = 1;
	           for (int j = 1; j < N; j++) {
	               power=power* i;
	               if (power == N) {
	                   return 1;
	               }
	               if (power > N) {
	                   break;
	               }
	           }
	       }
	       return 0;
	}

}
