import java.util.Scanner;
public class P06_SolidPyramidPattern 
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            //for spaces
            for(int j=1;j<=n-i;j++)//or n-r+1
            {
                System.out.print("  ");
            }
            //for *
            for(int j=1;j<=2*i-1;j++)//or n-r+1
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*

      *
    * * *
  * * * * *
* * * * * * *

*/
