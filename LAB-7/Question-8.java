/*Write a Java program to illustrate try, catch, and finally 
 block.*/
 
import java.util.Scanner;
public class program8_8 {
    public static void main(String[] args) {
        try{ 
            System.out.println("This program will print the result of a/b");
            Scanner sc = new Scanner(System.in); 
            System.out.print("Enter value of a: ");
            int data1 = sc.nextInt();
            System.out.print("Enter value of b: ");
            int data2 = sc.nextInt();  
            sc.close();
            System.out.println(data1/data2);            
        }  
        catch(ArithmeticException e){ 
        } 
        finally{
            System.out.println("Inside finally block");
        }  
        System.out.println("Rest of the Code");  
    }  
}
