package scientificCalculator

import java.io.*;
import java.util.*;
public class Main
{
 public static String findfrac() throws IOException
 {
  InputStreamReader read = new InputStreamReader (System.in);
  BufferedReader in = new BufferedReader (read);
  int num,denom;
  num=Integer.parseInt(in.readLine());
  denom=Integer.parseInt(in.readLine());
   int[] a= new int[4];  
   int quotient , remainder;
   quotient = num/denom;
  remainder=num%denom;
  if(num>denom)
  System.out.print((quotient)+" ");
  if(remainder !=0)
  System.out.println((remainder) + "/" + denom);
  String str=" "+((char) quotient)+" " +((char) remainder) + "/" +(char) denom;
return(str);
 }
}