import java.util.*;
public class CountBalanceBTs {
public static int countBalancedBTs(int h)
{
	int mod= (int)Math.pow(10,9) +7;
	return countBalancedBTsHelper(h , mod);
	
}
public static int countBalancedBTsHelper(int h ,int  mod){
	if(h==0 ||  h==1){
		return 1;
	}
int x=	countBalancedBTs(h-1);
int y = countBalancedBTs(h-2);
long res1=(long)x *x;
long res2=(long)x*y*2;
int value1 = (int)(res1% mod);
int value2=(int)(res2%mod);
return (value1+value2)%mod;
}
	
	
	
	public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   int h= s.nextInt();
System.out.print(countBalancedBTs(h));




	}

}
