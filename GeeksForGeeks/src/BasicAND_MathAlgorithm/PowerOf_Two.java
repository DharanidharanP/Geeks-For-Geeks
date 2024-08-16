package BasicAND_MathAlgorithm;

public class PowerOf_Two {

	public static void main(String[] args) {
		int n=16;
		boolean ans =isPowerOfTwo(n);
		System.out.println(ans);
		
	}

	private static boolean isPowerOfTwo(int n) {
		 if(n<=0){
	            return false ;
	        }
		 if(n<=0){
	            return false ;
	        }
	        while(n>0){
	            if(n==1){
	                return true;
	            }
	            if(n%2!=0){
	                break;
	            }
	             n=n/2;
	        }
	        return false;
	    }
}
