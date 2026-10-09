/*

*
* *
*   *
*     *
* * * * *

*/
import java.util.Scanner;

public class P08_HollowRightAngledTriangle 
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)//or n-r+1
            {
                if(i==n || i==1 || i==2)
                    System.out.print("*");
                else
                    System.out.print("  ");
            }

            for(int j=1;j<=i;j++)//or n-r+1
            {
                if(i==n || i==1 || i==2)
                    System.out.print("*");
                // else
                //     System.out.print("  ");
            }
            // for(j=1;j<=i-2;j++)
            // System.out.println();
        }
    }
}

/*

*
* *
*   *
*     *
* * * * *

*/
