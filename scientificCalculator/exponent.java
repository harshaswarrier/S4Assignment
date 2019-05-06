package scientificCalculator;
import java.util.Scanner;
public class exponent
{     
    static double e=2.718281828;
    public static double function()
    {
        Scanner a=new Scanner(System.in);
        int number=a.nextInt();
        return java.lang.Math.pow(e,number);
    }
}