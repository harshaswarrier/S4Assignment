
 /*
 		 
   	To calculate logs for any number base.

	import java.lang.Math  - for calculating power of numbers  
   	Syntax : result = object.log(x);
   		 result = object.log(x,y);
  		 
		 1st method is used to find natural logarithm of a number and 2nd method is used to find logarithm of a number with custom base.
			
		 result : calculated value.
			
		 object : object of class ln.

		 x : number whose log has to be found

		 y : custom base for log
 */
	
package scientificCalculator;
import java.lang.Math;
import java.util.*;	

class ln
{

//	Function to calculate natural logarithm of a number. 
//	The same can be obtained with java.lang.Math.log() method.
//	Usage : Math.log(x);

	public static double log(float v)
	{
		double p=1000000000;
		return (p*(Math.pow(v,1/p)-1)); 
	}
	

//	Function to calculate logs for any number base.

	public static double log(float v, int b)
	{
		return (log(v)/log(b));  	// Usage of identity logb x = ln x / ln b
	}
}
