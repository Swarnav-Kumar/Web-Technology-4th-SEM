/*Write a java program to justify “A subclass exception 
 must appear before super-class exception”.*/
 
 public class program8_6 {
    public static void main(String[] args) {
        try{
            int result = 5/0;
            System.out.println("Result is: "+result);
        }
        catch(ArithmeticException e2){
            System.out.println("Subclass ArithmeticException Occured");
        }
        catch(Exception e1){
            System.out.println("Superclass Exception Occured");
        }
        System.out.println("Rest of the Code");
    }
}
