package scientificCalculator;
import java.lang.Math.*;
 
class InverseTrig {
 

        public static void sininv(double a){
	 
        System.out.println(Math.asin(a)*180/Math.PI);          //Math.asin returns in radian, so it is converted into degree
        }


        public static void cosinv(double b){
        System.out.println(Math.acos(b)*180/Math.PI);          //Math.acos returns in radian, so it is converted into degree
        }


        public static void taninv(double c){
        System.out.println(Math.atan(c)*180/Math.PI);          //Math.atan returns in radian, so it is converted into degree
    }
    public static void main(String args[])
    { 
       double d= Double.parseDouble(args[1]);
        if (args[0].equals("arcsin"))
         { 
           if (d <= -1 && d >= 1)                             //domain of sineinverse is -1 to 1
               {
                 System.out.println("Invalid Input");
                }
            else 
		{ sininv(d);}
          
        }

      

       if (args[0].equals("arccos"))
         {
            if (d < -1 && d > 1)                              //domain of cosinverse is -1 to 1
               {
                 System.out.println("Invalid Input");
                }
            else
          cosinv(d);
        }
     

        if (args[0].equals("arctan"))
         {
          taninv(d);                                         //domain of taninverse is -infinite to infinite, hence no conditions needed
        }    
    }
}
