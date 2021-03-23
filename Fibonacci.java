public class Fibonacci{
	public static int fibonacci(int n){
		return	n<=2?1:fibonacci(n-1)+fibonacci(n-2);	
	}

	public static void main(String[] args)
	{
		int n = 12;
		System.out.println("The Fibonacci of " + n + " is " + fibonacci(n)); 
	}
	 
}
