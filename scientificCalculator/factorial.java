import package scientificCalculator;
import java.util.Scanner;
class factorial{
	
	/*public static void main(String[] args){
		int n ;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(factorial(n));
	}*/
	public static int factorial (int a)
    {
         if(a == 1 || a == 0 )
         {
             return 1;
         }
         else if(a < 0)
          {
  		return 0;
 	}
	else   
             return a * factorial(a-1);
    }
}