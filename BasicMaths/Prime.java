class Prime
{
    //Basic approach - slower
    // static boolean isPrime(int n)
    // {
    //     for(int i=2;i<=n-1;i++)
    //     {
    //         if(n%i==0)
    //             return false;
    //     }
    //     return true;
    // }

    //Faster approach
    static boolean isPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    static void printAllPrime(int n)//1 to n
    {
        for(int i=2;i<=n;i++)
        {
            boolean isPrime = isPrime(i);
            if(isPrime == true)
                System.out.println(i);
        }
    }
    public static void main(String[] args) 
    {
        System.out.println(isPrime(24));
        System.out.println("Prime numbers from 1 to n are: ");
        printAllPrime(10);
    }
}