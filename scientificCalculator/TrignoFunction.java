    /*To calculate values of trignometric functions - sin,cos,tan,cosec,sec,cot*/
    //import java.util.* //for the trignometric functions to work
    /*import decimalformat and rounding mode for functions to work*/
    package scientificCalculator;

    //import java.io.*;
    //import java.text.DecimalFormat;
    //import java.math.RoundingMode;
    
    class TrignoFunction {
        double inf = Double.POSITIVE_INFINITY;
        DecimalFormat df = new DecimalFormat("#.#########");        //No of digit precision, change the number of hashes to edit
           
        TrignoFunction(){
            df.setRoundingMode(RoundingMode.CEILING); 
        }
        public double sin(double deg){
            // convert degrees to radians 
            double rad = Math.toRadians(deg); 
            // sin() method to get the sine value 
            double sinValue = Math.sin(rad);   
            return Double.parseDouble(df.format(sinValue));
        }    
        public double cos(double deg){
            // convert degrees to radians 
            double rad = Math.toRadians(deg); 
            double cosValue = Math.cos(rad); 
            return Double.parseDouble(df.format(cosValue));
        }    
        public double tan(double deg){
            // convert degrees to radians 
            double rad = Math.toRadians(deg); 
            if(deg%90.0==0){
                return inf;
            }
            double tanValue = Math.tan(rad);   
            return Double.parseDouble(df.format(tanValue));
        }    
        public double cosec(double deg){
            // convert degrees to radians 
            double rad = Math.toRadians(deg); 
            double sinValue = Math.sin(rad);   
            if(sinValue==0.0){
                return inf;
            }    
            return Double.parseDouble(df.format(1/sinValue));
        }    
        public double sec(double deg){
            // convert degrees to radians 
            double rad = Math.toRadians(deg); 
            double cosValue = Math.cos(rad);
            if(cosValue==0.0){
                return inf;
            }
            return Double.parseDouble(df.format(1/cosValue));
        }    
        public double cot(double deg){
            // convert degrees to radians 
            double rad = Math.toRadians(deg); 
            double tanValue = tan(deg);
            if(tanValue==0.0){
                return inf;
            }   
            return Double.parseDouble(df.format(1/tanValue));
        }    
    }