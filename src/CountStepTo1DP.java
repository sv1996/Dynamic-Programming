import java.util.Scanner;

public class CountStepTo1DP {
public static int countStepTo1UsingDP(int n)
{
	int [] steps = new int [n+1];
	for(int i=2; i<=n;i++)
	{
		int count1,count2=Integer.MAX_VALUE;
		int count3=Integer.MAX_VALUE;
		count1=steps[i-1];
		if(i%2==0)
		{
			count2=steps[i/2];
		}
		if(i%3==0){
			count3=steps[i/3];
		}
		steps[i]= 1+Math.min(count1, Math.min(count2, count3));
	}
	return steps[n];
}
	
	
	
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("enter number ");
		 int num =s.nextInt();
		 System.out.println(countStepTo1UsingDP(num));

	}

}
