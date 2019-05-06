import java.io.*;
public class integration
{
    	public static void main()
  	  {
        		try
        		{
           			 /*Input the values*/
           			 InputStreamReader read=new InputStreamReader(System.in);
           			 BufferedReader in=new BufferedReader(read);
            			System.out.println("Enter the polynomial expression in the format: a1x^p1+a2x^p2....");
           		                        System.out.println("Where a1,a2,...an belongs to integers(if 1 still should be specified as 1 and if negative number with the minus sign) ");
            			System.out.println("Where p1,p2,...pn belongs to integers(if 1 still should be specified as 1 and if negative number with the minus sign) ");
            			System.out.println("Ex: 3x^2+-4x^-2+8x^1+-1");
           		                        String poly=in.readLine();
            			System.out.println("Enter 1.Indefinite Integration");
            			System.out.println("Enter 2.Definite Integration");
           		                        int ch=Integer.parseInt(in.readLine());;
            
          			  /*Declaration and initialization of necessary variables*/
           			 int i,j=0;
            		                        double result=0.0,coeff=0.0;
           		                        int c[] = new int[100];
            		                        int p[] = new int[100];
                
            		                        String t[]=poly.split("\\+");
          
             			/*creating coefficient array*/
           			 for(i=0;i<t.length;i++)
            			{
               				 if(t[i].contains("x")) 
                				 { 
                   					 String a[]=t[i].split("x");
                    					 c[j]=Integer.parseInt(a[0]);
                  					  j++;
               				 }
               				 else 
                				{
                   					 c[j]=Integer.parseInt(t[i]);
                   					  j++;
               			                        }
           			 }
           			 j=0;
           
           			/*creating index(power) array*/
           			 for(i=0;i<t.length;i++)
           			 {
              				  if(t[i].contains("x"))
                				 {
                   					 String a[]=t[i].split("\\^");
                    					 p[j]=Integer.parseInt(a[1]);
                   					 j++;
              				 }
                				else 
               				 {
                    					p[j]=0;
                   					 j++;
                				}
           			 }
            
           			 int l=t.length; 	
          
            			for(i=0;i<t.length-1;i++)
            			{
                				if(p[i]==p[i+1])
               				 {
                    					c[i]=c[i]+c[i+1];
                   					 l=l-1;
                				}
            			}
            
           			/*Indefinite integral calculation and display of the result*/
            			if(ch==1)
            			{
                				for(i=0;i<l;i++)
                				{
                   			 		if((p[i]+1)==0)
                    					{
                        					if(i!=l-1)
                        					System.out.print(c[i]+" log(x) + ");
                        					else
                        					System.out.print(c[i]+" log(x) +C");
                    					}
                    					else
                   	 				{
                        					coeff=((double)c[i]/(p[i]+1));
                        					if(i!=l-1)
                        					System.out.print(coeff+" x^"+(p[i]+1)+" + ");
                        					else
                        					System.out.print(coeff+" x^"+(p[i]+1)+" +C");
                    					}
                				}
                				System.out.println();
            			}
           
             			/*Definite integral calculation and display of the result*/
            			else if(ch==2)
            			{
                				int f=0;
                				System.out.println("Enter the lower limit");
               		 		int l1=Integer.parseInt(in.readLine());
                				System.out.println("Enter the upper limit");
                				int l2=Integer.parseInt(in.readLine());
                				for(i=0;i<l;i++)
                				{
                    					if((p[i]+1)!=0)
                   		 			{
                        					coeff=((double)c[i]/(p[i]+1));
                        					result=result+coeff*((double)Math.pow(l2,p[i]+1)-(double)Math.pow(l1,p[i]+1));
                    					}
                    					else
                    					{
                       						if(l1==0||l2==0)
                       						{
                           						System.out.println("log(0) undefined; the integral diverges ");
                           						f=1;
                       	 					}
                       						else
                           						result=result+c[i]*((double)Math.log(l2)-(double)Math.log(l1));
                    					}
                				}
                				if(f!=1)
                				System.out.println("Answer = "+result);
            			}
            			else
            				System.out.println("Invalid Choice");
        		}
        		catch (NumberFormatException e) 
        		{ 
            			System.out.println("Input in invalid format !"); 
        		} 
        		catch (IOException e) 
        		{ 
            			System.out.println("Input in invalid format !"); 
        		} 
    	}
}
        

