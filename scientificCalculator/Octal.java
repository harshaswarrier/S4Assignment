import java.io.*;
import java.util.Scanner;
class Octal
     {
           Scanner in=new Scanner(System.in);
         // Binary to octal
           int bnr(int bin)
                {  
                   int n=0,decimal=0,octa=-1;
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
                          octa=deci(decimal);
                        }
                   return octa;
                }
   //Decimal to Octal
           int deci(int num)
                {
                   int octalNumber=0,i=1;
                   while (num != 0)
                   {
                    octalNumber += (num % 8) * i;
                    num /= 8;
                    i *= 10;
                   }
                   return octalNumber;
                }
  //Hexa decimal to Octal
           int hexa(String hexdec_num)
              {
                int dec_num=0, k=1;
	        System.out.println("Input a hexadecimal number: ");
                Scanner obj=new Scanner(System.in);
                hexdec_num=obj.nextLine();
                String digits = "0123456789ABCDEF";
                hexdec_num = hexdec_num.toUpperCase();
                int v=hexdec_num.length();
                int tp=0;
                     if(tp>=0)
                      {
                         for (k = 0; k < hexdec_num.length(); k++)
                             {
                               char h = hexdec_num.charAt(k);
                               if((h=='0')||(h=='1')||(h=='2')||(h=='3')||(h=='4')||(h=='5')||(h=='6')||(h=='7')||(h=='8')||(h=='9')||(h=='A')||(h=='B')||(h=='C')||(h=='D')||(h=='E')||(h=='F'))
                                 {
                                    int d = digits.indexOf(h);
                                    dec_num = 16*dec_num + d;
                                }
                               else
                                {
                                  dec_num=-1;
                                  break;
                                }
                             }
                         tp=deci(dec_num);
                        }                  
                return tp;
              }
     }
                  
//for binary and hexadecimal chekking
//if(variable storing the returned value>=0)
//print value
//else print error