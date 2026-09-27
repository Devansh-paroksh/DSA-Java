import java.util.Scanner;

public class Basic1 {
    static void main()
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }

        //Display the numbers
        System.out.println("The numbers are:");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
