class GCD_LCM
{

    //GCD by Euclidean Formula---> gcd(a,b)=gcd(b,a%b)

    static int getGCD(int a, int b)
    {
        while(b!=0)
        {
            int original_b=b;
            b=a%b;
            a=original_b;
        }
        int ans = a;
        return ans;
    }

    //LCM

    static int getLCM(int a, int b)
    {
        int gcd = getGCD(a, b);
        int product = a*b;
        int lcm = product/gcd;
        return lcm;
    }



    public static void main(String[] args)
    {
        // System.out.println("GCD is "+getGCD(12,18));
        System.out.println("LCM is "+getLCM(12,18));
    }
}