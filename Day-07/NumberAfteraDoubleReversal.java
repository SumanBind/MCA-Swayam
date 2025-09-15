
import java.util.*;
class NumberAfteraDoubleReversal

{
    public static int Reverse(int n)
    {
        int rev=0;
        while(n!=0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev;
    }
    public boolean isSameAfterReversals(int num) 
    {
        int n1=Reverse(Reverse(num));
        if(n1==num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        NumberAfteraDoubleReversal ob= new NumberAfteraDoubleReversal();
        boolean result =ob.isSameAfterReversals(n);
        System.out.println("Is same after two reversals " + result);
    }
}
