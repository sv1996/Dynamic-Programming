import java.util.*;
public class MinCountSquare {
	//int[] storage=  new int[n+1];
	public static int minCount(int n) {
		// Write your code here
	int[] storage=  new int[n+1];
		return minCountDp(n,storage);
	}
	public static int  minCountDp(int n, int[] storage) {
		if(n  <= 3) {
			storage[n] = n;
			return storage[n];
		}
		if(storage[n] != 0) {
			return storage[n];
		}
		int temp = 0;
		 int toResult = n;
	      	for(int i = 1; i <= Math.sqrt(n); i++){
	          temp = i*i;
	         
	            toResult = Math.min(toResult, minCountDp(n-temp, storage));
	          }
	        
	      storage[n] =  1+toResult;
	      return storage[n];
	}
	

	
	
	
	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int n= s.nextInt();
     System.out.print(minCount(n));
		
		
		
	}

}
