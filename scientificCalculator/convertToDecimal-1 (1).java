import java.io.*;
import java.util.Scanner;
class Decimal
     {
           Scanner in=new Scanner(System.in);
           int binary()
                {  
                   int n=0,decimal=0,octa=-1;
                   System.out.println("Enter the Binary Number : ");
                   int bin=in.nextInt();
                   int t=0;
                   int b=bin;
                   if(b>=0)
                     {
                      while(t==0||t==1&&b!=0)
                        {
                          t=b%10;
                          b=b/10;
                        }
                      }
                   if(b==0)
                        {
                          while(true)
                               {  
                                if(bin == 0)
                                 {  
                                  break;  
                                 }
                                else 
                                 {  
                                  int temp = bin%10;  
                                  decimal += temp*Math.pow(2,n);  
                                  bin = bin/10;  
                                  n++;  
                                 } 
                               } 
                        }
                   else
                      System.out.println("Error");
                   return decimal;
                   }

            int octal()
                {  
                   int n=0,decimal=0,octa=-1;
                   System.out.println("Enter the Octal Number : ");
                   int bin=in.nextInt();
                   int t=0;
                   int b=bin;
                   if(b>=0)
                     {
                      while(t<=8&&b!=0)
                        {
                          t=b%10;
                          b=b/10;
                        }
                      }
                   if(b==0)
                        {
                          while(true)
                               {  
                                if(bin == 0)
                                 {  
                                  break;  
                                 }
                                else 
                                 {  
                                  int temp = bin%10;  
                                  decimal += temp*Math.pow(8,n);  
                                  bin = bin/10;  
                                  n++;  
                                 } 
                               } 
                        }
                   else
                      System.out.println("Error");
                   return decimal;
                   }
           int hexadecimal()
              {
                String hexdec_num="";
                int dec_num=0, k=1;
	        System.out.println("Input a hexadecimal number: ");
                Scanner obj=new Scanner(System.in);
                hexdec_num=obj.nextLine();
                String digits = "0123456789ABCDEF";
                hexdec_num = hexdec_num.toUpperCase();
                for (k = 0; k < hexdec_num.length(); k++)
                   {
                    char cr = hexdec_num.charAt(k);
                    int d = digits.indexOf(cr);
                    dec_num = 16*dec_num + d;
                   }
                return dec_num;
              }
     }
public class convertToDecimal
     {
           public static void main(String[] args)
                {
                  Decimal obj=new Decimal();
                  int bin=obj.binary();
                  if(bin>=0)
                    System.out.println(bin);
                  int hex=obj.hexadecimal();
                  System.out.println(hex);
                  int oct=obj.octal();
                  System.out.println(oct);
                }
     }
