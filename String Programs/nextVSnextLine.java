import java.util.Scanner;

class nextVSnextLine
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string to test next method");
        String s1 = sc.next();
        System.out.println("String entered via next is "+s1);
        System.out.println("Enter the string to test nextLine method");
        String s2 = sc.nextLine();
        System.out.println("String entered via nextLine is "+s2);

        //Abnormal condition

        // System.out.println("Enter the number");
        // int n = sc.nextInt();
        // System.out.println("Entered via nextInt is "+n);
        // System.out.println("Enter the string to test nextLine method");
        // String s2 = sc.nextLine();
        // System.out.println("String entered via nextLine is "+s2);

        //Fix of abnormal condition 

        // System.out.println("Enter the number");
        // int n = sc.nextInt();
        // System.out.println("Entered via nextInt is "+n);
        // sc.nextLine();
        // System.out.println("Enter the string to test nextLine method");
        // String s2 = sc.nextLine();
        // System.out.println("String entered via nextLine is "+s2);
    }
}