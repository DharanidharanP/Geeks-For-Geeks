package BasicAND_MathAlgorithm;

public class Prime {

	public static void main(String[] args) {
		int N=1;
		
		int ans =isPrime(N);
		System.out.println(N);

	}

	private static int isPrime(int N) {
		 int div=2;
	     int ans=0;
	     if(N==1){
	        	System.out.println("if ...1 ");
	         return 0;  
	       }
	    while(div<N){
	        
	        if(N%div==0){
	           ans=0;
	           break;
	        }else{
	            ans=1;
	        }
	        div++;
	    }
	     return ans;
	}

}
