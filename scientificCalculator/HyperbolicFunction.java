 package scientificCalculator ;
 
 import java.util.Scanner;
 
 class HyperbolicFunction
{
    
	public static double HyperbolicFunction() {
	    double e=2.7182818284590452353602874713527;
	    String strOfExpo = Double.toString(e);
	    double Answer;
	    
	    Please type in the desired value in the parameter of Menu() 
	    
	    Answer=Menu(5);
	    String strOfAnswer = Double.toString(Answer);
	    return Answer;
	        
	                                        }
	    
	 Below is Sine Hyperbolic Function   
		
	 public static double Sinh(int x ){
	        double e=2.7182818284590452353602874713527;
	        double Ans;
	        Ans = ( ( (Math.pow(e,x)) -   (1(Math.pow(e,x)) ) )2 );
	        String strOfExpo = Double.toString(Ans);
	        return Ans;
	     
	                                   }
	 
	 Below is the Cosine Hyperbolic function
	 
	  public static double Cosh(int x ){
	        double e=2.7182818284590452353602874713527;
	        double Ans;
	        Ans = ( ( (Math.pow(e,x)) + (1(Math.pow(e,x)) ) )2 );
	        String strOfExpo = Double.toString(Ans);
	        return Ans;
	     
	                                    }
	 
	 Below is the Menu Function
	 
	 public static double Menu(int x ){
	    int choice ;
	    double ANS=0 ;
	    System.out.println( Which Hyperbolic Function Do You Need );
	    System.out.println( 1.SinH );
	    System.out.println( 2.CosH );
	    System.out.println( 3.TanH );
	    System.out.println( 4.CosecH );
	    System.out.println( 5.Sec );
	    System.out.println( 6.CotH );
	   Scanner in = new Scanner(System.in);
	   choice = in.nextInt();
	   switch (choice) {
	       case 1  ANS = Sinh(x);
	                break;
	       case 2  ANS = Cosh(x);
	                break;
	       case 3  ANS = (Sinh(x)Cosh(x));
	                break;
	       case 4  ANS = (1Sinh(x));
	                break;
	       case 5  ANS =(1Cosh(x));
	                break;
	       case 6  ANS = (Cosh(x)Sinh(x));
	                break;
	       default System.out.print(Invalid Input !!);         
	      } 
	   
	      return ANS ;
	    
	                                }
	 

    
}
 

