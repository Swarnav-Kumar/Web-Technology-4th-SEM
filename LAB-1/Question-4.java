/* WAP to calculate sum of all the numbers divisible by 3 from 0 to n. Print the sum.*/

import java.util.Scanner;
public class program1_4{
    public static void main(String arg[])
    {
        System.out.println("Enter the limit:-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=0;i<=n;i++)
        {
            if(i%3==0)
            {
                s=s+i;
            }
        }
        System.out.println("The sum of all numbers divisible by 3 is = "+s);
    }
}
