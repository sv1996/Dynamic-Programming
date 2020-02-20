import java.util.Scanner;

public class CountStepTo1 {
public static int countStepTo1(int n)
{
	if(n==1)
	{
		return 0;
	}
	
	int count1=Integer.MAX_VALUE,count2=Integer.MAX_VALUE,count3=Integer.MAX_VALUE;
	count1= countStepTo1(n-1);
	if(n%2==0){
		count2=countStepTo1(n/2);
	}
	if(n%3==0){
		count3=countStepTo1(n/3);
	}
	
	return 1+ Math.min(count1, Math.min(count2, count3));
	
	
}
	
	
	
	
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("enter number ");
		 int num =s.nextInt();
		 System.out.println(countStepTo1(num));

	}

}
