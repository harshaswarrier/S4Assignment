package scientificCalculator;
import java.util.*;
import java.io.*;
public class Hexadecimal
	{
		public static void main(String args[]) 
    { 
		int n,d,bin,o;
		int[] hex = new int[1000];
		int i = 1, j = 0, rem, dec = 0;
		String octnum, hexnum;
        int decnum;
		Scanner input=new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
        System.out.println("\n\tHexadecimal Convertor"); 
		System.out.println("\t----------- ---------");
		System.out.print("	1. Decimal to Hexadecimal\n	2. Binary to Hexadecimal\n	3. Octal to Hexadecimal\n 	Enter Your Choice : ");
		n=input.nextInt();
		switch(n) {
					case 1 :System.out.print("\tEnter a Decimal Number :"); 
							d=input.nextInt();
							String str;
                            str=new String(Integer.toHexString(d));
							System.out.print("\tHexadecimal Number is :");
                            System.out.print(str);
							break;
   
					case 2 :System.out.print("\tEnter a Binary Number :"); 
							bin=input.nextInt();
							int r = 0, c = 0, num, b;
							num = bin;
							int firstDigit = Integer.parseInt(Integer.toString(num).substring(0, 1));
							if (firstDigit>0||firstDigit==1 ){
							while (num > 0) {
							if ((num % 10 == 0) || (num % 10 == 1))
							c++;
							r++;
							num = num / 10;
							}
							}
							if (c == r)
							{
							while (bin > 0) {
							rem = bin % 2;
							dec = dec + rem * i;
							i = i * 2;
							bin = bin / 10;
							}
							i = 0;
							while (dec != 0) {
							hex[i] = dec % 16;
							dec = dec / 16;
							i++;
							}
							System.out.print("\tHexaDecimal value: ");
							for (j = i - 1; j >= 0; j--)
							{
							if (hex[j] > 9) 
							{
							System.out.print((char)(hex[j] + 55));
							} else
							{
							System.out.print(hex[j]);
							}
							}
							}
							else
							{
								System.out.print("\tThe Entered Number is not a Binary Number ");
							}
							break;
					
					case 3 :System.out.print("\tEnter a Octal Number : "); 
							octnum = scan.nextLine();
							Scanner ip = new Scanner(System.in);
							int no,mod1,mod2,mod3,diff1,diff2,diff3,num1,num2,num3;
							no= Integer.parseInt(octnum);
							mod1=no%10;
							mod2=no%100;
							mod3=no%1000;
							diff1=no-mod1;
							diff2=no-mod2;
							diff3=no-mod3;
							num1=diff1/10;
							num2=diff2/100;
							num3=diff3/1000;
							if(no==8||no==9||mod1==8||mod1==9||mod2==8||mod2==9||mod3==8||mod3==9||num1==8||num1==9||num2==8||num2==9||num3==8||num3==9)
							{								
							 System.out.println("\tThe Entered Number is not Octal Number ");
							}
							else
							{
							decnum = Integer.parseInt(octnum, 8);
							hexnum = Integer.toHexString(decnum);
							System.out.print("\tEquivalent Hexadecimal Value of " + octnum + " is : ");
							System.out.print(hexnum);
							}
							break;
					
					default :System.out.print("\t------ Invalid Choice !! -------");
					
				  }
    } 
	}