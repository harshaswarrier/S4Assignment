package sci;
import java.lang.Math.*;
public class angle{
	public double dtor(double degree){
		double radian=(degree*Math.PI)/180;
		return radian;
	}
	public double dtog(double degree){
		double grad=(9/10)*degree;
		return grad;
	}
	public double rtog(double radian){
		double grad=(radian*200)/Math.PI;
		return grad;
	}
	public double rtod(double radian){
		double degree=(radian*180)/Math.PI;
		return degree;
	}
	public double gtod(double grad){
		double degree=(10/9)*grad;
		return degree;
	}
	public double gtor(double grad){
		double radian=(grad*Math.PI)/200;
		return radian;
	}
}	
