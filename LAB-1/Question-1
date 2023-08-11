/*. WAP to find out square root of a number without using library function*/

import java.util.Scanner;  

public class program1_1  
{  
    public static void main(String[] args)    
    {   
        System.out.println("Enter a number: ");  
        Scanner ob = new Scanner(System.in);   
        int n = ob.nextInt();  
        System.out.println("The square root of "+ n +" is: "+ squareRoot(n));  
    }   
    public static double squareRoot(int num)   
    {    
        double t;  
        double sqrtroot=num/2;  
        do   
        {  
            t=sqrtroot;  
            sqrtroot=(t+(num/t))/2;  
        }   
        while((t-sqrtroot)!= 0);  
        return sqrtroot;  
    }  
}
