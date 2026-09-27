import java.util.Scanner;

public class Reverse {
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

        //Reverse the array
        int start = 0, end = a.length - 1;
        while (start < end)
        {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

        //Display the numbers after reverse
        System.out.println("The numbers after reversing are:");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
