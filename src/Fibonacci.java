
public class Fibonacci {
	public static int fibonacciDP(int n){
		int storage[] = new int [n+1];
		storage[0]=0;
		storage[1]=1;
		for(int i=2; i<=n ;i++){
			storage[i] =storage[i-1] +storage[i-2];
		}
		return storage[n];
	}
 public static int fibonacci(int n){
	 if(n==0 || n==1){
		 return n;
	 }
	return  fibonacci(n-1) + fibonacci(n-2);
	 
 }
 public static int fibonacciMemorization(int n){
	 int storage[] =new int[n+1];
	 for(int i=0; i <=n ;i++){
		 storage[i]=-1;
	 }
	 return  fibonacciMemorization(n ,storage);
 }
	public static int fibonacciMemorization(int n , int storage[]){
		if(n==0 || n==1){
			storage[n] =n;
			return storage[n];
		}
		if(storage[n]!= -1)
		{
			return storage[n];
		}
		storage[n]=fibonacciMemorization(n-1 , storage) +fibonacciMemorization(n-2, storage);
		return storage[n];
	}
 
	
	
	public static void main(String[] args) {
	 int n=40;
	 System.out.println(fibonacciDP(n));
	 System.out.println(fibonacciMemorization(n));
	 System.out.println( fibonacci(n));

	}

}
