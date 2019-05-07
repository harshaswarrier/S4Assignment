import java.util.*;
import java.lang.Math;
public class Differentiation
{
	public static int diff(String poly,int num,int s) {
		
            
            int i,j=0,k,result=0;
	        int c[] = new int[100];
	        int p[] = new int[100];
		String t[]=poly.split("\\+|-");
		for(i=0;i<t.length;i++)
		{
		      if(t[i].contains("x")) { 
		      String a[]=t[i].split("x");
		      c[j]=Integer.parseInt(a[0]);
		       j++;}
		       else {
		               c[j]=0;
		               j++;
		       }
		}
		j=0;
		for(i=0;i<t.length;i++)
		{
		        if(t[i].contains("x")){
		       String a[]=t[i].split("\\^");
		       p[j]=Integer.parseInt(a[1]);
		       j++;
		        }
		        else {
		               p[j]=0;
		               j++;
		       }
		}
		int l=0;
		for(k=0;c[k]!='\0';k++){
		    l++;    
		}
		if(s==1){
		       for(i=0;i<l;i++){
		               if(p[i]==1)
		               {
		                  System.out.print(c[i]*p[i]);     
		               }
		               else if(p[i]==2){
		                       System.out.print(c[i]*p[i]+"x");
		               }
		               else{
		               System.out.print(c[i]*p[i]+"x^"+(p[i]-1));}
		               if(i>=l||i+1!=l){
		                       System.out.print("+");
		               }
		               else{
		                       System.out.print("");
		               }
		       } 
		}
		else{
		for(i=0;i<l;i++)
		{
		        result=result+c[i]*p[i]*(int) Math.pow(num,p[i]-1);
		}}
		return result;
	}
        public static void main(String[] args){
                int d;
                	System.out.println("1.Final expression");
			System.out.println("2.Final value");
			Scanner s=new Scanner(System.in);
			Scanner scan = new Scanner(System.in);
			int g = scan.nextInt();
			String poly=s.nextLine();
			if(g!=1){
			System.out.println("X:");
			int num = scan.nextInt();
			 d=diff(poly,num,g);}
			else{
			    d=diff(poly,9,g);     
			}
			
			if(g!=1){
			        System.out.println(d);
			}
        }

}
OUTPUT:


1.Final expression                                                                                                                                                                                                     
2.Final value                                                                                                                                                                                                          
1                                                                                                                                                                                                                      
3x^2+2x^1+8                                                                                                                                                                                                            
6x+2                                                                                                                                                                                                                   
      
1.Final expression                                                                                                                                                                                                     
2.Final value                                                                                                                                                                                                          
2                                                                                                                                                                                                                      
3x^2+3x^1+8                                                                                                                                                                                                            
X:                                                                                                                                                                                                                     
1                                                                                                                                                                                                                      
9     



