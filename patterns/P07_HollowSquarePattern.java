/*

* * * * *
*       *
*       *
*       *
* * * * *

*/

import java.util.Scanner;
public class P07_HollowSquarePattern 
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)//or n-r+1
            {
                if(i==1 || i==n || j==1 || j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

/*

* * * * *
*       *
*       *
*       *
* * * * *

*/
