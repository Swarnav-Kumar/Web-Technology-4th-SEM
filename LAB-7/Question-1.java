/*Write a Java class which has a method called 
ProcessInput(). This method checks the number entered 
by the user. If the entered number is negative then throw 
an user defined exception called
NegativeNumberException, otherwise it displays the 
double value of the entered number.*/

import java.util.Scanner;

class NegativeNumberException extends Exception{
    private static final long serialVersionUID = 1L;
    NegativeNumberException(String s) {
        super(s);
    }
    
}
public class program8_1 {
    static void processInput(int num) throws NegativeNumberException{ 
        if(num<0)
        throw new NegativeNumberException("Number Entered is a Negative Number");  
        else
        System.out.println("The Number "+(double)num+" is Positive");
    }
    
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        try{
            int input = sc.nextInt();
            sc.close();
            processInput(input);
        } 
        catch(NegativeNumberException e){
            System.out.println("Exception Occured "+e);
        }
        System.out.println("Rest of the Code");
    }
}
