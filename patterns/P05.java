public class P05
{
    static void main()
    {
        int n = 5;

        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)//or n-r+1
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*

* * * * * 
* * * * 
* * * 
* * 
* 

*/