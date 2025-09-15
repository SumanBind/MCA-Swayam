

import java.util.Scanner;

public class ReverseBitsEx
 {
    public int reverseBits(int n)
     {
        int result = 0;
        for (int i = 0; i < 32; i++)
         {
            result <<= 1;       
            result |= (n & 1);  
            n >>= 1;           
        }
        return result;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       ReverseBitsEx ob = new ReverseBitsEx();

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int reversed = ob.reverseBits(num);

        System.out.println("Original Number: " + num);
       
        System.out.println("Reversed Number: " + reversed);
        

        sc.close();
    }
}
