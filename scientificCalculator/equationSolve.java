package scientficCalculator;
import java.util.Scanner;
class equationSolve{

  public static double[][] equationSolve()
  {
    int n;
    System.out.println("Enter number of variables:");
    Scanner sc = new Scanner(System.in);
    n= sc.nextInt();
    char ch = 'a';
    int l = (int)ch;
    ch=(char)l;
    double b[][] = new double[n][1];
    double a[][] = new double[n][n];
    for(int i=0;i<n;i++)
    {
        System.out.println("eqn"+(i+1)+":");
        for(int j=0;j<n;j++)
        {

          System.out.println((char)(l)+":");
          a[i][j]=sc.nextDouble();
          l+=1;
        }
        System.out.println((char)l+":");
        b[i][0]=sc.nextDouble();
        l='a';

    }

    double k[][] = invert(a);
    double x[][] = new double[n][1];
    x= multiply(k,b,n);

    //
    // for(int i=0;i<n;i++)
    // {
    //   for(int j=0;j<1;j++)
    //   {
    //     System.out.println(x[i][j]);
    //   }
    // }
  //   int flag = 0 , sum =0;
  //   for(int i =0;i<n;i++)
  //   {
  //     for(int j=0;j<n;j++)
  //     {
  //       sum+=a[i][j]*x[j][0];
  //     }
  //     if(sum!=b[i][0])
  //       flag =1;
  //     sum=0;
  //   }
  //   if(flag == 1 )
  //     System.out.println("Error");
  //
  //
  return x;
}




    public static double[][] invert(double a[][])
   {
       int n = a.length;
       double x[][] = new double[n][n];
       double b[][] = new double[n][n];
       int index[] = new int[n];
       for (int i=0; i<n; ++i)
           b[i][i] = 1;

// Transform the matrix into an upper triangle
       gaussian(a, index);

// Update the matrix b[i][j] with the ratios stored
       for (int i=0; i<n-1; ++i)
           for (int j=i+1; j<n; ++j)
               for (int k=0; k<n; ++k)
                   b[index[j]][k]
                         -= a[index[j]][i]*b[index[i]][k];

// Perform backward substitutions
       for (int i=0; i<n; ++i)
       {
           x[n-1][i] = b[index[n-1]][i]/a[index[n-1]][n-1];
           for (int j=n-2; j>=0; --j)
           {
               x[j][i] = b[index[j]][i];
               for (int k=j+1; k<n; ++k)
               {
                   x[j][i] -= a[index[j]][k]*x[k][i];
               }
               x[j][i] /= a[index[j]][j];
           }
       }
       return x;
   }

// Method to carry out the partial-pivoting Gaussian
// elimination.  Here index[] stores pivoting order.

   public static void gaussian(double a[][], int index[])
   {
       int n = index.length;
       double c[] = new double[n];

// Initialize the index
       for (int i=0; i<n; ++i)
           index[i] = i;

// Find the rescaling factors, one from each row
       for (int i=0; i<n; ++i)
       {
           double c1 = 0;
           for (int j=0; j<n; ++j)
           {
               double c0 = Math.abs(a[i][j]);
               if (c0 > c1) c1 = c0;
           }
           c[i] = c1;
       }

// Search the pivoting element from each column
       int k = 0;
       for (int j=0; j<n-1; ++j)
       {
           double pi1 = 0;
           for (int i=j; i<n; ++i)
           {
               double pi0 = Math.abs(a[index[i]][j]);
               pi0 /= c[index[i]];
               if (pi0 > pi1)
               {
                   pi1 = pi0;
                   k = i;
               }
           }

  // Interchange rows according to the pivoting order
           int itmp = index[j];
           index[j] = index[k];
           index[k] = itmp;
           for (int i=j+1; i<n; ++i)
           {
               double pj = a[index[i]][j]/a[index[j]][j];

// Record pivoting ratios below the diagonal
               a[index[i]][j] = pj;

// Modify other elements accordingly
               for (int l=j+1; l<n; ++l)
                   a[index[i]][l] -= pj*a[index[j]][l];
           }

         }
       }
      public static double[][] multiply(double first[][] , double second[][],int n)
      {
        double multiply[][] = new double[n][1];

        int c,d,k,m=n,q=1,p=n;
        double sum=0;
        for (c = 0; c < m; c++)
         {
            for (d = 0; d < q; d++)
            {
               for (k = 0; k < p; k++)
               {
                 sum=sum+first[c][k]*second[k][d];

               }
               multiply[c][d]=sum;
               sum=0;
            }
         }
         return multiply;
      }

}
