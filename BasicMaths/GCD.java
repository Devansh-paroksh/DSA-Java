class GCD
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
    public static void main(String[] args)
    {
        System.out.println(getGCD(12,18));
    }
}