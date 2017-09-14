package fibonacci;

public class FiboRecurssion {

	private static int fibonacciNumber(int n) {
		
		if (n==1 || n == 2) return 1;
		
		return fibonacciNumber(n -1 ) + fibonacciNumber (n-2);
		
		
	}
	
	private static int   fibonacciNumberIter(int n) {
		
		int a = 0, b = 1;
		
		for(int i =0; i < n; i++ ) {
		
		    a = a + b;
			b = a -b;
			System.out.println(a);	
		}
		return a;
		}
	
	 public static int fibonacci2(int number){
	        if(number == 1 || number == 2){
	            return 1;
	        }
	        int fibo1=1, fibo2=1, fibonacci=1;
	        for(int i= 3; i<= number; i++){
	            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
	            fibo1 = fibo2;
	            fibo2 = fibonacci;
	         System.out.println(fibonacci);
	        }
	        return fibonacci;
	 }
		
	
	
	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		// System.out.println("fibonacci number  ="+ fibonacciNumber (50));
	//	System.out.println("fibonacci number2    ="+ fibonacciNumberIter(55));
		System.out.println(System.currentTimeMillis());

	}
}

