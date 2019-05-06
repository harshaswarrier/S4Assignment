package scientificCalculator;
public class exponent
{     
    double e=2.718281828;
    public double power_of_e()
    {
        Scanner a=new Scanner(System.in);
        int number=a.nextInt();
        return java.lang.Math.pow(e,number);
    }
}
