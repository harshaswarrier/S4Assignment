import java.util.*;
import java.lang.*;

class ComplexMD {

    public static String complexNumberMD(String s) {
        String str1 = "", str2 = "";
        int i, n;
        int flag = 0, count = 0;

        char[] chars = s.toCharArray();

        for (i = 0, n = chars.length; i < n; i++) {
            if (chars[i] == '(' || chars[i] == ')')
                count++;
        }

        if (count != 4) {
            return "Syntax ERROR";
        }

        for (i = 0, n = chars.length; i < n; i++) {
            if (chars[i] == '*') {
                flag = 1;
                break;
            }
            if (chars[i] == '/') {
                flag = 2;
                break;
            }

        }

        if (flag == 0) {
            return "Syntax ERROR";
        }

        String a[] = s.split("\\*|/");

        for (i = 0; i < 2; i++) {
            String b[] = a[i].split("\\(");
            String c[] = b[1].split("\\)");
            if (i == 0)
                str1 = c[0];
            else
                str2 = c[0];
        }

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        float a_real = 0, a_img = 0, b_real = 0, b_img = 0;
        float str1_real = 0, str2_real = 0, str1_img = 0, str2_img = 0;

        for (i = 1; char1[i] != '\0'; i++) {
            if (char1[i] == '+') {
                String x[] = str1.split("\\+|i");
                str1_real = Float.parseFloat(x[0]);
                str1_img = Float.parseFloat(x[1]);
                a_real = str1_real;
                a_img = str1_img;
                break;
            }

            if (char1[i] == '-') {
                String x[] = str1.split("\\-|i");
                if (char1[0] == '-') {
                    str1_real = Float.parseFloat(x[1]);
                    str1_img = Float.parseFloat(x[2]);
                    str1_real = -1 * str1_real;
                } else {
                    str1_real = Float.parseFloat(x[0]);
                    str1_img = Float.parseFloat(x[1]);
                }
                str1_img = -1 * str1_img;
                a_real = str1_real;
                a_img = str1_img;
                break;
            }
        }

        for (i = 1; char2[i] != '\0'; i++) {
            if (char2[i] == '+') {
                String y[] = str2.split("\\+|i");
                str2_real = Float.parseFloat(y[0]);
                str2_img = Float.parseFloat(y[1]);
                b_real = str2_real;
                b_img = str2_img;
                break;
            }
            if (char2[i] == '-') {
                String y[] = str2.split("\\-|i");
                if (char2[0] == '-') {
                    str2_real = Float.parseFloat(y[1]);
                    str2_img = Float.parseFloat(y[2]);
                    str2_real = -1 * str2_real;
                } else {
                    str2_real = Float.parseFloat(y[0]);
                    str2_img = Float.parseFloat(y[1]);
                }
                str2_img = -1 * str2_img;
                b_real = str2_real;
                b_img = str2_img;
                break;
            }
        }

        if (flag == 1)
            return (a_real * b_real - a_img * b_img) + " + " + (a_real * b_img + a_img * b_real) + "i";
        else if (flag == 2)
            return (a_real * b_real + a_img * b_img) / (b_real * b_real + b_img * b_img) + " + "
                    + (a_img * b_real - a_real * b_img) / (b_real * b_real + b_img * b_img) + "i";
        else
            return ("Syntax ERROR");
    }

    
}
